package br.ifba.edu.inf011.model;

import java.time.LocalDateTime;

public record Assinatura(Operador usuario, LocalDateTime dataAssinatura) {
}
