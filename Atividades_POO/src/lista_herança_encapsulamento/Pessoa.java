package lista_herança_encapsulamento;
//exercício 1
public class Pessoa
	
	{
		//atributos
		private String nome;
		private String endereco;
		private String telefone;
		
		
		//construtores
		public Pessoa() //construtor padrão
		{
			
		}

		public Pessoa(String nome) //construtor 1 
		{
			
			this.nome = nome;
		}

		
		public Pessoa(String nome, String endereco) //construtor 2 
		{
			super();
			this.nome = nome;
			this.endereco = endereco;
		}
		
		
		public Pessoa(String nome, String endereco, String telefone) // construtor 3 
		{
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
		}

		//getters&setters
		public String getNome() 
		{
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		
		
	}
