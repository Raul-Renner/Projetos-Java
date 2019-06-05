package model;

public class Jogador {
private String nome;
private static int id = 0;
private int posicao;

public Jogador(String nome) {
	super();
	this.nome = nome;
	this.id += 1;
	this.posicao = posicao;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getId() {
	return id;
}

public int getPosicao() {
	return posicao;
}
public void setPosicao(int posicao) {
	this.posicao += posicao;
}


}
