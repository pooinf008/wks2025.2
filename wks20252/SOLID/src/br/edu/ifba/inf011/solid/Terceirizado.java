package br.edu.ifba.inf011.solid;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Terceirizado implements Promovivel{

	private Empresa empresa;
	private DadosCadastrais dados; 
	
	public Terceirizado(String matricula, String nome, 
						BigDecimal salario, Cargo cargo, 
						LocalDate dtAdmissao, Empresa empresa) {
		this.dados  = new DadosCadastrais(matricula, nome,
				 salario, 
				 cargo, dtAdmissao);
		this.empresa = empresa;
	}
	
	public String toString() {
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String rep = "MATRICULA: " + this.getMatricula() + "\n" + 
					 "NOME: " + this.getNome() + "\n" +
					 "CARGO: " + this.getCargo() + "\n" +
					 "DATA ADMISSÃO: " + this.getDtAdmissao().format(format) + "\n" +
					 "SALÁRIO: " +  NumberFormat.getCurrencyInstance(java.util.Locale.of("PT", "BR")).format(this.getSalario()) + "\n" +
					 "DATA ÚLTIMO REAJUSTE: " + this.getDtUltimoReajuste().format(format) + "\n" +
					 "EMPRESA: " + this.empresa.nome()+ "\n";
		return rep;
			   
 	}
	
	private String getMatricula() {
		return this.dados.getMatricula();
	}
	
	public String getNome() {
		return this.dados.getNome();
	}
	
	public BigDecimal getSalario() {
		return this.dados.getSalario();
	}
	
	protected LocalDate getDtUltimoReajuste() {
		return this.dados.getDtUltimoReajuste();
	}

	private LocalDate getDtAdmissao() {
		return this.dados.getDtAdmissao();
	}

	protected Cargo getCargo() {
		return this.dados.getCargo();
	}
	

	public void promover(){
		this.dados.setCargo(this.dados.getCargo().proximoNivel());
	}	
	
	

}
