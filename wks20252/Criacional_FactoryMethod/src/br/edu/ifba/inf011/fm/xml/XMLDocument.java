package br.edu.ifba.inf011.fm.xml;

import br.edu.ifba.inf011.fm.Document;

public class XMLDocument implements Document{
	
	private String content;
	
    public XMLDocument() {
        this.content = "Dados Texto de XML.";
    }
    
    public void open() {
        System.out.println("  [Documento XML] Abrindo e exibindo...");
    }
    
    public void save() {
        System.out.println("  [Documento de Desenho] Salvando dados binários.");
    }
}