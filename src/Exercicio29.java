public class Exercicio29 {
    static void exibirCabecalho() { System.out.println("--- SISTEMA DE VENDAS ---"); }
    static double calcularBruto(double preco, int qtd) { return preco * qtd; }
    static double calcularDesconto(double bruto) { return bruto >= 200 ? bruto * 0.1 : 0.0; }
    static double calcularFinal(double bruto, double desc) { return bruto - desc; }
    static void exibirResultado(double finalTotal) { System.out.println("Total a pagar: R$ " + finalTotal); }

    public static void main(String[] args) {
        exibirCabecalho();
        double bruto = calcularBruto(120.0, 2);
        double desc = calcularDesconto(bruto);
        double total = calcularFinal(bruto, desc);
        exibirResultado(total);
    }
}