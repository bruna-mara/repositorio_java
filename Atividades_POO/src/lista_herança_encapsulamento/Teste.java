package lista_herança_encapsulamento;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {


	    double impostos;

	    Empregado empregado = new Empregado("BRUNA MARA","Rua Antonio Bibiena", "(11) 9 85452125", 30000, 1500);

	    Scanner sc = new Scanner(System.in);



	    System.out.println("Entre com a porcentagem de impostos: ");
	    impostos = sc.nextDouble();



	    System.out.println(empregado.toString());

	    System.out.println("Salário líquido: " + empregado.calcularSalario(impostos) );

	    sc.close();
	}
	}


