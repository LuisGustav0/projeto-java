package com.atentatecnologia.modulos.produto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.atentatecnologia.modulos.marca.MarcaTO;
import com.atentatecnologia.modulos.produto.enums.TipoProduto;

@Entity
@Table(name = "produto")
public class ProdutoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long codigo;
	private String nome;
	private MarcaTO marcaTO;
	private TipoProduto tipoProduto;
	private int valor;
	private Date dataValidade;

	@Id
	@GeneratedValue
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@Column(nullable = false, length = 80)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@ManyToOne
	@JoinColumn(name = "marca_codigo", nullable = false)
	public MarcaTO getMarcaTO() {
		return marcaTO;
	}

	public void setMarcaTO(MarcaTO marcaTO) {
		this.marcaTO = marcaTO;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_produto", nullable = false, length = 20)
	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	@Column(nullable = false, length = 11)
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_validade", nullable = false)
	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
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
		ProdutoTO other = (ProdutoTO) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
