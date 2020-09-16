package lista1_classes_objetos;

import java.util.Scanner;		

public class exCliente {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		cliente novoCliente = new cliente();
		
		System.out.println("**GENERATION STORE**\n");
		
		System.out.println("Digite seu nome: \n");
		novoCliente.nomeCliente = kb.next().toUpperCase();
		
		kb.nextLine();
		
		System.out.println("Sexo[M/F]:");
		novoCliente.sexoCliente = kb.next().toUpperCase().charAt(0);
		
		kb.nextLine();
		//limpa o buffer de memória do teclado
		
		System.out.println("Data de Aniversário: ");
		novoCliente.aniversarioCliente = kb.nextLine();
		
		novoCliente.mostra();
		
		kb.close();
	}

}
