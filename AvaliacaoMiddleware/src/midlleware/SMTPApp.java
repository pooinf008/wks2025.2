package midlleware;

import midlleware.protocol.smtp.SMTPProtocol;
import midlleware.protocol.smtp.SMTPRequest;
import midlleware.protocol.smtp.SMTPResponse;

public class SMTPApp extends App{

	@Override
	protected Response createResponse() {
		return new SMTPResponse();
	}

	@Override
	protected Request createRequest() {
		return new SMTPRequest();
	}

	@Override
	protected Protocol createProtocol(String string, Integer valueOf) {
		return new SMTPProtocol(string, valueOf);
	}
	
	public static void main(String[] args) {
		new SMTPApp().run(); 	
	}
	

}
