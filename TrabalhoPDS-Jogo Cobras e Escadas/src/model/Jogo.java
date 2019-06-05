package model;

import java.util.ArrayList;
import java.util.Random;

import factory.Casa;
import factory.FactoryCasaEspecial;

public class Jogo {
private ArrayList<Posicao>posicoesCobra = new ArrayList<Posicao>();
private	ArrayList<Posicao>posicoesEscada = new ArrayList<Posicao>();
private FactoryCasaEspecial facEspecial;

private ArrayList<Casa>casasEspeciais;
Random random = new Random();

public Jogo() {
	casasEspeciais = new ArrayList<Casa>();
	facEspecial = new FactoryCasaEspecial();
}

public void iniciarJogo() {
	criarPosicoesEspeciais();
	for(int i = 0; i < 7;i++) {
		casasEspeciais.add(facEspecial.getCasaEspecial("casa escada", posicoesEscada.get(i).getPosicao(), posicoesEscada.get(i).getPosicaoFim()));
		casasEspeciais.add(facEspecial.getCasaEspecial("casa cobra", posicoesCobra.get(i).getPosicao(), posicoesCobra.get(i).getPosicaoFim()));
		
	}
}


public int jogarDado() {
	int numSorteio = random.nextInt(6) + 1;
	return numSorteio;
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
	
	casasEspeciais.add(facEspecial.getCasaEspecial("Casa",16,0));
	casasEspeciais.add(facEspecial.getCasaEspecial("Casa",8,0));
	casasEspeciais.add(facEspecial.getCasaEspecial("Casa",35,0));
	casasEspeciais.add(facEspecial.getCasaEspecial("Casa",96,0));
	casasEspeciais.add(facEspecial.getCasaEspecial("Casa",23,0));
	casasEspeciais.add(facEspecial.getCasaEspecial("Casa",85,0));
}
}
