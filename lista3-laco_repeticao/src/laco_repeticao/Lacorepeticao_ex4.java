package laco_repeticao;

import java.util.Scanner;

public class Lacorepeticao_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int idade, sexo, temperamento;
		int individuos = 0, mulherNervosa = 0, calma = 0, homemAgressivo = 0, pessoaCalma = 0, pessoaNervosa = 0;
		final int LIMITE = 5;
		
		//teste com 3 pessoas
		while (individuos < LIMITE) {
			System.out.println("Idade do[a] individuo[a]:");
			idade = sc.nextInt();
			System.out.println("Sexo: \n 1 - Masculino\n2-Feminino :");
			sexo = sc.nextInt();
			
			System.out.println("Temperamento da pessoa: \n 1 - Calmo[a] \n 2 - Nervoso[a] \n 3 - Agressivo[a]");
			temperamento = sc.nextInt();
			if(temperamento == 1) {
				calma++;
				if (idade<18) {
					pessoaCalma++;
				}
			}
			else if(sexo ==1 && temperamento == 3) {
				homemAgressivo++;
				
			}
			else if (idade > 40 && temperamento ==2) {
				pessoaNervosa++;
				if (sexo==2) {
					mulherNervosa++;
				}
			}
			individuos++;
			
		}
		System.out.printf("\nTotal de pessoas pesquisadas: %d", individuos);
		System.out.printf("\nNúmero de pessoas calmas: %d", calma);
		System.out.printf("\nMulheres nervosas: %d", mulherNervosa);
		System.out.printf("\nNúmero de homens agressivos: %d",  homemAgressivo);
		System.out.printf("\nNúmero de pessoas nervorsas com mais de 40 anos: %d", pessoaNervosa);
		System.out.printf("\nNúmero de pessoas calmas menores de 18 anos: %d", pessoaCalma);
		
		sc.close();
	}
	}

