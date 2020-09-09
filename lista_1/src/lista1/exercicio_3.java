package lista1;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempoTotal = 0, tempoHs,tempoMin, tempoSeg;
		
		Scanner keyboard = new Scanner (System.in); 
		System.out.println("Quantos segundos durou o evento? ");
		tempoTotal = keyboard.nextInt();
		
		tempoHs=(tempoTotal/3600);
		tempoMin=(tempoTotal%3600/60);
		tempoSeg=(tempoTotal%3600%60)%60;
		
		System.out.printf("O evento durou %d horas, %d minutos, %d segundos" , tempoHs, tempoMin, tempoSeg);
	}

}
