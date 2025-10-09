package br.edu.ifba.inf011.fm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Application<T extends Document> {
	
	private List<T> docs;
	private Class<T> classe;
	
	
	public Application(Class<T> classe) {
		this.classe = classe;
		this.docs = new ArrayList<T>();
	}
	
	public void openDocument() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		T doc = this.createDocument();
		doc.open();
		this.docs.add(doc);
	}

	public T createDocument() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		return this.classe.getConstructor().newInstance();
	};

}
