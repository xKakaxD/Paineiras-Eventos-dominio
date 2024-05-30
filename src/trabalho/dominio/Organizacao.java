package trabalho.dominio;

public class Organizacao {
	private Integer idOrganizacao;
	private String nome;
	private String cnpj;
	private String endereco;
	private String email;
	private static int ultimoId = 0;
	
	public Organizacao() {	
	}
	
	public Organizacao(Integer IdOrganizacao,String nome,String cnpj,String endereco, String email ) {
		this.idOrganizacao=gerarNovoId();
		this.nome=nome;
		this.cnpj=cnpj;
		this.endereco=endereco;
		this.email=email;
	}

	public Integer getIdOrganizacao() {
		return idOrganizacao;
	}

	public void setIdOrganizacao(Integer IdOrganizacao) {
		this.idOrganizacao = gerarNovoId();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (this.cnpj.length() == 14) {
			this.cnpj = cnpj;
		}else
			System.out.println("Insira um valor válido de CNPJ");
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        // Verifica se o objeto passado é uma instância de Organizacao
	        if (!(obj instanceof Organizacao))
	            return false;
	        Organizacao outraOrganizacao = (Organizacao) obj;
	        // Compara os CNPJ das organizações para determinar igualdade
	        if (this.getCnpj().equals(outraOrganizacao.getCnpj()))
	            return true;
	        else
	            return false;
	    }
	 
	 
	    // Sobrescrevendo o método hashCode para gerar um código único baseado no CNPJ da Organização
	    @Override
	    public int hashCode() {
	        int hashCode = this.getCnpj().hashCode();
	        return hashCode;
	    }
	    // Sobrescrevendo o método toString para retornar o nome da ORganização
	    @Override
	    public String toString() {
	    	return this.getNome();
	    }
	    
	    // Gerando um id e incrementando antes da exibição pois começa no 0
		private static synchronized int gerarNovoId() {
	        return ++ultimoId;
	    }

}