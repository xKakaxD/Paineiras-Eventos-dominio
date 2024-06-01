package trabalho.dominio;

import java.sql.Time;
import java.util.Date;

public class Agendamento extends Evento{
	
	private Double valorEvento;
	private Date dataConfirmacao;
	private Time horaConfirmacao;
	private Character status;
	
	public Agendamento() {	
	}
	
	public Agendamento(Double valorEvento, Date dataConfirmacao, Time horaConfirmacao, Character status) {
		this.valorEvento=valorEvento;
		this.dataConfirmacao=dataConfirmacao;
		this.horaConfirmacao=horaConfirmacao;
		this.status=status;
	}

	public Double getValorEvento() {
		return valorEvento;
	}

	public void setValorEvento(Double valorEvento) {
		this.valorEvento = valorEvento;
	}

	public Date getDataConfirmacao() {
		return dataConfirmacao;
	}

	public void setDataConfirmacao(Date dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}

	public Time getHoraConfirmacao() {
		return horaConfirmacao;
	}

	public void setHoraConfirmacao(Time horaConfirmacao) {
		this.horaConfirmacao = horaConfirmacao;
	}

	public String getStatus() {
		switch (this.status){
		case '1': 
			return "Aprovado";
		case '2':
			return "Reprovado";
		case '3':
			return "Pendente";
		case '4':
			return "Cancelado";
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.status);
		}
	}

	public void setStatus(Character status) {
		if (status == '1' || status == '2' || status == '3') {  // 1 APROVADO || 2 REPROVADO || 3 PENDENTE || 4 CANCELADO
			this.status = status;
		} else {
			 setStatus('4'); // Define o status como cancelado caso não seja epecificado (o que não deve ocorrer)
		}
		
	}
}
