package lista_herança_encapsulamento;
//exercicio 2
public class Fornecedor extends Pessoa 
{
	
	private double valorCredito;
	private double valorDivida;
	
	
	//construtores
	
	
	
	public Fornecedor(String nome, double valorCredito, double valorDivida) 
	{
	
	this.valorCredito = valorCredito;
	this.valorDivida = valorDivida;
	}
	
	public Fornecedor(double valorCredito, double valorDivida) 
	{
	
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	//getters&setters
	public double getValorCredito() 
	{
		return valorCredito;
	}
	public double setValorCredito(double valorCredito) 
	{
		return this.valorCredito = valorCredito;
	}
	public double getValorDivida() 
	{
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) 
	{
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo() 
	{
	double saldo;
	saldo = valorCredito - valorDivida;
	System.out.println("Seu saldo é: R$ "+ saldo);
	}
	
}
