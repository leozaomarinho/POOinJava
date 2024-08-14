package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Program {
	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		//Variables
		List<Pessoa>pagadores = new ArrayList<>();
		int pagImpostos;
		
		System.out.println("Entre com o numero de pagadores de impost: ");
		pagImpostos =input.nextInt();
		
		for(int index=1;index<=pagImpostos;index++){
			System.out.println("Pagador #"+index+" dados:");
			System.out.println("Pessoa Fisica ou Pessoa Juridica? pf/pj ");
			String option = input.next();
			Pessoa pagador = null;
			
			//Instanciando os objetos
			if(option.equals("pf")) {
				pagador = new PessoaFisica();
			}
			else if(option.equals("pj")){
				pagador = new PessoaJuridica();
			}
			//System.out.println("Opção inválida, ignorando este pagador.");
            //continue; // pula para o próximo ciclo do loop
            
            String nome;
    		double gastosAnuais;
    		System.out.println("Digite o nome do pagador:");
    		nome=input.nextLine();
    		System.out.println("Digite o ganho anual:");
    		gastosAnuais=input.nextDouble();
    		
    		//Atribuindo valores ao Objeto
    		pagador.setNome(nome);
    		pagador.setRendaAnual(gastosAnuais);
    		
    		if(pagador instanceof PessoaFisica){
    			double gastosSaude = 0;
    			((PessoaFisica) pagador).setGastosSaude(gastosSaude);
    		}
    		else if (pagador instanceof PessoaJuridica){
    			int quantFunc = 0;
    			((PessoaJuridica) pagador).setNumFuncionario(quantFunc);
    		}
    		
    		pagadores.add(pagador);
		}
		//Exibindo os pagadores e os valores
		for(Pessoa pagamentos : pagadores) {
			pagamentos.calcImpost();
		}
		
		input.close();
	}

}
