public class Exercicio10 {
    static String parOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    public static void main(String[] args) {
        System.out.println("O número 4 é: " + parOuImpar(4));
        System.out.println("O número 9 é: " + parOuImpar(9));
    }
}