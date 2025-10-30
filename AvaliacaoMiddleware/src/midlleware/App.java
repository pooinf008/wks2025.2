package midlleware;

import midlleware.protocol.ftp.FTPProtocol;
import midlleware.protocol.ftp.FTPRequest;
import midlleware.protocol.ftp.FTPResponse;
import midlleware.protocol.http.HTTPProtocol;
import midlleware.protocol.http.HTTPRequest;
import midlleware.protocol.http.HTTPResponse;

public abstract class App {
	
	
	public void run() {
		 Protocol protocol = this.createProtocol("http.inf011.ifba.edu.br", Integer.valueOf(21));
		 Request request = this.createRequest();
		 Response response = this.createResponse();
		 protocol.open();
		 protocol.message(request, response);
		 protocol.close();		
	}
	
	protected abstract Response createResponse();
	protected abstract Request createRequest();
	protected abstract Protocol createProtocol(String string, Integer valueOf);


}
