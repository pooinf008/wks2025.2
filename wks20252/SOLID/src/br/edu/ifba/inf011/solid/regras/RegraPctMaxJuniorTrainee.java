package br.edu.ifba.inf011.solid.regras;

import java.math.BigDecimal;

import br.edu.ifba.inf011.solid.Cargo;
import br.edu.ifba.inf011.solid.Reajustavel;

public class RegraPctMaxJuniorTrainee implements Regra{

	@Override
	public Boolean valida(Reajustavel funcionario, BigDecimal pctAumento) {
		if((funcionario.getCargo() == Cargo.TRAINEE ||  funcionario.getCargo() == Cargo.JUNIOR)
			    && pctAumento.compareTo(new BigDecimal("0.05")) > 0)
				return Boolean.FALSE;
		return Boolean.TRUE;
	}

}
