package br.ifba.edu.inf011.model.af;

import br.ifba.edu.inf011.model.Documento;
import br.ifba.edu.inf011.model.Operador;

public interface DocumentOperatorFactory {
	
	   public Documento getDocumento();
	   public Operador getOperador();

}
