package midlleware;

import midlleware.protocol.ftp.FTPProtocol;
import midlleware.protocol.ftp.FTPRequest;
import midlleware.protocol.ftp.FTPResponse;

public class FTPFactory implements ProtocolFactory{

	@Override
	public Response createResponse() {
		return new FTPResponse();
	}

	@Override
	public Request createRequest() {
		return new FTPRequest();
	}

	@Override
	public Protocol createProtocol(String string, Integer valueOf) {
		return new FTPProtocol(string, valueOf);
	}
		

}
