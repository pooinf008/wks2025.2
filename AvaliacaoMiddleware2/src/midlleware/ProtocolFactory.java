package midlleware;

public interface ProtocolFactory {
	public Response createResponse();
	public Request createRequest();
	public Protocol createProtocol(String string, Integer valueOf);
}
