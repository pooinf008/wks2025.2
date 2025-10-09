package br.edu.ifba.inf011.solid.regras;

import java.math.BigDecimal;

import br.edu.ifba.inf011.solid.Reajustavel;

public class RegraNomeComA implements Regra{

	@Override
	public Boolean valida(Reajustavel funcionario, BigDecimal pctAumento) {
		if(!funcionario.getNome().startsWith("A") &&
				pctAumento.compareTo(new BigDecimal("0.15")) > 0)
				return Boolean.FALSE;
		return Boolean.TRUE;
	}

}
