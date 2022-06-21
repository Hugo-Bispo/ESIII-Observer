package view;

import java.util.ArrayList;

import controller.CriadorDeConteudo;
import controller.Inscrito;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Inscrito> inscritos = new ArrayList<Inscrito>();

		for (int i = 0; i < 3; i++) {
			inscritos.add(new Inscrito());
		}
		CriadorDeConteudo criador = new CriadorDeConteudo(inscritos);
		criador.notificacao();
	}
}
