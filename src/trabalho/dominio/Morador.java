package trabalho.dominio;

public class Morador extends Usuario{

	private Integer bloco;
	private Integer apartamento;
	private Character tipoResidente; 
	
	public Morador() {
	}
	
	public Morador(Integer bloco, Integer apartamento, Character tipoResidente) {
		this.bloco = bloco;
		this.apartamento = apartamento;
		this.tipoResidente = tipoResidente;
		
	}

	public Integer getBloco() {
		return bloco;
	}

	public void setBloco(Integer bloco) {
		this.bloco = bloco;
	}

	public Integer getApartamento() {
		return apartamento;
	}

	public void setApartamento(Integer apartamento) {
		this.apartamento = apartamento;
	}

	public String getTipoResidenteString() {
		switch (this.tipoResidente){
		case '1': 
			return "Proprietário";
		case '2':
			return "Locatário";
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.tipoResidente);
		}
	}

	public void setTipoResidente(Character tipoResidente) {
		if (tipoResidente == '1' || tipoResidente == '2') { // 1 Proprietário | 2 Locatário
			this.tipoResidente = tipoResidente;
		} else {
			setTipoUsuario('0'); // Define o usuário como 0 BLOQUEADO, caso não definido locatário ou proprietário
		}
		
	}
	
	
}
