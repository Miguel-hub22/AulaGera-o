package Heranca;

public class funcionarioH extends Gerente1 {
	
	private String nome;
	private String produto;
	
	public funcionarioH(String nome,String produto){
		
		super(Nome,Setor);
		this.getNome();
		this.getSetor();
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	

}
