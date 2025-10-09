package br.edu.ifba.inf011.solid;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.solid.regras.Regra;

public class CalculadoraSalarial {
	
	private List<Regra> regras;
	
	public CalculadoraSalarial(List<Regra> regras) {
		this.regras = new ArrayList<Regra>(regras);
	}
	
	
	public void aumentarSalario(Reajustavel funcionario, BigDecimal pctAumento) throws RHException{
		if (!this.aumentoValido(funcionario, pctAumento))
			throw new RHException("Não pode aumentar salario de " + funcionario.getNome());
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal aumento = salarioAtual.multiply(pctAumento);
		BigDecimal novoSalario =  salarioAtual.add(aumento);
		funcionario.reajustarSalario(novoSalario);
	}

	protected Boolean aumentoValido(Reajustavel funcionario, BigDecimal pctAumento) {
		
		for(Regra regra : this.regras)
			if (!regra.valida(funcionario,  pctAumento))
				return Boolean.FALSE;
		return Boolean.TRUE;
		
/*		
		return Boolean.TRUE;*/
	}	
	

}
