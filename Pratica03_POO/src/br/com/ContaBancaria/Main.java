package br.com.ContaBancaria;

public class Main{
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1247, 1000);
        c1.depositar(50);
        c1.sacar(500);
        System.out.println(c1.consultarSaldo());
        System.out.println(c1.consultarSaldoTotal());
        Conta c2 = new Conta(1478);
        c2.depositar(50);
        c2.sacar(500);
        System.out.println(c2.consultarSaldo());
    }
}