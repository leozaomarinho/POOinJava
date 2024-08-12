package entities;

public class PessoaJuridica extends Pessoa {
	private int numFuncionario;
	
	public PessoaJuridica() {
	}


	public int getNumFuncionario() {
		return numFuncionario;
	}

	
	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}


	@Override
	double calcImport() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
