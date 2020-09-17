package lista_heran�a_encapsulamento;

public class Empregado extends Pessoa {
	

        private int codigoSetor;
        private double salarioBase;


        public Empregado() {

        }

        public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
            super(nome, endereco, telefone);
            this.codigoSetor = codigoSetor;
            this.salarioBase = salarioBase;

        }


        public int getCodigoSetor() {
            return codigoSetor;
        }

        public void setCodigoSetor(int codigoSetor) {
            this.codigoSetor = codigoSetor;
        }

        
        public double getSalarioBase() {
            return salarioBase;
        }
        
        public void setSalarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
        }

        public double calcularSalario(double porcentagemImposto) {

            return (this.salarioBase - (this.salarioBase*porcentagemImposto)/100);
        }

        public String toString() {
            return "Nome: " + getNome() + "\n" + "Endere�o: " + getEndereco() + "\n" + "Telefone: " + getTelefone() + "\n" + "C�digo do Setor: " + getCodigoSetor() + "\n" +"Sal�rio bruto: " + getSalarioBase();
        }
}

