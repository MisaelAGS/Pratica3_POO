package br.com.FolhaDePagamento;

public class FProdutividade extends Funcionario{
    public FProdutividade(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    private double valor;
    private int producao;

    public double getValor() {
        return valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }
    public double calcularProventos(){
        return getSalario() + (getValor() + getProducao());
    }
    public String toString(){
        return "Nome: " + getNome() + "\n" + "Salário: " + calcularProventos() + "\n" + "Matrícula: " + "\n" + getMatricula();
    }
}
