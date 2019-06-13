package controller;

import model.Jogador;

public class ControllerView {
	ControllerJogo controlJogo;
	
	public ControllerView() {
		super();
		this.controlJogo = ControllerJogo.getInstance();
	}
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
		 String nome =  controlJogo.atualJogador();
		 return nome;
	}
	public void jogarDado() {
		int valor = controlJogo.jogarDado();
		System.out.println(jogadorAtual()+" tirou "+valor);
	}
	
	public boolean verificadorVencedor() {
		return controlJogo.verificarVencedor();
	}
	
	public void verificarPosicaoAtualJogador() {
		System.out.println(controlJogo.verificarPosicaoJogador());
	}
	public void informacoes() {
		System.out.println("---------INFORMACOES---------");
		System.out.println("NOSSO JOGO E FORMADO POR 100 CASAS");
		System.out.println("NA QUAL NESSAS CASAS EXISTEM: COBRAS,ESCADAS E CARTAS");
		System.out.println("EM QUE ELAS PODEM LHE AJUDA OU TE PREJUDICAR DURANTE O JOGO");
		System.out.println("COBRAS:CASO CAIA NA CABECA DA COBRA VOCE IRA VOLTAR ALGUMAS CASAS");
		System.out.println("ESCADAS: CASO CAIA EM UMA CASA ONDE SEJA O INICIO DE UMA ESCADA VOCE IRA AVANCAR CASAS");
		System.out.println("CARTAS: CASAS COM CARTAS PODEM LHE AJUDAR AVANCAR DE 1 A 3 CASAS OU VOLTAR DE 1 A 3 CASAS");
		
	}
}
