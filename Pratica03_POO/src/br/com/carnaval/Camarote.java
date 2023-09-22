package br.com.carnaval;

public class Camarote extends Ingresso{
    public Camarote(double valorIngresso) {
        super(valorIngresso);
    }
    private double valorAdicional;
    private String localizacao;

    public Camarote(double valorIngresso, double valorAdicional, String localizacao) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void imprimeIngresso(){
        System.out.println("Ingresso Camarote - Valor: " + (getValorAdicional() + getValorIngresso()));
        System.out.println("Localização: " + getLocalizacao());
    }
}
