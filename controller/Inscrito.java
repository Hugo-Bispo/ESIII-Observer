package controller;

public class Inscrito implements IObservador, INotificacao{

	@Override
	public void notificacao() {
		System.out.println("Recebendo Notificacao");
		
	}

	@Override
	public void update(String acao) {
		notificacao();
		System.out.println(acao);
	}

}
