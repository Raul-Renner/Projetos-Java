package repositorio;

import java.util.ArrayList;

import model.Posicao;

public class Repositorio {
	private ArrayList<Posicao>posicoesCobra;
	private	ArrayList<Posicao>posicoesEscada;
	public Repositorio() {
		super();
		this.posicoesCobra =  new ArrayList<Posicao>();
		this.posicoesEscada = new ArrayList<Posicao>();
	}
	
}
