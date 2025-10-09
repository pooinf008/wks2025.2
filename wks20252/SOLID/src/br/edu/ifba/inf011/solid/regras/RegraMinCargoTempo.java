package br.edu.ifba.inf011.solid.regras;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import br.edu.ifba.inf011.solid.Cargo;
import br.edu.ifba.inf011.solid.Reajustavel;

public class RegraMinCargoTempo implements Regra{

	@Override
	public Boolean valida(Reajustavel funcionario, BigDecimal pctAumento) {
		Period periodo = Period.between(funcionario.getDtUltimoReajuste(), LocalDate.now());
		if(funcionario.getCargo() == Cargo.TRAINEE && periodo.getYears() < 2)
			return Boolean.FALSE;	
		return Boolean.TRUE;
	}

}
