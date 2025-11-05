package br.ifba.edu.inf011.model;

import br.ifba.edu.inf011.model.af.CalculoPericialPeritoFactory;
import br.ifba.edu.inf011.model.af.DocumentOperatorFactory;
import br.ifba.edu.inf011.model.prototype.GenericDocumentOperatorFactory;

public class App {
	
	public void run() throws FWDocumentException {
		Operador operador = new Perito();
		Documento documento = new CalculoPericial();
		operador.inicializar("jdc", "João das Couves");
		documento.inicializar(operador, Privacidade.PUBLICO);
		System.out.println(documento);
		
	}
	
	public void runQ1(DocumentOperatorFactory factory) throws FWDocumentException {
		Operador operador = factory.getOperador();
		Documento documento = factory.getDocumento();
		operador.inicializar("jdc", "João das Couves");
		documento.inicializar(operador, Privacidade.PUBLICO);
		System.out.println(documento);
	}
	
	public void runQ2(DocumentOperatorFactory factory) throws FWDocumentException {
		Operador operador = factory.getOperador();
		Documento documento = factory.getDocumento();
		operador.inicializar("jdc", "João das Couves");
		documento.inicializar(operador, Privacidade.PUBLICO);
		System.out.println(documento);
	}	
	

	public static void main(String[] args) throws FWDocumentException {
		App app = new App();
		app.run();
		app.runQ1(new CalculoPericialPeritoFactory());
		app.runQ2(new GenericDocumentOperatorFactory(new CalculoPericial(), new Perito()));
	}
	
}
