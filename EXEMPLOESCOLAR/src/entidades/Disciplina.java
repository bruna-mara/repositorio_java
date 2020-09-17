package entidades;
public class Disciplina
{
	String nomeDisciplina;
	int nivelDisciplina;
	
	//CONSTRUTORES - criar objeto
	public Disciplina(String nomeDisciplina)
	{
		this.nomeDisciplina = nomeDisciplina;
	}

	public Disciplina(String nomeDisciplina, int nivelDisciplina) 
	{
		this.nomeDisciplina = nomeDisciplina;
		this.nivelDisciplina = nivelDisciplina;
	}
	//SEGURANÇA - metodo GETTERS(pega a informação) and SETTERS (modifica informação) GERALMENTE DEPOIS DOS CONSTRUTORES
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getNivelDisciplina() {
		return nivelDisciplina;
	}

	public void setNivelDisciplina(int nivelDisciplina) {
		this.nivelDisciplina = nivelDisciplina;
	}
	
}
