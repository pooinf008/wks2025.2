package br.ifba.edu.inf011.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import br.ifba.edu.inf011.model.prototype.Prototipavel;

public class CalculoPericial extends AbstractDocumentoBase implements Documento, Prototipavel {

	public CalculoPericial(CalculoPericial calculo) {
		this.conteudo = this.getConteudo();
		this.proprietario = (this.getProprietario() != null) ? (Operador) this.getProprietario().clonar() :
															 null;
		this.dataCriacao = LocalDateTime.now();
		this.privacidade = this.getPrivacidade();
		this.assinaturas = new HashSet<Assinatura>();
		this.numero = "DOC-" + System.currentTimeMillis(); 
	}
	
	
    public CalculoPericial(String conteudo, Operador proprietario, 
			 LocalDateTime dataCriacao, Privacidade privacidade, Set<Assinatura> assinaturas,
			 String numero) {
    	super(conteudo, proprietario, dataCriacao, privacidade, assinaturas, numero);
    }

    public CalculoPericial(Operador proprietario, Privacidade privacidade) {
    	super(proprietario, privacidade);
    }    

    public CalculoPericial() {
    	super();
    } 
    

	public Prototipavel clonar() {
		return new CalculoPericial(this);
	}
	

}
