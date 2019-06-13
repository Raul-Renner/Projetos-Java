package View;

import java.util.Scanner;

import controller.ControllerView;

public class ViewMain {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 

		ControllerView controlView = new ControllerView();

		int qtdJogadores;
		String nome;
		boolean loop = true;
		boolean loopGame = true;
		int cont = 1;



		System.out.println("Olá,Bem vindo ao nosso jogo!!");
		
		System.out.println();

		
		controlView.informacoes();

		System.out.println();


		while(loopGame == true) {
			controlView.iniciarJogo();

			System.out.println("Digite a quantidade de jogadores:");
			System.out.println(" 2-Jogadores \n 3-Jogadores \n 4-Jogadores");
			qtdJogadores = read.nextInt();
			while(!controlView.qtdJogador(qtdJogadores)) {
				System.out.println("Digite a quantidade jogadores correto de 2-4 jogadores");
				qtdJogadores = read.nextInt();
			}
			while(qtdJogadores != 0) {
				System.out.println("Digite o nome do "+cont+" jogador: ");
				nome = read.next();
				controlView.addJogador(nome);
				cont++;
				qtdJogadores--;
			}


			read.nextLine();

			while(loop == true) {
				System.out.println("---------------------------------------");
				System.out.println("Vez do Jogador: "+controlView.jogadorAtual());
				System.out.println("---------------------------------------");
				System.out.println("Pressione ENTER para jogar o dado: ");
				read.nextLine();
				controlView.jogarDado();
				System.out.println();
				if(controlView.verificadorVencedor()) {
					System.out.println("-------------------------------------------");
					
					System.out.println("JOGADOR VENCEDOR: "+controlView.jogadorAtual());
					
					System.out.println("--------------------------------------------");
					loop = false;
					
				}else {
					controlView.verificarPosicaoAtualJogador();
					controlView.proximoJogador();

				}

			}

			int opc;
			System.out.println("1-Deseja jogar outra partida: 1-SIM \n 2-NAO");
			opc = read.nextInt();

			if(opc == 2) {
				loopGame = false;
			}

		}

	}

}
