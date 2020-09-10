package lista_2_java;

import java.util.Scanner;

public class laco_ex2 {
	
public static void main(String[] args) {

	int num1, num2, num3;
	Scanner kb = new Scanner (System.in);
	
	System.out.printf("Digite o primeiro número: ");
	num1 = kb.nextInt();
	System.out.printf("Digite o segundo número: ");
	num2 = kb.nextInt();
	System.out.print("Digite o terceiro número: ");
	num3 = kb.nextInt();
	
	if(num1>num2 && num2>num3)
	{
		System.out.printf("%d...%d...%d",num3,num2,num1) ;
	}
	else if(num2>num1 && num2>num3) 
	{
		System.out.printf("%d...%d...%d",num3,num1,num2) ;
	}
	else if(num3>num2 && num3>num1)
	{
		System.out.printf("%d...%d...%d",num1,num2,num3) ;
	}
	kb.close();
}	
}

