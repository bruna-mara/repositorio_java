package lista1_classes_objetos;

import java.util.Scanner;

public class exAviao {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	aviao novocheckin = new aviao();
	
	System.out.println("RELAT�RIO DE EMBARQUE\n");
	
	System.out.println("Digite o c�digo de embarque: ");
	novocheckin.codEmbarque = leia.nextInt();
	
	leia.nextLine();

	System.out.println("Digite Companhia A�rea: ");
	novocheckin.ciaAerea = leia.nextLine().toUpperCase();
	
	System.out.println("Digite Aeroporto: ");
	novocheckin.aeroporto = leia.nextLine().toUpperCase();
	
	System.out.println("Digite local de partida: ");
	novocheckin.localPartida = leia.nextLine().toUpperCase();
	
	System.out.println("Digite o destino: ");
	novocheckin.localDestino = leia.nextLine().toUpperCase();
	
	novocheckin.mostra();
	
	leia.close();
	
	
	
			
	
			
		
		
		
		
	}
}
