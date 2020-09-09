package lista1;

import java.util.Scanner;    

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorDias, valorMeses, valorAnos;
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Quantos dias você viveu?");
		valorDias = keyboard.nextInt();
		valorAnos=valorDias/365;
		valorMeses=(valorDias%365/30);
		valorDias=(valorDias%365)%30;
		System.out.printf("Você tem %d anos, %d meses e %d dias", valorAnos, valorMeses, valorDias);
	}

}
