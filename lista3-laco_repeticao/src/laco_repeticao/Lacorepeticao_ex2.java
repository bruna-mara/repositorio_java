package laco_repeticao;

import java.util.Scanner;

public class Lacorepeticao_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

	
	
	Scanner keyboard = new Scanner(System.in);
	int x, numeroPar=0, numeroImpar=0, numero=0; 

	for (x=1;x<=10;x++)
	{
	System.out.printf("Digite um número: ");
	numero = keyboard.nextInt();
	
	if((numero%2)==0) 
	{
		numeroPar++;		
	}
	else 
	{
		numeroImpar++;	
	}
}
	System.out.printf("\nA quantidade de numeros pares é: %d", numeroPar);
	System.out.printf("\nA quantidade de numeros ímpares é: %d", numeroImpar);	
	
	keyboard.close();
}

}