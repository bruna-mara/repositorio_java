package entidades;

public class Funcionario {
	private String nome;
	private double horas;
	private double valorPorhora;
	
	//construtor
	
	
	public Funcionario(String nome) 
	{
		super();
		this.nome = nome;
	}
	public Funcionario(String nome, double horas, double valorPorhora) 
	{
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorhora = valorPorhora;
	}
	//metodos
	public double pagamento() {
		return (this.horas*this.valorPorhora);
	}
	
	//get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorPorhora() {
		return valorPorhora;
	}
	public void setValorPorhora(double valorPorhora) {
		this.valorPorhora = valorPorhora;
	}
}

