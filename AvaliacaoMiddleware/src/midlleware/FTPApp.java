package midlleware;

import midlleware.protocol.ftp.FTPProtocol;
import midlleware.protocol.ftp.FTPRequest;
import midlleware.protocol.ftp.FTPResponse;

public class FTPApp extends App{

	@Override
	protected Response createResponse() {
		return new FTPResponse();
	}

	@Override
	protected Request createRequest() {
		return new FTPRequest();
	}

	@Override
	protected Protocol createProtocol(String string, Integer valueOf) {
		return new FTPProtocol(string, valueOf);
	}
	
	public static void main(String[] args) {
		new FTPApp().run();
	}
	
	
		

}
