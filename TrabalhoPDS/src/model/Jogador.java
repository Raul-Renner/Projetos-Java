package model;

public class Jogador {
private String nome;
private static int idCont = 0;
private int posicao;

int id;
public Jogador(String nome) {
	super();
	this.nome = nome;
	this.id = idCont;
	this.posicao = 1;
	idCont++;
}

public Jogador() {
	super();
	// TODO Auto-generated constructor stub
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
	this.posicao = posicao;
}


}
