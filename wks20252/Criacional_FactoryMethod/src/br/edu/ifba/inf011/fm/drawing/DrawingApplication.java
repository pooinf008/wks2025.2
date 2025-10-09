package br.edu.ifba.inf011.fm.drawing;

import br.edu.ifba.inf011.fm.Application;
import br.edu.ifba.inf011.fm.Document;

public class DrawingApplication extends Application {

	@Override
	public Document createDocument(int tipo) {
		if(tipo == 3)
			return new DrawingDocument();
		return super.createDocument(tipo);
	}

	
	
}
