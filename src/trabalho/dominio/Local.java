package trabalho.dominio;

public class Local {
	
	private Integer idLocal;
	private String nome;
	private String tipo;
	private String logradouro;
	private String bairro;
	private String numero;
	private String cidade;
	private String uf; 
	private String descricao;
	private Integer lotacaoMax;
	private String estrutura;
	private static int ultimoId = 0;
	
	public Local() {	
	}
	
	public Local(Integer id_local,String nome,String tipo, String logradouro,String bairro, String numero,String cidade,
	String uf,String descricao, Integer lotacaoMax, String estrutura) {
		
		this.idLocal=gerarNovoId();
		this.nome=nome;
		this.tipo=tipo;
		this.logradouro=logradouro;
		this.bairro=bairro;
		this.bairro=bairro;
		this.numero=numero;
		this.cidade=cidade;
		this.uf=uf;
		this.descricao=descricao;
		this.lotacaoMax=lotacaoMax;
		this.estrutura=estrutura;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public Integer getIdLocal() {
		return idLocal;
	}

	public void setId_local(Integer idLocal) {
		this.idLocal = gerarNovoId();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDescricao() {
		return descricao;
	}

	public void seDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getLotacaoMax() {
		return lotacaoMax;
	}

	public void setLotacaoMax(Integer lotacaoMax) {
		this.lotacaoMax = lotacaoMax;
	}

	public String getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
	}
	
	@Override
    public boolean equals(Object obj) {
     
        if (!(obj instanceof Local))
            return false;
        Local outroLocal = (Local) obj;
      
        if (this.getIdLocal().equals(outroLocal.getIdLocal()))
            return true;
        else
            return false;
    }
 
    @Override
    public int hashCode() {
        int hashCode = this.getIdLocal().hashCode();
        return hashCode;
    }
   
    @Override
    public String toString() {
        return this.getNome();
    }
    
 // Gerando um id e incrementando após a exibição
    private static synchronized int gerarNovoId() {
    	return ++ultimoId;
    }
}	
