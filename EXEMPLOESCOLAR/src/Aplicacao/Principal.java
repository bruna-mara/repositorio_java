package Aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in); // instanciar o teclado read
		Aluno exemploAluno = new Aluno(); // instanciar classe aluno
		
		
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO");
		
		System.out.println("Digite nome do Aluno: ");
		exemploAluno.nomeAluno = read.next().toUpperCase();
		
		System.out.println("Digite o sexo do Aluno: [M/F] ");
		exemploAluno.sexoAluno = read.next().toUpperCase().charAt(0); //O charAt vai ler um caractere específico por isso o 0
		
		exemploAluno.mostra();
		
		
		
		
		
		
		read.close();
	}
	

}
