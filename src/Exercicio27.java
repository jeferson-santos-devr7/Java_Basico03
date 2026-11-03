public class Exercicio27 {
    static void validarQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade do pedido deve ser maior que zero.");
        }
        System.out.println("Quantidade válida: " + quantidade);
    }

    public static void main(String[] args) {
        validarQuantidade(5);
        // validarQuantidade(0); // Lançará exceção
    }
}