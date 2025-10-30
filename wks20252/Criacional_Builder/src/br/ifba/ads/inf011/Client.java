package br.ifba.ads.inf011;

import java.util.List;

public class Client {

	
	public void run3() {
		ContadorCaracteres converter = new ContadorCaracteres();
		String html = "Este é um texto <b>negrito</b> e <i>itálico</i>.<p>Um parágrafo.</p><br>Quebra.";
		HTMLReader reader = new HTMLReader(converter);
		reader.parse(html);
		System.out.println(converter.quantidade());
	}	
	
	
	public void run2() {
		ASCIIConverter converter = new ASCIIConverter();
		String html = "Este é um texto <b>negrito</b> e <i>itálico</i>.<p>Um parágrafo.</p><br>Quebra.";
		HTMLReader reader = new HTMLReader(converter);
		reader.parse(html);
		System.out.println(converter.getASCII());
	}	
	
	public void run() {
		WhatsAppConverter converter = new WhatsAppConverter();
		String html = "Este é um texto <b>negrito</b> e <i>itálico</i>.<p>Um parágrafo.</p><br>Quebra.";
		HTMLReader reader = new HTMLReader(converter);
		reader.parse(html);
		System.out.println(converter.getWhatsAppMessage());
	}
	
	
	public void parse() {
		String html = "Este é um texto <b>negrito</b> e <i>itálico</i>.<p>Um parágrafo.</p><br>Quebra.";
		HTMLParse reader = new HTMLParse(html);
		List<Token> tokens = reader.parse();
		for(Token t : tokens)
			System.out.println(t);
		
	}
	
	
	public static void main(String[] args) {
		new Client().run();
		new Client().run2();
		new Client().run3();
//		new Client().parse();
	}

}
