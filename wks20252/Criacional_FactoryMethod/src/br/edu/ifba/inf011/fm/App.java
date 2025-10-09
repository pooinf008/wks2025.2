package br.edu.ifba.inf011.fm;

import br.edu.ifba.inf011.fm.drawing.DrawingApplication;

public class App {
	
	public void run(Application dApp) {
		dApp.openDocument(1);
		dApp.openDocument(2);
		dApp.openDocument(3);	
	}

		
	
	
	public static void main(String[] args) {
		new App().run(new DrawingApplication());
	}

}
