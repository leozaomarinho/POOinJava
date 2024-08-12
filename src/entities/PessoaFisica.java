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
	double calcImport() {
		// TODO Auto-generated method stub
		return 0;
	}

}
