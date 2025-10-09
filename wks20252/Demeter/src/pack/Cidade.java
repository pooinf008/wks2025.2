package pack;

public record Cidade (String nome, Estado estado) {
	
	public String siglaEstado() {
		return this.estado.sigla().representacao();
	}

}
