package JACCCG.Batalha;

import JACCCG.Cartas.Carta;

public class Oponente extends Jogador {

	private String nome;

	/**
	 *  
	 *  
	 *  
	 *  
	 *  
	 */
	public Oponente(String nome, Baralho baralho, int vida, int manaPool) {
		super(baralho, vida, manaPool);
	}

	public Carta selecionaCartaDaMao() {
		return null;
	}

	public Carta selecionaAlvo() {
		return null;
	}

	public Carta selecionaCartaAtacante() {
		return null;
	}

}
