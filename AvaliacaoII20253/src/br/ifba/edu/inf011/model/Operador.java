package br.ifba.edu.inf011.model;

import br.ifba.edu.inf011.prototype.Prototipavel;

public interface Operador extends Prototipavel{
	public void inicializar(String id, String nome);
	public String getId();
	public String getNome();
}
