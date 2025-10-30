package br.edu.ifba.inf011;

import java.util.ArrayList;
import java.util.List;

public class MapaBuilder{
	
	private Sexo sexo;
	private Idade idade;
	private Dificuldade dificuldade;
	private Integer escala;
	private Integer ecn;
	private PontoGeografico largada;
	private PontoGeografico partida;
	private List<Prisma> prismas; 
	private PontoGeografico chegada;	
	
	public MapaBuilder init() {
		this.sexo = Sexo.D;
		this.idade = Idade.INFANTIL;
		this.dificuldade = Dificuldade.N;
		this.largada = null;
		this.partida = null;
		this.chegada = null;
		this.escala = 7500;
		this.ecn = 5;
		this.prismas = new ArrayList<Prisma>();
		return this;
	}

	public MapaBuilder withSexo(Sexo sexo) {
		this.sexo = sexo;
		return this;
	}

	public MapaBuilder withIdade(Idade idade) {
		this.idade = idade;
		return this;
	}
	
	
	public MapaBuilder withDificuldade(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
		return this;
	}	

	public MapaBuilder withPartidaAt(PontoGeografico partida) {
		this.partida = partida;
		return this;
	}

	public MapaBuilder withLargadaAt(PontoGeografico largada) {
		this.largada = largada;
		return this;
	}

	public MapaBuilder withChegadaAt(PontoGeografico chegada) {
		this.chegada = chegada;
		return this;
	}

	public MapaBuilder addPrisma(Prisma prisma) {
		this.prismas.add(prisma);
		return this;
	}
	
	public MapaBuilder setEscala(Integer escala) {
		this.escala = escala;
		return this;
	}
	
	public MapaBuilder setECN(Integer ecn) {
		this.ecn = ecn;
		return this;
	}
	
	public Mapa get() {

		PontoGeografico origem = null;
		
		if(this.partida == null && this.largada!= null)
			origem = this.largada;
		if(this.partida != null && this.largada== null)
			origem = this.partida;

		if(this.partida == null)
			this.partida = origem;
		if(this.largada == null)
			this.largada = origem;
		if(this.chegada == null)
			this.chegada = largada;
		
		return new Mapa(this.sexo, this.idade, this.dificuldade, 
						this.escala, this.ecn, largada, this.partida,
						this.prismas, this.chegada);
	}


	

}