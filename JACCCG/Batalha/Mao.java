package Batalha;

import java.util.LinkedList;
import java.util.List;

import Cartas.CartaDeBatalha;
import Exceptions.BaralhoVazioException;

public class Mao {

	private List<CartaDeBatalha> cartasDaMao;

	public Mao() {
		cartasDaMao = new LinkedList<CartaDeBatalha>();

	}

	public void removeCarta(CartaDeBatalha carta) {
		cartasDaMao.remove(carta);
	}

	public void compraCarta(Baralho baralho) throws BaralhoVazioException{
		cartasDaMao.add(baralho.getTopo());

	}

	public List<CartaDeBatalha> getCartas() {
		return cartasDaMao;
	}

	public String toString(){
		if(cartasDaMao.size() == 0) return "Mao vazia";
		String str = "";
		CartaDeBatalha c = (CartaDeBatalha) getCartas().get(0);
		for(int i = 0; i < getCartas().size(); i++){
			c = (CartaDeBatalha) getCartas().get(i);
			str +=  (i+1) + " - " + c.getNome() + " " + "A:" + c.getAtaque() + " D:" + c.getDefesa() + " V:" + c.getVida() + " C:" + c.getCustoMana() + "\n";
		}
		return str;
	}
}
