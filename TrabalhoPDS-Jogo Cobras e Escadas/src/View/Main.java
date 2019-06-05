//package View;
//
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.stream.IntStream;
//
//import factory.Casa;
//import factory.CasaCobra;
//import factory.FactoryCasaEspecial;
//import model.Posicao;
//
//public class Main {
//public static void main(String[] args) {
//	ArrayList<Posicao>posicoesCobra = new ArrayList<Posicao>();
//	ArrayList<Posicao>posicoesEscada = new ArrayList<Posicao>();
//	
//	ArrayList<Casa>casaEspeciais = new ArrayList<Casa>();
//	FactoryCasaEspecial facEspecial = new FactoryCasaEspecial();
//	posicoesCobra.add(new Posicao(40,3));
//	posicoesCobra.add(new Posicao(27,5));
//	posicoesCobra.add(new Posicao(43,18));
//	posicoesCobra.add(new Posicao(66,45));
//	posicoesCobra.add(new Posicao(76,58));
//	posicoesCobra.add(new Posicao(99,41));
//	posicoesCobra.add(new Posicao(89,68));
//	
//	posicoesEscada.add(new Posicao(4,25));
//	posicoesEscada.add(new Posicao(13,46));
//	posicoesEscada.add(new Posicao(42,63));
//	posicoesEscada.add(new Posicao(50,69));
//	posicoesEscada.add(new Posicao(62,81));
//	posicoesEscada.add(new Posicao(74,92));
//	posicoesEscada.add(new Posicao(48,93));
//	
//	
//		for(int j = 0; j < 7;j++) {
//			casaEspeciais.add(facEspecial.getCasaEspecial("casa escada", posicoesEscada.get(j).getPosicao(), posicoesEscada.get(j).getPosicaoFim()));
//			casaEspeciais.add(facEspecial.getCasaEspecial("casa cobra", posicoesCobra.get(j).getPosicao(), posicoesCobra.get(j).getPosicaoFim()));
//			
//			}
//		casaEspeciais.add(facEspecial.getCasaEspecial("casa carta", 16, 0));
//
//	int jogador = 16;	
//	for(int i = 0; i < casaEspeciais.size();i++) {
//		if(jogador == casaEspeciais.get(i).getPosicao()) {
//			jogador = casaEspeciais.get(i).mover();
//		}
//	}
//		System.out.println(jogador);
//	
//		
//	}
//}
