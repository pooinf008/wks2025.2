package midlleware;

import midlleware.protocol.ftp.FTPRequest;
import midlleware.protocol.http.HTTPResponse;
import midlleware.protocol.smtp.SMTPProtocol;

public class WrongApp extends App{

	@Override
	protected Response createResponse() {
		return new HTTPResponse();
	}

	@Override
	protected Request createRequest() {
		return new FTPRequest();
	}

	@Override
	protected Protocol createProtocol(String string, Integer valueOf) {
		return new SMTPProtocol(string, valueOf);
	}
	
	public static void main(String[] args) {
		new WrongApp().run();
	}

}
