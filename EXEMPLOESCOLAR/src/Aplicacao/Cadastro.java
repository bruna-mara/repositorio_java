package Aplicacao;
import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;
public class Cadastro {
	
	public static void main(String[] args)
	{
		System.out.println("SISTEMA DE CADASTRO:");
		
		Pessoa fulano = new Pessoa("JOAO");
		Pessoa sicrano = new Pessoa("MARIA",'F',1970);
		Aluno alunoAtual= new Aluno("JOSEFINA");
		Pessoa pessoaAtual = new Pessoa("MALAQUIAS");
		Professor novoProfessor = new Professor("LUIZA", "MODULO II");
		
		alunoAtual.setNome("Carla");
		
		fulano.setNome("Paulo");
		
		System.out.println(fulano.getNome());
		
		
	}
}





