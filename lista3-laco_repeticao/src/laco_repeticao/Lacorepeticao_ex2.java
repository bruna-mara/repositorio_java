package laco_repeticao;

import java.util.Scanner;

public class Lacorepeticao_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	
	
	Scanner keyboard = new Scanner(System.in);
	int x, numeroPar=0, numeroImpar=0, numero=0; 

	for (x=1;x<=10;x++)
	{
	System.out.printf("Digite um n�mero: ");
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
	System.out.printf("\nA quantidade de numeros pares �: %d", numeroPar);
	System.out.printf("\nA quantidade de numeros �mpares �: %d", numeroImpar);	
	
	keyboard.close();
}

}