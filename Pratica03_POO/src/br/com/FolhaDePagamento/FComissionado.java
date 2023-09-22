package br.com.FolhaDePagamento;

public class FComissionado extends Funcionario{
    public FComissionado(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    private double percentual;
    private double vendas;

    public double getPercentual() {
        return percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public double calcularProventos(){
        return getSalario() + ((getPercentual() / 100) * getVendas());
    }

    public String toString(){
        return "Nome: " + getNome() + "\n" + "Salário: " + calcularProventos() + "\n" + "Matrícula: " + "\n" + getMatricula();
    }
}
