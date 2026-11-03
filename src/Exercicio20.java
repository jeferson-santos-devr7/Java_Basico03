public class Exercicio20 {
    static int contarPares(int[] numeros) {
        int contador = 0;
        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[] meuArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Quantidade de números pares: " + contarPares(meuArray));
    }
}