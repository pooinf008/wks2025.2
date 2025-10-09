package br.edu.ifba.inf011.fm.json;

import br.edu.ifba.inf011.fm.Document;

public class JSonDocument implements Document {

	@Override
	public void open() {
		System.out.println("[Documento JSON] Abrindo e jasando");
	}

	@Override
	public void save() {
		System.out.println("[Documento JSON] Salvando");
	}

}
