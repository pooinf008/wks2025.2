package midlleware;

import midlleware.protocol.http.HTTPProtocol;
import midlleware.protocol.http.HTTPRequest;
import midlleware.protocol.http.HTTPResponse;

public class HTTPFactory implements ProtocolFactory{

	@Override
	public Response createResponse() {
		return new HTTPResponse();
	}

	@Override
	public Request createRequest() {
		return new HTTPRequest();
	}

	@Override
	public Protocol createProtocol(String string, Integer valueOf) {
		return new HTTPProtocol(string, valueOf);
	}
	

	
		

}
