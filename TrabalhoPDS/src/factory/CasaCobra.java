package factory;

public class CasaCobra implements Casa{
	private int posicaoFim;
	private int posicao;
	private String descricao;
	
	public CasaCobra(int posicao,int posicaoFim) {
		this.posicao = posicao;
		this.posicaoFim  = posicaoFim;
		// TODO Auto-generated constructor stub
	}
	public int getPosicaoFim() {
		return posicaoFim;
	}
	
	public void setPosicaoFim(int posicaoFim) {
		this.posicaoFim = posicaoFim;
	}


	@Override
	public int mover() {
		// TODO Auto-generated method stub
		return  posicaoFim;
	}
	@Override
	public int getPosicao() {
		// TODO Auto-generated method stub
		return posicao;
	}
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return ",voce deu azar caiu na cabeça da cobra sua posicao agora é: ";
	}
	
	
	
}
