package com.atentatecnologia.modulos.geladeira.item;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.atentatecnologia.modulos.geladeira.GeladeiraTO;
import com.atentatecnologia.modulos.mercado.MercadoTO;
import com.atentatecnologia.modulos.produto.ProdutoTO;

@Entity
@Table(name = "item_geladeira")
public class ItemGeladeiraTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long codigo;
	private Date data;
	private MercadoTO mercadoTO;
	private GeladeiraTO geladeiraTO;
	private ProdutoTO produtoTO;
	private boolean isConsumido;

	@Id
	@GeneratedValue
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@ManyToOne
	@JoinColumn(name = "mercado_codigo", nullable = false)
	public MercadoTO getMercadoTO() {
		return mercadoTO;
	}

	public void setMercadoTO(MercadoTO mercadoTO) {
		this.mercadoTO = mercadoTO;
	}

	@ManyToOne
	@JoinColumn(name = "geladeira_codigo", nullable = false)
	public GeladeiraTO getGeladeiraTO() {
		return geladeiraTO;
	}

	public void setGeladeiraTO(GeladeiraTO geladeiraTO) {
		this.geladeiraTO = geladeiraTO;
	}

	@ManyToOne
	@JoinColumn(name = "produto_codigo", nullable = false)
	public ProdutoTO getProdutoTO() {
		return produtoTO;
	}

	public void setProdutoTO(ProdutoTO produtoTO) {
		this.produtoTO = produtoTO;
	}

	public boolean isConsumido() {
		return isConsumido;
	}

	public void setConsumido(boolean isConsumido) {
		this.isConsumido = isConsumido;
	}
	
	@Transient
	public String getMercado() {

		return this.getMercadoTO().getCodigo() + " - " + this.getMercadoTO().getNome();
	}

	@Transient
	public String getProduto() {

		return this.getProdutoTO().getCodigo() + " - " + this.getProdutoTO().getNome();
	}
	
	@Transient
	public String getMarcaProduto() {

		return this.getProdutoTO().getMarcaTO().getCodigo() + " - " + this.getProdutoTO().getMarcaTO().getNome();
	}

	@Transient
	public String getProdutoConsumido() {

		return this.isConsumido() ? "Sim" : "Não";
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
		ItemGeladeiraTO other = (ItemGeladeiraTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
