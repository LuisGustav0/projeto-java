package com.atentatecnologia.modulos.geladeira;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraTO;

@Entity
@Table(name = "geladeira")
public class GeladeiraTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long codigo;
	private List<ItemGeladeiraTO> itens = new ArrayList<>();

	@Id
	@GeneratedValue
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@OneToMany(mappedBy = "geladeiraTO", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<ItemGeladeiraTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemGeladeiraTO> itens) {
		this.itens = itens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeladeiraTO other = (GeladeiraTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
