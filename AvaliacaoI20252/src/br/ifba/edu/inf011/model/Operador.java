package br.ifba.edu.inf011.model;

import br.ifba.edu.inf011.model.prototype.Prototipavel;

public interface Operador extends Prototipavel{
	public String getId();
	public String getNome();
	public void inicializar(String id, String nome);
}
