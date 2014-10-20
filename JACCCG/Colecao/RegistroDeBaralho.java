package JACCCG.Colecao;

import java.util.List;

import JACCCG.Cartas.Carta;
import JACCCG.Cartas.CartaDeColecao;

public class RegistroDeBaralho {

	private List<CartaDeColecao> cartas;
	private String nome;
	private int maxCartas;

	public RegistroDeBaralho(List<CartaDeColecao> cartas, String nome, int maxCartas) {
		this.cartas = cartas;
		this.nome = nome;
		this.maxCartas = maxCartas;
	}

	public List<CartaDeColecao> getCartas() {
		return cartas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCartas(List<CartaDeColecao> cartas) {
		this.cartas = cartas;
	}
	
	//TODO adicionar metodo no diagrama
	public int getMaximo(){
		return maxCartas;
	}

	public boolean jogavel() {
		return cartas.size() == maxCartas;
	}

	public boolean equals(Object outro){
		return nome == ((RegistroDeBaralho)outro).getNome();
	}
	
	public boolean contem(CartaDeColecao carta){
		for(CartaDeColecao c : cartas){
			if(c.getNome().equals(carta.getNome())) return true;
		}
		return false;
	}
	
	public int getOcorrenciasCarta(CartaDeColecao carta){
		int cont = 0;
		for(CartaDeColecao c : cartas){
			if(carta.getNome().equals(c.getNome())) cont++;
		}
		return cont;
	}
	

	public String toString(){
		String str = "";
		for(Carta c : getCartas()){
			str += this.getNome() + "\n";
			str += c.getNome() + " " + "A:" + c.getAtaque() + " D:" + c.getDefesa() + " V:" + c.getVida() + " C:" + c.getCustoMana() + "\n";
		}
		System.out.println(str);
		return str;
	}
}
