package lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int anos, meses, dias, totaldias;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Digite quantos anos voc� viveu: ");
    anos = keyboard.nextInt();
    System.out.println("Digite quantos meses voc� viveu: ");
    meses = keyboard.nextInt();
    System.out.println("Digite quantos dias voc� viveu");
    dias = keyboard.nextInt();
    totaldias= (anos*365) + (meses*30) + (dias*1);
    System.out.printf("O total de dias vividos �: %d", totaldias);
	}

}
