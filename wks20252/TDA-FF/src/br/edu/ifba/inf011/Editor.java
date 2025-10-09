package br.edu.ifba.inf011;

public class Editor {
	
	public Editor() {
		
	}
	
	
	public void editar() {
		Post postA = new Post("PostA", "Primeiro Post");
		try {
			postA.append("Editado");
			postA.append("Editado de novo");
			postA.publicar(System.out);
		} catch (PostException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Post postB = new Post("PostB", "Segundo Post");
			postB.append("Editado");
			postB.publicar(System.out);
			postB.rewrite("Editado de novo");
		} catch (PostException e) {
			System.err.println(e.getMessage());
		}		
	}		
		
	
	public static void main(String[] args) {
		new Editor().editar();
	}
	
	
}
