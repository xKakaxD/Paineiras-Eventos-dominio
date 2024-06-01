package trabalho.dominio;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class Evento{
	
	private Integer idEvento;
	private String categoria; 
	private Date dataAgendada;
	private Time horarioInicio;
	private Time horarioFinal;
	private Time duracao;
	private Integer qtdPessoas;
	private String estrutura;
	
	public Evento() {
	}
	
	public Evento(Integer idEvento, String categoria, Date dataAgendada, Time horarioInicio, Time horarioFinal, Integer qtdPessoas, String estrutura) {
		this.idEvento = ++idEvento;
		this.categoria=categoria;
		this.dataAgendada=dataAgendada;
		this.horarioInicio=horarioInicio;
		this.horarioFinal=horarioFinal;
		this.qtdPessoas=qtdPessoas;
		this.estrutura=estrutura;
	}

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = ++idEvento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(Date dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public Time getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Time horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public Time getHorarioFinal() {
		return horarioFinal;
	}

	public void setHorarioFinal(Time horarioFinal) {
		this.horarioFinal = horarioFinal;
	}

	public Time getDuracao() {
		return duracao;
	}

	public void setDuracao(Time duracao) {//TODO: pegar horario inicio horario final gerar duração
		if (this.horarioInicio != null && this.horarioFinal != null) { // Verifica se ambos os horários não são nulos
		    LocalTime inicio = this.horarioInicio.toLocalTime();       // Converte horarioInicio para LocalTime
		    LocalTime fim = this.horarioFinal.toLocalTime();           // Converte horarioFinal para LocalTime
		    Duration duration = Duration.between(inicio, fim);         // Calcula a duração entre inicio e fim
		    this.duracao = Time.valueOf(LocalTime.ofNanoOfDay(duration.toNanos())); // Converte a duração para Time e atribui a duracao
		} else {
		    this.duracao = null;  // Define duracao como null se os horários não estiverem definidos
		}
	}

	public Integer getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public String getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
	}
}
