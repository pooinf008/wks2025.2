package br.edu.ifba.inf011.solid;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DadosCadastrais {
	
	private String matricula;
	private String nome;
	private BigDecimal salario;
	private Cargo cargo;
	private LocalDate dtUltimoReajuste;
	private LocalDate dtAdmissao;
	
	public DadosCadastrais(String matricula, String nome, BigDecimal salario, Cargo cargo,
			   LocalDate dtAdmissao) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.dtAdmissao = dtAdmissao;
		this.dtUltimoReajuste = dtAdmissao;		
	}

	protected String getMatricula() {
		return matricula;
	}

	protected String getNome() {
		return nome;
	}

	protected BigDecimal getSalario() {
		return salario;
	}

	protected Cargo getCargo() {
		return cargo;
	}

	protected LocalDate getDtUltimoReajuste() {
		return dtUltimoReajuste;
	}

	protected LocalDate getDtAdmissao() {
		return dtAdmissao;
	}

	protected void setSalario(BigDecimal novoSalario) {
		this.salario = novoSalario;
	}
	
	
	protected void setDtUltimoReajuste(LocalDate data) {
		this.dtUltimoReajuste = data;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	

}
