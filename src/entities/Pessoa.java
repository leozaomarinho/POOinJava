package entities;

public abstract class Pessoa {
	
	protected String nome;
	protected double rendaAnual;
		
	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRendaAnual() {
		return String.format("%.2f", rendaAnual);
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract String calcImpost();
	
	@Override
	public String toString() {
		return "Pessoa nome : " + nome + ", rendaAnual : " + getRendaAnual() + "";
	}
}
