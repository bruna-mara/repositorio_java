package lista1_classes_objetos;

public class aviao 
{
	public int 	  codEmbarque;
	public String ciaAerea;
	public String aeroporto;
	public String localPartida;
	public String localDestino;

	
	
	public void mostra() 
	{
		System.out.printf("RELATÓRIO DE EMBARQUE\n");
		System.out.printf("\nCodigo de Embarque: %d ", codEmbarque);
		System.out.printf("\nCia Aérea: %s ", ciaAerea);
		System.out.printf("\nAeroporto: %s", aeroporto);
		System.out.printf("\nLocal de Partida: %s ", localPartida);
		System.out.printf("\nLocal de Destino: %s", localDestino);
			  
		}
	}

