package controller;

import java.util.Random;

import model.Jogador;

public class ControllerDaVez {
	InteratorConcretDaVez jogPartida;
	
public ControllerDaVez() {
		super();
		this.jogPartida =  new InteratorConcretDaVez();
	}
public void cadastroJogadoresPartida(String nome) {
	jogPartida.addJogador(nome);
}
public Jogador actualPlayer() {
	Jogador jg = (Jogador)jogPartida.actualPlayer();
	return jg;
}
public Jogador nextPlayer() {
	Jogador jg = (Jogador)jogPartida.nextPlayer();
	return jg;
}





}



