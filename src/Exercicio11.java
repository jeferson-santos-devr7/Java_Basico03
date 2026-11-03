public class Exercicio11 {
    static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    static double calcularDesconto(double subtotal) {
        return subtotal * 0.10;
    }

    static double calcularTotal(double subtotal, double desconto) {
        return subtotal - desconto;
    }

    public static void main(String[] args) {
        double sub = calcularSubtotal(150.0, 2);
        double desc = calcularDesconto(sub);
        double total = calcularTotal(sub, desc);

        System.out.println("Subtotal: R$ " + sub);
        System.out.println("Desconto: R$ " + desc);
        System.out.println("Total Final: R$ " + total);
    }
}