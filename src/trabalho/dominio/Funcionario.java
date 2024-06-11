package trabalho.dominio;

public class Funcionario extends Usuario{

	private String cargo;
	private String endereco;
	private Character turno;
	
	public Funcionario() {
	}
	
	public Funcionario(String cargo, String endereco, Character turno) {
		this.cargo = cargo;
		this.endereco = endereco;
		this.turno = turno;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTurnoString() {
		switch (this.turno){
		case 'D': 
			return "Diurno";
		case 'N':
			return "Noturno";
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.turno);
		}
	}

	public void setTurno(Character turno) {
		if (turno == 'D' || turno == 'N') { // D = Diurno | N = Noturno
			this.turno = turno;
		} else {
			 setTipoUsuario('0'); // Define o usuário como 0 BLOQUEADO, caso não definido locatário ou proprietário
		}
		
	}
	
}
