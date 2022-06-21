package controller;

import java.util.ArrayList;

public class CriadorDeConteudo implements INotificacao, IObservavel{
	private ArrayList<Inscrito> inscritos = new ArrayList<Inscrito>();
	private String acao;
	
	
	public CriadorDeConteudo(ArrayList<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}
	
	public void notificacao() {
		acao = "O Criado XPTO publicou um novo conteudo";
		System.out.println("Novo conteudo Publicado");
		notificaMudanca(acao);
	}

	public void notificaMudanca(String acao) {
		for(int i=0;i<inscritos.size();i++) {
			inscritos.get(i).update(acao);;
		}

	}

}
