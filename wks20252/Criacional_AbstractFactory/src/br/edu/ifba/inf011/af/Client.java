package br.edu.ifba.inf011.af;

import br.edu.ifba.inf011.af.motif.MotifWidgetFactory;
import br.edu.ifba.inf011.af.pm.PMWidgetFactory;

public class Client {
	
	private WidgetFactory factory;
	
	public Client(WidgetFactory factory) {
		this.factory = factory;
	}
	
	public void asmAndShow() {
		Icon icon = this.factory.createIcon();
		Window window = this.factory.createWindow();
		ScrollBar scrollBar = this.factory.createScrollBar();
		
		window.show();
		scrollBar.roll();
		icon.iconify();
	}
	
	
	public static void main(String[] args) {
		new Client(new MotifWidgetFactory()).asmAndShow();
	}
	
	

}
