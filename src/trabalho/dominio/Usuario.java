package trabalho.dominio;

public class Usuario {
	private Integer idUsuario;
	private String nome;
	private String senha;
	private String cpf;
	private String email;
	private String endereco;
	private String dataNascimento;
	private String dataAniversario;
	private Character genero;
	private String GeneroString;
	private static int ultimoId = 0;
	
	public Usuario() {
	}
	
	public Usuario(Integer idUsuario, String nome, String cpf, 
			String senha, String email, String endereco, String dataNascimento,
			Character genero) {
		this.idUsuario = gerarNovoId();
		this.nome=nome;
		this.cpf=cpf;
		this.senha=senha;
		this.email=email;
		this.endereco=endereco;
		this.dataNascimento=dataNascimento;
		this.dataAniversario= dataAniversario();
		this.genero=genero;
		this.GeneroString=getGeneroString();
	}

	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = gerarNovoId();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}  
	
	public String getDataNascimento() {
		return dataNascimento;
	}
		
	public String getDataAniversario() {
		return dataAniversario;
	}
	
	public void setDataNascimento(String dataNascimento) {
	    this.dataNascimento = dataNascimento;
	    this.dataAniversario = dataAniversario(); // Atualiza a data de aniversário quando a data de nascimento é definida
	}

	// Método para calcular a idade a partir da data de nascimento
	public String dataAniversario() {
		String[] partesData = dataNascimento.split("/");
        return partesData[0] + "/" + partesData[1]; // Retorna apenas dia/mês
	}
	
	// Certifique-se de definir o gênero como char ('0', '1' ou '2')
    public void setGenero(Character genero) {
        if (genero == '0' || genero == '1' || genero == '2') {
            this.genero = genero;
        } else {
            this.genero = '0'; // Defina como '0' se o valor não for válido
        }
    }

    // Método para retornar o gênero como uma string legível
    public String getGeneroString() {
        switch (this.genero) {
            case '1':
                return "Masculino";
            case '2':
                return "Feminino";
            default:
                return "Outros";
        }
    }
	
	// Sobrescrevendo o método equals para comparar objetos da classe Usuario
    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto passado é uma instância de Usuario
        if (!(obj instanceof Usuario))
            return false;
        Usuario outroCliente = (Usuario) obj;
        // Compara os CPFs dos usuários para determinar igualdade
        if (this.getCpf().equals(outroCliente.getCpf()))
            return true;
        else
            return false;
    }
    
	// Sobrescrevendo o método hashCode para gerar um código único baseado no CPF do usuário
	@Override
	public int hashCode() {
		int hashCode = this.getCpf().hashCode();
		return hashCode;
	}
	
	
	// Sobrescrevendo o método toString para retornar o nome do usuário
	@Override
	public String toString() {
		return this.getNome();
	}
	
	// Gerando um id e incrementando antes da exibição pois começa no 0
	private static synchronized int gerarNovoId() {
        return ++ultimoId;
    }
	

}
