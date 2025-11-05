package br.ifba.edu.inf011.model;

import java.util.Set;

import br.ifba.edu.inf011.model.prototype.Prototipavel;

public interface Documento extends Prototipavel{
	
	public void
	inicializar(Operador proprietario, Privacidade privacidade) throws FWDocumentException;
	public void adicionarAssinatura(Assinatura assinatura);
    public String getNumero();
    public String getConteudo();
    public Operador getProprietario();
    public Privacidade getPrivacidade();
    public Set<Assinatura> getAssinaturas();

}
