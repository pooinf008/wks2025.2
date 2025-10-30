package br.edu.ifba.inf011;


import java.util.List;

public record Mapa(Sexo sexo, Idade idade, Dificuldade dificuldade,
				   Integer escala, Integer ecn, PontoGeografico largada,
				   PontoGeografico partida, List<Prisma> prismas, PontoGeografico chegada) {

}