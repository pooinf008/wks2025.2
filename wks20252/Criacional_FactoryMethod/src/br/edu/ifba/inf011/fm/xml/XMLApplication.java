package br.edu.ifba.inf011.fm.xml;

import br.edu.ifba.inf011.fm.Application;
import br.edu.ifba.inf011.fm.Document;

public class XMLApplication extends Application{

	@Override
	public Document createDocument(int tipo) {
		return new XMLDocument();
	}

}
