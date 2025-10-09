package br.edu.ifba.inf011.solid.regras;

import java.math.BigDecimal;

import br.edu.ifba.inf011.solid.Reajustavel;

public interface Regra {

	public Boolean valida(Reajustavel funcionario, BigDecimal pctAumento);

}
