package Application;




import java.util.Scanner;

import Entities.Cachorro;
import Entities.Cavalo;
import Entities.Preguica;

public class Principal {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	Cachorro cachorro1 = new Cachorro("Cachorro chamado SnoopDogg", 12,"latir", "correr");
	Cavalo cavalo1 = new Cavalo("Cavalo chamado HorseMan", 9, "relinchar", "trota");
	Preguica preguica1 = new Preguica("Preguiça chamado Lazy", 15, "hammmmmmmmm","pendura em árvores");
	
	cachorro1.exibir();
	cavalo1.exibir();
	preguica1.exibir();
	
	sc.close();
}
}
