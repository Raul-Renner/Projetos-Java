package controller;

import java.util.Random;

import model.Jogador;

public class ControllerDaVez {
	InteratorConcretDaVez jogPartida = new InteratorConcretDaVez();
public void cadastroJogadoresPartida(String nome) {
	jogPartida.addJogador(nome);
}
public String actualPlayer() {
	Jogador jg = (Jogador)jogPartida.actualPlayer();
	return jg.getNome();
}
public Jogador nextPlayer() {
	Jogador jg = (Jogador)jogPartida.nextPlayer();
	return jg;
}
public void controleJogadas(int valorDado) {
	Jogador jg = (Jogador)jogPartida.actualPlayer();
	jg.setPosicao(valorDado);
	System.out.println("Jogador "+jg.getNome()+" Posicao: "+jg.getPosicao());
}




}



