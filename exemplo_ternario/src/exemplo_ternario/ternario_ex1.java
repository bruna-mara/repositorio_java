package exemplo_ternario;


import java.util.Scanner;

public class ternario_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner tec = new Scanner(System.in);
		
		int opcao=0;
		
		System.out.printf(  "Digite: "
				+ "\n        1- Feminina"
				+ "\n        2- Masculina"
				+ "\n        3- Outro ");
		opcao=tec.nextInt();
		
		System.out.print((opcao == 1)? "Voc� � Feminina!" : (opcao == 2)? "Voce � Masculina!" : (opcao==3)? "Voc� � outro patamar!":"Op��o inv�lida.");
				
		tec.close();
				}
		
	}


