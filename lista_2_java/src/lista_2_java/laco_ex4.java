package lista_2_java;

import java.util.*;

public class laco_ex4 {

	
	public static void main (String args[]) {
		
		
		 Scanner kb = new Scanner (System.in);
		 
		
		 double numero, raiz , quadrado;
		 
		 System.out.println("Digite um numero: ");	
		 numero = kb.nextDouble();
		 
		 if(numero% 2 == 0)
		 {	 
		   raiz = Math.sqrt(numero);
		   System.out.printf("O numero digitado � %.2f par e sua raiz quadrada �  %.2f",numero,raiz);	 
		 }
		 
		 else
		 {
			quadrado = Math.pow(numero,2);
			System.out.printf("O n�mero digitado � %.2f impar e elevado ao quadrado fica %.2f ",numero,quadrado) ;
		 }
		
		
		 kb.close();
	}
}

	