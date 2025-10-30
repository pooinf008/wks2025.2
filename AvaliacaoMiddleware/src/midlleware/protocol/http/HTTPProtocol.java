package midlleware.protocol.http;

import midlleware.Protocol;
import midlleware.Request;
import midlleware.Response;

public record HTTPProtocol(String host, Integer port) implements Protocol{
	
	public void open() {
		System.out.println("HTTP:\\> Abrindo porta " + this.port() +
				           " no host " + this.host() + "...");
	}
	
	public void message(Request request, Response response) {
		System.out.println("HTTP:\\> Troca de mensagem");
	}
	
	public void close() {
		System.out.println("HTTP:\\> Fechando porta " + this.port() +
				           " no host " + this.host() + "...");
	}
	

}
