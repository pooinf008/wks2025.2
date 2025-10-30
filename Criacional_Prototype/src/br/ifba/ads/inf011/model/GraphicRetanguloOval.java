package br.ifba.ads.inf011.model;

import java.awt.Color;
import java.awt.Graphics2D;

import br.ifba.ads.inf011.framework.Clone;
import br.ifba.ads.inf011.framework.Graphic;

public class GraphicRetanguloOval implements Graphic{

	public GraphicRetangulo rect;
	public GraphicOval oval;

	public GraphicRetanguloOval() {
		this.rect = new GraphicRetangulo();
		this.oval = new GraphicOval();
	}	
	
	public GraphicRetanguloOval(GraphicRetanguloOval outro) {
		this(outro.rect, outro.oval);
	}
	
	public GraphicRetanguloOval(GraphicRetangulo rect, GraphicOval oval) {
		this.rect = rect; 
		this.oval = oval;
	}
	
	
	@Override
	public Clone clonar() {
		return new GraphicRetanguloOval((GraphicRetangulo)this.rect.clonar(),
										(GraphicOval)this.oval.clonar());
	}

	@Override
	public void draw(Graphics2D g2d) {
		this.oval.draw(g2d);
		this.rect.draw(g2d);
	}
	
	@Override
	public void initialize (int xInit, int yInit, int xEnd, int yEnd, Color corAtual) {
		this.oval.initialize(xInit, yInit,  xEnd,  yEnd, corAtual);
		this.rect.initialize(xInit, yInit,  xEnd,  yEnd, corAtual);
	}		

}
