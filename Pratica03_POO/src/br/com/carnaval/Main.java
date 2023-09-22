package br.com.carnaval;

public class Main {
    public static void main(String[] args) {
        Normal ingresso1 = new Normal(50.0);
        ingresso1.imprimeIngresso();
        Vip ingresso2 = new Vip(50, 50);
        ingresso2.imprimeIngresso();
        Camarote ingresso3 = new Camarote(50.0, 100.0, "A");
        ingresso3.imprimeIngresso();
    }
}
