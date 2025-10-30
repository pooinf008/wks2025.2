package midlleware;

public interface Protocol {

	public void open();
	public void message(Request request, Response response);
	public void close();

}
