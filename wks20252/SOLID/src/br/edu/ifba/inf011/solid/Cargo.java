package br.edu.ifba.inf011.solid;

public enum Cargo {
	ESTAGIARIO,
	TRAINEE,
	JUNIOR,
	PLENO,
	SENIOR, 
	MENTOR;
	
	
	public Cargo proximoNivel() {
		int indice = this.ordinal() + 1;
		indice = indice < Cargo.values().length ? indice : Cargo.values().length - 1;
		return Cargo.values()[indice];
	}
	

}