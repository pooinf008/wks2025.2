package br.edu.ifba.inf011.fm.json;

import br.edu.ifba.inf011.fm.Application;
import br.edu.ifba.inf011.fm.Document;

public class JSonApplication extends Application {

	@Override
	public Document createDocument(int tipo) {
		return new JSonDocument();
	}

}
