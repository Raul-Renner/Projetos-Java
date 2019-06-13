package controller;

import java.util.ArrayList;
import java.util.Random;

import factory.Casa;
import factory.FactoryCasaEspecial;
import model.Jogador;
import model.Posicao;

public class ControllerJogo{
	private static ControllerJogo controlJogo;
	
	
	public static ControllerJogo getInstance() {
		if(controlJogo == null) {
			controlJogo = new ControllerJogo();
			
			
		}
		return controlJogo;
	}
	
	ControllerDaVez controlVez;
	private ArrayList<Posicao>posicoesCobra;
	private	ArrayList<Posicao>posicoesEscada;
	
	
	private FactoryCasaEspecial facEspecial;

	private ArrayList<Casa>casasEspeciais;
	Random random;
	
	private ControllerJogo() {
		casasEspeciais = new ArrayList<Casa>();
		facEspecial = new FactoryCasaEspecial();
		posicoesEscada = new ArrayList<Posicao>();
		posicoesCobra = new ArrayList<Posicao>();
		controlVez = new ControllerDaVez();
		random = new Random();
	}
	
	
	public void iniciarJogo() {
		criarPosicoesEspeciais();
		for(int i = 0; i < 7;i++) {
			casasEspeciais.add(facEspecial.getCasaEspecial("casa escada", posicoesEscada.get(i).getPosicao(), posicoesEscada.get(i).getPosicaoFim()));
			casasEspeciais.add(facEspecial.getCasaEspecial("casa cobra", posicoesCobra.get(i).getPosicao(), posicoesCobra.get(i).getPosicaoFim()));
			
		}
		casasEspeciais.add(facEspecial.getCasaEspecial("casa carta",16,0));
		casasEspeciais.add(facEspecial.getCasaEspecial("casa carta",8,0));
		casasEspeciais.add(facEspecial.getCasaEspecial("casa carta",35,0));
		casasEspeciais.add(facEspecial.getCasaEspecial("casa carta",96,0));
		casasEspeciais.add(facEspecial.getCasaEspecial("casa carta",23,0));
		casasEspeciais.add(facEspecial.getCasaEspecial("casa carta",85,0));
	}
	
	public void addJogador(String nome) {
		controlVez.cadastroJogadoresPartida(nome);
	}
	
	public Jogador proximoJogador() {
		Jogador jg  = controlVez.nextPlayer();
		return jg;
	}
	
	public String atualJogador() {
		 Jogador jg = controlVez.actualPlayer();
		return jg.getNome();
	}
	public boolean verificarVencedor() {
		Jogador jg = controlVez.actualPlayer();
		
		if(jg.getPosicao() >= 100) {
			return true;
		}else {
			return false;
		}
	}
	public int jogarDado() {
		int numSorteio = random.nextInt(6) + 1;
		atualizarPosicaoJogador(numSorteio);
		return numSorteio;
	}
	public void atualizarPosicaoJogador(int valorPosicao) {
		Jogador jg = controlVez.actualPlayer();
		jg.setPosicao(jg.getPosicao() + valorPosicao);
	}
	
	
	public String verificarPosicaoJogador(){
		Jogador jg = controlVez.actualPlayer();
		
		for(int i = 0; i < casasEspeciais.size();i++) {
			if(jg.getPosicao() == casasEspeciais.get(i).getPosicao()) {
				jg.setPosicao(casasEspeciais.get(i).mover());
				
				return "Jogador "+jg.getNome()+" "+casasEspeciais.get(i).getDescricao()+" "+jg.getPosicao();
			}
		}
		
		return "Jogador "+jg.getNome()+" esta na posicao: "+jg.getPosicao();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void criarPosicoesEspeciais() {
		posicoesCobra.add(new Posicao(40,3));
		posicoesCobra.add(new Posicao(27,5));
		posicoesCobra.add(new Posicao(43,18));
		posicoesCobra.add(new Posicao(66,45));
		posicoesCobra.add(new Posicao(76,58));
		posicoesCobra.add(new Posicao(99,41));
		posicoesCobra.add(new Posicao(89,68));
		
		posicoesEscada.add(new Posicao(4,25));
		posicoesEscada.add(new Posicao(13,46));
		posicoesEscada.add(new Posicao(42,63));
		posicoesEscada.add(new Posicao(50,69));
		posicoesEscada.add(new Posicao(62,81));
		posicoesEscada.add(new Posicao(74,92));
		posicoesEscada.add(new Posicao(48,93));
		
		
	}
}
