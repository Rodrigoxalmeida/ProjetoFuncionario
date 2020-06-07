package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioT;

public class ProgramFuncionario {

	public static void main(String[] args) {

		// CRIA UM SCANNER PARA LEITURA
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		// CRIA UMA LISTA DE FUNCION·RIOS
		List<Funcionario> listaFuncionario = new ArrayList<>();

		// PEDE A QUANTIDADE DE FUNCION¡RIOS
		System.out.print("Quantidade de funcion·rios: ");
		int qtdFunc = sc.nextInt();

		// PERCORRE A LISTA E ADD FUNCIONARIOS NA LISTA
		for (int i = 1; i <= qtdFunc; i++) {

			System.out.print("Funcionario #" + i + ":" + "\n");
			System.out.print("Funcionario È terceirizado (y/n)?");
			char resposta = sc.next().charAt(0); // FAZ A LEITURA SE … SIM OU N√O
			System.out.print("Nome: ");
			sc.nextLine();// CONSUMINDO A QUEBRA DE LINHA
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por horas: ");
			double valorHora = sc.nextDouble();
			
			if (resposta == 'y') { // SE FOR UM FUNCIONARIO TERCEIRIZADO VAI CRIAR UMA INSTACIA DE FUNCIONARIO
									// TERCEIRIZADO
				System.out.print("Taxa bÙnus: ");
				double taxaB = sc.nextDouble();
				FuncionarioT funcionarioT = new FuncionarioT(nome, horas, valorHora, taxaB);
				listaFuncionario.add(funcionarioT); //ADD UM FUNCIONARIO TERCEIRIZADO NA LISTA
				
				//OU PODE INSTANCIAR O FUNCIONARIO DIRETO NA LISTA
				/*listaFuncionario.add(new FuncionarioT(nome,horas,valorHora, taxaB));*/
			}else {
				Funcionario funcionario = new Funcionario(nome,horas,valorHora);
				listaFuncionario.add(funcionario); //ADD UM FUNCIONARIO NORMAL NA LISTA  
				
				//OU PODE INSTANCIAR O FUNCIONARIO DIRETO NA LISTA
				/*listaFuncionario.add(new Funcionario(nome,horas,valorHora);*/
			}

		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		
		//PERCORRENDO A LISTA E MOSTRANSDO OS RESULTADOS
		//PARA CADA FUNCIONARIO -> FUNCIONARIO NA MINHA LISTAFUNCIONARIO IMPRIMA NA TELA
		for(Funcionario funcionario: listaFuncionario) {
			System.out.println(funcionario.getNome() + "- R$: " + String.format("%.2f" , funcionario.pagamentos()));
			
		}
		

		sc.close();

	}

}
