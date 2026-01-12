package br.ifba.edu.inf011.model;

import br.ifba.edu.inf011.prototype.Prototipavel;

public interface Documento extends Prototipavel{
	public void	inicializar(Operador proprietario, Privacidade privacidade) throws FWDocumentException;
	public void setConteudo(String conteudo);
    public String getNumero();
    public String getConteudo() throws FWDocumentException;
    public Operador getProprietario();
    public Privacidade getPrivacidade();
}
