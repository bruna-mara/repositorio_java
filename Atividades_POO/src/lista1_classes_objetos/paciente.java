package lista1_classes_objetos;

public class paciente {
	
	public String nomePaciente;
	public int matriculaPaciente;
	public String datanascimentoPaciente;
	public char sexoPaciente;

	public void mostra() 
	{
		System.out.printf("Matr�cula: %d ", matriculaPaciente);
		System.out.printf("\nPaciente: %s ", nomePaciente);
		System.out.printf("\nSexo: %s ", sexoPaciente);
		System.out.printf("\nData de Anivers�rio: %s ", datanascimentoPaciente);		  
	}
	
	
}
