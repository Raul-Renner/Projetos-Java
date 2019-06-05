package View;

import java.util.Scanner;

import controller.ControllerView;

public class ViewMain {
public static void main(String[] args) {
	ControllerView controlView = new ControllerView();
	Scanner read = new Scanner(System.in); 
	int qtdJogadores;
	String nome;
	int cont = 1;
	System.out.println("Olá,Bem vindo ao nosso jogo!!");
	
	controlView.iniciarJogo();
	
	System.out.println("Digite a quantidade de jogadores:");
	System.out.println("2-Jogadores \n 3-Jogadores \n 4-Jogadores");
	qtdJogadores = read.nextInt();
	while(controlView.qtdJogador(qtdJogadores)) {
		System.out.println("Digite a quantidade jogadores correto de 2-4 jogadores");
		qtdJogadores = read.nextInt();
	}
	while(qtdJogadores != 0) {
		
	}
	
	
}
}
