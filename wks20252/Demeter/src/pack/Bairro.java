package pack;

public record Bairro(String nome, Cidade cidade) {
	
	public String siglaEstado() {
		return this.cidade().siglaEstado();
	}
	

}
