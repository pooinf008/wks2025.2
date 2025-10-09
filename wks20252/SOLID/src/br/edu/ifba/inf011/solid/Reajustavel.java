package br.edu.ifba.inf011.solid;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajustavel {
	
	public void reajustarSalario(BigDecimal novoSalario);

	public BigDecimal getSalario();

	public String getNome();

	public LocalDate getDtUltimoReajuste();

	public Cargo getCargo();

}
