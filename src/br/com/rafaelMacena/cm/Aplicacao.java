package br.com.rafaelMacena.cm;

import br.com.rafaelMacena.modelo.Tabuleiro;
import br.com.rafaelMacena.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);		
	

	}

}
