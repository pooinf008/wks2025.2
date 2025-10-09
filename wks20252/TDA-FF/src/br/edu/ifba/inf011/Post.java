package br.edu.ifba.inf011;

import java.io.PrintStream;

public class Post {
	public static final Integer CRIADO = 0;
	public static final Integer PUBLICADO = 1;
	
	private Integer status;
	private String conteudo;
	private String nome;
	
	public Post(String nome, String conteudo) {
		this.conteudo = conteudo;
		this.status = Post.CRIADO;
		this.nome = nome;
	}
	
	public void append(String conteudo) throws PostException{
		if(this.getStatus() == Post.PUBLICADO)
			throw new PostException(this.nome + ": Não pode editar");
		this.setConteudo(this.getConteudo() +  " " + conteudo);
	}
	
	public void rewrite(String conteudo) throws PostException{
		if(this.getStatus() == Post.PUBLICADO)
			throw new PostException(this.nome + ": Não pode editar");
		this.setConteudo(conteudo);
		
	}
	
	public void publicar(PrintStream out) throws PostException{ 
		if(this.getStatus() == Post.PUBLICADO)
			throw new PostException(this.nome + ": Não pode publicar");
		out.println(this.nome + ": " + this.getConteudo());
		this.setStatus(Post.PUBLICADO);
	}
	
	private String getConteudo() {
		return this.conteudo;
	}
	
	private void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	private void setStatus(Integer status) {
		this.status = status;
	}

	private Integer getStatus() {
		return this.status;
	}
	
	
}
