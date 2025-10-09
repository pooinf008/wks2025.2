package pack;

public record Endereco(String rua, Bairro bairro) {
	public String siglaEstado() {
		return this.bairro().siglaEstado();
	}
	
}
