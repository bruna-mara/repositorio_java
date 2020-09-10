package lista_2_java;

import java.util.Scanner;

public class laco_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("Digite sua idade: ");
		
		idade= kb.nextInt();
		
		if(idade<10) 
		{
		System.out.printf("Categoria: Infantil.");	
		}
		else if(idade>=10 && idade<=14)
		{
			System.out.printf("Categoria:Infantil.");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.printf("Categoria: Juvenil.");
		}
		else if(idade>=18)
		{
			System.out.printf("Categoria: Adulto.");
		}	
		kb.close();
	}
	
	
}
