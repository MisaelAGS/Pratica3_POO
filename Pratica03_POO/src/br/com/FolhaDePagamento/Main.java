package br.com.FolhaDePagamento;

public class Main {
    public static void main(String[] args) {

        FPadrao fp = new FPadrao(1, "Jennifer", 10000);
        System.out.println(fp.toString());
        FComissionado fc = new FComissionado(2, "João", 1500);
        System.out.println(fc.toString());
        FProdutividade fpp = new FProdutividade(3, "Misael", 2000);
    }
}
