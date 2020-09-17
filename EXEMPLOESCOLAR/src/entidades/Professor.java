package entidades;

public class Professor extends Pessoa 
{
	private String materiaLecionada;

	public Professor(String nome, String materiaLecionada) 
	{
		super(nome);
		this.materiaLecionada = materiaLecionada;
	}
	
	
	public Professor(String nome, char sexo, int anoNasc, String etnia, String materiaLecionada) 
	{
		super(nome, sexo, anoNasc, etnia);
		this.materiaLecionada = materiaLecionada;
	}
	
	
}
