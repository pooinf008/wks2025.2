package br.edu.ifba.inf011.fm;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	private List<Document> docs;
	private int tipo; 
	
	
	public Application() {
		this.docs = new ArrayList<Document>();
	}
	
//	public void openDocument() {
//		this.openDocument(1);
//	}	
	
	public void openDocument(int tipo) {
		Document doc = this.createDocument(tipo);
		doc.open();
		this.docs.add(doc);
	}

	public Document createDocument(int tipo) {
		if(tipo == 1)
			return new TextDocument();
		else if(tipo == 2)
			return new ImageDocument();
		return null;
	};

}
