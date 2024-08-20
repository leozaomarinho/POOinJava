package entities;

public class PessoaFisica extends Pessoa {

	private double gastosSaude;
	
	public PessoaFisica() {
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public String calcImpost() {
		double imposto =0;
		
		if (this.rendaAnual<19999) {
			imposto = rendaAnual*0.15;
		}
		else if(this.rendaAnual>=20000){
			imposto = rendaAnual*0.25;
			
			if (this.gastosSaude>0){
				double disconto = this.gastosSaude/2;
				imposto -=disconto;
			}
		}
		return String.format("%.2f", imposto);
	}
	
	public String toString(){
		return "Pessoa : " + nome + ", Imposto pago : " + calcImpost() + "";
	}
}
