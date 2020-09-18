package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidades.Funcionario;
import entidades.Terceiro;
public class Principal
{
	public static void main(String[] args)
	{
		// Digite o numero de funcionarios para cadastro:
		// quantos funcionarios ?? 1,2,3   <----- ArrayList - tipo funcionario
		// cada funcionario � um objeto
		// lance os dados por objeto
		// pedi o nome --> nome
		//pedi horas
		// valor por hora
		// e os terceiros??? tem quer pra terceiro
		// horas adicionais
			
		// INTERFACE -- List // ArrayList
		
		// mostra nome - salario do funcionario
		
		// variaveis
		int n;
		char ch;
		String nome;
		int hora;
		double valor;
		double valorextra;
		
		
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();// comando maluco
		
		System.out.print("Digite o numero de funcionarios: ");
		n = leia.nextInt();
		System.out.println("-------------------------------------------");
		
		for (int i = 1; i<=n; i++)
		{
			System.out.print("CADASTRO FUNCIONARIO"+i+" :");
			System.out.print("Terceiro [S/N] :");
			ch = leia.next().toUpperCase().charAt(0);
			System.out.print("Nome: ");
			nome = leia.next().toUpperCase();
			System.out.print("Horas trabalhadas: ");
			hora = leia.nextInt();
			System.out.print("Valor da hora trabalhada:");
			valor = leia.nextDouble();
			if (ch == 'S')
			{
				System.out.println("Digite valor extra adicional");
				valorextra = leia.nextDouble();
				//Terceiro exemplo1 = new Terceiro(nome, horas, valorhora, valorextra)
				list.add(new Terceiro(nome, hora, valor, valorextra));
				
				
			}
			else
			{
				list.add(new Funcionario(nome, hora, valor));
			}
			
		}
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (Funcionario func : list) // for each  func item 1 / 2 /3
		{
			System.out.println(func.getNome()+" "+func.pagamento());
		}
		
	}
}