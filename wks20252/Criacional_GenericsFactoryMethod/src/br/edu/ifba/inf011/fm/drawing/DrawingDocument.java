package br.edu.ifba.inf011.fm.drawing;

import br.edu.ifba.inf011.fm.Document;

public class DrawingDocument implements Document{
	
	private String content;
	
    public DrawingDocument() {
        this.content = "Dados binários de desenho.";
    }
    
    public void open() {
        System.out.println("  [Documento de Desenho] Abrindo e renderizando...");
    }
    
    public void save() {
        System.out.println("  [Documento de Desenho] Salvando dados binários.");
    }
}