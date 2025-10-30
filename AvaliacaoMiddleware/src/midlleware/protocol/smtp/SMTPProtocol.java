package midlleware.protocol.smtp;

import midlleware.Protocol;
import midlleware.Request;
import midlleware.Response;

public record SMTPProtocol(String host, Integer port)  implements Protocol{
	
	public void open() {
		System.out.println("SMTP:\\> Abrindo porta " + this.port() +
				           " no host " + this.host() + "...");
	}
	
	public void message(Request request, Response response) {
		System.out.println("SMTP:\\>Troca de mensagem");
	}
	
	public void close() {
		System.out.println("SMTP:\\> Fechando porta " + this.port() +
				           " no host " + this.host() + "...");
	}
	

}
