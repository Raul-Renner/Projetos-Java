package controller;

import model.Jogador;

public class ControllerView {
	ControllerJogo controlJogo = new ControllerJogo();
	public void iniciarJogo(){
		controlJogo.iniciarJogo();
	}
	public boolean qtdJogador(int qtdJogador) {
		if(qtdJogador > 4 || qtdJogador < 2) {
			return false;
		}
		
		return true;
	}
	public void addJogador(String nome) {
		controlJogo.addJogador(nome);
	}
	
	public Jogador proximoJogador() {
		return controlJogo.proximoJogador();
	}
	
	public String jogadorAtual() {
		 return controlJogo.atualJogador();
	}
	public void jogarDado() {
		int valor = controlJogo.valorDado();
		System.out.println("Jogador "+jogadorAtual()+" tirou "+valor);
	}
}
