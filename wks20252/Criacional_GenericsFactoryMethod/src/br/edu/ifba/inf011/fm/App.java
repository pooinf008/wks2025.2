package br.edu.ifba.inf011.fm;

import java.lang.reflect.InvocationTargetException;

import br.edu.ifba.inf011.fm.json.JSonDocument;

public class App {
	
	public void run() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Application<JSonDocument> dApp = new Application<JSonDocument>(JSonDocument.class);
		dApp.openDocument();
		dApp.openDocument();
		dApp.openDocument();	
	}

		
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		new App().run();
	}

}
