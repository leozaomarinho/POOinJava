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
	public double calcImpost() {

		double imposto;
		if(this.numFuncionario>10) {
			imposto=this.rendaAnual*0.14;
		}
		else {
			imposto=this.rendaAnual*0.16;
		}
		
		return imposto;
	}
	
	public String toString(){
		return "Empresa " + nome + ", Imposto pago= " + calcImpost() + "]";

	}
	
	
	
	

}
