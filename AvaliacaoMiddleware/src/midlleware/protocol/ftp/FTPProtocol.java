package midlleware.protocol.ftp;

import midlleware.Protocol;
import midlleware.Request;
import midlleware.Response;

public record FTPProtocol(String host, Integer port)  implements Protocol{
	
	public void open() {
		System.out.println("FTP:\\> Abrindo porta " + this.port() +
				           " no host " + this.host() + "...");
	}
	
	public void message(Request request, Response response) {
		System.out.println("FTP:\\>Troca de mensagem");
	}
	
	public void close() {
		System.out.println("FTP:\\> Fechando porta " + this.port() +
				           " no host " + this.host() + "...");
	}
	

}
