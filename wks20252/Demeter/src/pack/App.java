package pack;

public class App {
	
	public void run() {
		
		Endereco e = new Endereco("Emidio Santos", 
									new Bairro("Barbalho",
											new Cidade("Salvador",
													new Estado(SiglaEstado.BA, "BAHIA"))));
		
		
		
		System.out.println(e.siglaEstado());
		
	}
	
	public static void main(String[] args) {
		new App().run();
	}

}
