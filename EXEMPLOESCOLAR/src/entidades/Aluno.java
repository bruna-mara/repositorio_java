package entidades;

public class Aluno 
{
			//PRIMEIRO PASSO - ATRIBUTOS (come�ar com public ou private)
			//CRIAR CLASSE Aluno --> entidades
			//nomeAluno[texto/Spring]
			//anoNascimentoAluno[int]
			//sexoAluno[char]
			//turmaAluno[char]
			
		public String nomeAluno;
		public int anoNascimentoAluno;
		public char sexoAluno;
		public char turmaAluno;
		public double notas[] = new double[4]; 

		public void mostra() 
		{
			if (sexoAluno == 'M') 
			{
				System.out.printf("O nome do aluno � %s", nomeAluno);
			}
			else if (sexoAluno == 'F') 
			{
				System.out.printf("O nome da aluna � %s", nomeAluno);
			}
			
		}
}

