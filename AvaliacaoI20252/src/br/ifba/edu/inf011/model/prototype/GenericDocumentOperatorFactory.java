package br.ifba.edu.inf011.model.prototype;

import br.ifba.edu.inf011.model.Documento;
import br.ifba.edu.inf011.model.Operador;
import br.ifba.edu.inf011.model.af.DocumentOperatorFactory;

public class GenericDocumentOperatorFactory implements DocumentOperatorFactory{
	
	private Documento docPrototipo;
	private Operador opPrototipo;
	
	
	public GenericDocumentOperatorFactory(Documento docPrototipo, Operador opPrototipo) {
		this.docPrototipo = docPrototipo;
		this.opPrototipo = opPrototipo;
	}
	

	@Override
	public Documento getDocumento() {
		return (Documento) this.docPrototipo.clonar();
	}

	@Override
	public Operador getOperador() {
		return (Operador) this.opPrototipo.clonar();
	}

}
