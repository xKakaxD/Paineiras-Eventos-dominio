package trabalho.dominio;

import java.util.Date;

/**
 * 
 * Nossa classe de modelo do objeto que "sofrerá" as operações de CRUD
 *
 */
public class Conta {

	private int id;
	private String credor;
	private String descricao;
	private Date dataVencimento;

	// gets e sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String concessionaria) {
		this.credor = concessionaria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}