package controller;

import java.util.ArrayList;

import interfaces.InteratorInterface;
import model.Jogador;


public class InteratorConcretDaVez implements InteratorInterface{
	public ArrayList<Jogador>players;
	int contador = -1;
	
	public InteratorConcretDaVez() {
		// TODO Auto-generated constructor stub
		players = new ArrayList<Jogador>();
		
	}
	
	public void addJogador(String nome) {
		Jogador jogador;
		int cont = 0;
		if(nome == null) {
			cont++;
			nome = "Player" + cont;
			jogador = new Jogador(nome);
			players.add(jogador);
		}else if(nome != null){
			jogador = new Jogador(nome);
			players.add(jogador);
		}else {
		}
	}
	public void teste(){
		System.out.println(players.get(contador).getNome());
		System.out.println(players.get(contador).getNome());

	}
	@Override
	public Object firstPlayer() {
		// TODO Auto-generated method stub
		
		return players.get(contador);
	}

	@Override
	public Object nextPlayer() {
		// TODO Auto-generated method stub
		contador++;
		isDone();
		return players.get(contador);
	}

	@Override
	public void isDone() {
		// TODO Auto-generated method stu
		if(contador == players.size()) {
			contador = 0;
		}
	}

	@Override
	public Object actualPlayer() {
		// TODO Auto-generated method stub
		return players.get(contador);
	}

}
