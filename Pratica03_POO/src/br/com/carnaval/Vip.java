package br.com.carnaval;

public class Vip extends Ingresso{

    public Vip(double valorIngresso) {
        super(valorIngresso);
    }
    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public void imprimeIngresso(){
        System.out.println("Ingresso VIP - Valor: " + (getValorAdicional() + getValorIngresso()));
    }
}
