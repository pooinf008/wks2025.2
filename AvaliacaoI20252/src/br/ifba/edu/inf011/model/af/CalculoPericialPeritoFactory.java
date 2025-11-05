package br.ifba.edu.inf011.model.af;

import br.ifba.edu.inf011.model.CalculoPericial;
import br.ifba.edu.inf011.model.Documento;
import br.ifba.edu.inf011.model.Operador;
import br.ifba.edu.inf011.model.Perito;

public class CalculoPericialPeritoFactory implements DocumentOperatorFactory {
	
    @Override
    public Documento getDocumento() {
        return new CalculoPericial();
    }
    
    @Override
    public Operador getOperador() {
        return new Perito();
    }
}