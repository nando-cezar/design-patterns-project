package br.edu.ifba.inf011.observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FimProgramaEvento {
	public LocalDateTime instante;
	public String tipoPrograma;
	
	public FimProgramaEvento(LocalDateTime instante, String tipoPrograma) {
		this.instante = instante;
		this.tipoPrograma = tipoPrograma;
	}
	
	public LocalDateTime getInstante() {
		return instante;
	}

	public String getTipoPrograma() {
		return tipoPrograma;
	}

	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
		return "Programa: "  + tipoPrograma + " finalizado em : " +
				instante.format(formatter);
	}
}
