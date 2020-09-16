package lista1_classes_objetos;

public class cliente 
{
	public String nomeCliente;
	public int docCliente;
	public String aniversarioCliente;
	public char sexoCliente;
	
	
	public void mostra() 
	{
		System.out.printf("SEJA BEM-VINDE À GENERATION STORE!\n");
		System.out.printf("\nCliente: %s ", nomeCliente);
		System.out.printf("\nSexo: %s ", sexoCliente);
		System.out.printf("\nData de Aniversário: %s ", aniversarioCliente);
		  
	}
	
	
}
