package br.ifba.edu.inf011.af;

import br.ifba.edu.inf011.model.Documento;
import br.ifba.edu.inf011.model.FWDocumentException;
import br.ifba.edu.inf011.model.Operador;

public interface DocumentOperatorFactory {
	
	   public Documento getDocumento() throws FWDocumentException;
	   public Operador getOperador() throws FWDocumentException;

}
