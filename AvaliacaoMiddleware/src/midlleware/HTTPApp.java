package midlleware;

import midlleware.protocol.http.HTTPProtocol;
import midlleware.protocol.http.HTTPRequest;
import midlleware.protocol.http.HTTPResponse;

public class HTTPApp extends App{

	@Override
	protected Response createResponse() {
		return new HTTPResponse();
	}

	@Override
	protected Request createRequest() {
		return new HTTPRequest();
	}

	@Override
	protected Protocol createProtocol(String string, Integer valueOf) {
		return new HTTPProtocol(string, valueOf);
	}
	
	public static void main(String[] args) {
		new HTTPApp().run();
	}
	
	
		

}
