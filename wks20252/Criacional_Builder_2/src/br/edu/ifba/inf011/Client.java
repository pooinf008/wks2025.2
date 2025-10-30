package br.edu.ifba.inf011;

public class Client {
	
	
	
	public void run() {
		MapaBuilder builder = new MapaBuilder();
		Mapa mapa = builder.init()
						   .withSexo(Sexo.H)
						   .withLargadaAt(new PontoGeografico(10.0, 10.0, 10.0))
						   .get();
		
		System.out.println(mapa);
	}
	
	
	public static void main(String[] args) {
		new Client().run();
	}
	
	

}
