package br.edu.ifba.inf011.solid;

public class Promotor {
	
	public void promover(Promovivel funcionario) throws RHException{
		if(!this.podePromover(funcionario))
			throw new RHException("Não pode promover " + funcionario.getNome());
		
		funcionario.promover();
		
	}
	
	protected Boolean podePromover(Promovivel funcionario) {
		return Boolean.TRUE;
	}


}
