package pack;

public enum SiglaEstado {

	BA("BA"), SP("SP"), RJ("RJ");

	
	private String representacao;
	SiglaEstado(String representacao) {
		this.representacao = representacao;
	}
	
	
	public String representacao() {
		return this.representacao;
	}
	
	
	
	

}
