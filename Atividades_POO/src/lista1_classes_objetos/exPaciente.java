package lista1_classes_objetos;

import java.util.Scanner;

public class exPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		paciente novoPaciente = new paciente();
		
		System.out.println("**GENERATION HOSPITAL**\n");
		
		System.out.println("Digite a matrícula: \n");
		novoPaciente.matriculaPaciente = kb.nextInt();
				
		System.out.println("Digite seu nome: \n");
		novoPaciente.nomePaciente = kb.next().toUpperCase();
		
		kb.nextLine();
		
		System.out.println("Sexo[M/F]:");
		novoPaciente.sexoPaciente = kb.next().toUpperCase().charAt(0);
		
		kb.nextLine();
		
		System.out.println("Data de Nascimento: /n");
		novoPaciente.datanascimentoPaciente = kb.nextLine();
		
		novoPaciente.mostra();
		
		kb.close();
	}

}
