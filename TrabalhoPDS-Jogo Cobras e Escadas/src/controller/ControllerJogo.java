package controller;

import model.Jogador;
import model.Jogo;

public class ControllerJogo {
	Jogo jogo = new Jogo();
	ControllerDaVez controlVez = new ControllerDaVez();
	public void iniciarJogo() {
		jogo.iniciarJogo();
	}
	
	public void addJogador(String nome) {
		controlVez.cadastroJogadoresPartida(nome);
	}
	
	public Jogador proximoJogador() {
		return controlVez.nextPlayer();
	}
	
	public String atualJogador() {
		return controlVez.actualPlayer();
	}
	
	public int valorDado(){
		int valor = jogo.jogarDado();
		return valor;
	}
}
