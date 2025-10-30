package midlleware;

public class App {
	
	
	public void run(ProtocolFactory pf) {
		 Protocol protocol = pf.createProtocol("http.inf011.ifba.edu.br", Integer.valueOf(21));
		 Request request = pf.createRequest();
		 Response response = pf.createResponse();
		 protocol.open();
		 protocol.message(request, response);
		 protocol.close();		
	}
	
	public static void main(String[] args) {
		new App().run(new SMTPFactory()); 	
	}
		
	


}
