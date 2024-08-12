package entities;

public abstract class Pessoa {
	
	private String nome;
	private double rendaAnual;
		
	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	abstract double calcImport();
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendaAnual=" + rendaAnual + "]";
	}

}
