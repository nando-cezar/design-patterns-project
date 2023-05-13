package br.edu.ifba.inf011.exception;

public class TipoIncompativelException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String tipoEncontrado;
	private String tipoEsperado;
	
	public TipoIncompativelException(String id, String tipoEsperado, 
									 String tipoEncontrado) {
		this.id = id;
		this.tipoEncontrado = tipoEncontrado;
		this.tipoEsperado = tipoEsperado;
	}

	public String getTipoEncontrado() {
		return tipoEncontrado;
	}

	public String getTipoEsperado() {
		return tipoEsperado;
	}

	public String getId() {
		return id;
	}
	
	

}
