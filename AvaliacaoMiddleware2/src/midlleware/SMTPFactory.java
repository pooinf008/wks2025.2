package midlleware;

import midlleware.protocol.smtp.SMTPProtocol;
import midlleware.protocol.smtp.SMTPRequest;
import midlleware.protocol.smtp.SMTPResponse;

public class SMTPFactory implements ProtocolFactory{

	@Override
	public Response createResponse() {
		return new SMTPResponse();
	}

	@Override
	public Request createRequest() {
		return new SMTPRequest();
	}

	@Override
	public Protocol createProtocol(String string, Integer valueOf) {
		return new SMTPProtocol(string, valueOf);
	}
	


}
