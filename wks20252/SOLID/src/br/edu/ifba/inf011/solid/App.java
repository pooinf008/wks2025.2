package br.edu.ifba.inf011.solid;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.solid.regras.Regra;
import br.edu.ifba.inf011.solid.regras.RegraMinCargoTempo;
import br.edu.ifba.inf011.solid.regras.RegraPctMaxJuniorTrainee;

public class App {
	
	public void run(BigDecimal pctAumento) throws Exception{
		
		
		List<Regra> regras = new ArrayList<Regra>();
		regras.add(new RegraMinCargoTempo());
		regras.add(new RegraPctMaxJuniorTrainee());
		
		Promotor promotor = new Promotor();
		CalculadoraSalarial calculadora = new CalculadoraSalarial(regras);
		
		Terceirizado terceirizado = new Terceirizado("T001",
									             "ZÉ DAS MURIÇOCAS",
									             new BigDecimal(9900), 
									             Cargo.TRAINEE, 
									             LocalDate.of(1998, 12, 12),
									             new Empresa("AGATA"));
		
		Funcionario funcionario = new Funcionario("001",
									             "AZÉ DAS COUVES",
									             new BigDecimal(9900), 
									             Cargo.SENIOR, 
									             LocalDate.of(1998, 12, 12));
		System.out.println(funcionario);
		System.out.println("*********************************");
		
		calculadora.aumentarSalario(funcionario, pctAumento);
		promotor.promover(funcionario);
		
		System.out.println(funcionario);
	}	
	
	
	public static void main(String[] args) throws Exception {
		new App().run(new BigDecimal("0.05"));
	}

}
