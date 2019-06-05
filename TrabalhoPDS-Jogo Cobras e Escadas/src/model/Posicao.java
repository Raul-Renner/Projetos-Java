package model;

public class Posicao {
private int posicao;
private int posicaoFim;
public Posicao(int posicao, int posicaoFim) {
	super();
	this.posicao = posicao;
	this.posicaoFim = posicaoFim;
}
public int getPosicao() {
	return posicao;
}
public void setPosicao(int posicao) {
	this.posicao = posicao;
}
public int getPosicaoFim() {
	return posicaoFim;
}
public void setPosicaoFim(int posicaoFim) {
	this.posicaoFim = posicaoFim;
}


}
