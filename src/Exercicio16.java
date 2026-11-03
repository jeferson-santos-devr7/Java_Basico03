public class Exercicio16 {
    static void imprimir(String texto) {
        System.out.println("Imprimindo String: " + texto);
    }

    static void imprimir(int numero) {
        System.out.println("Imprimindo Inteiro: " + numero);
    }

    static void imprimir(double valor) {
        System.out.println("Imprimindo Decimal: " + valor);
    }

    public static void main(String[] args) {
        imprimir("Olá, Java!");
        imprimir(2026);
        imprimir(99.90);
    }
}