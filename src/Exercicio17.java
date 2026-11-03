public class Exercicio17 {
    static int somar(int... valores) {
        int total = 0;
        for (int valor : valores) {
            total += valor;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Soma (2, 3): " + somar(2, 3));
        System.out.println("Soma (1, 2, 3, 4, 5): " + somar(1, 2, 3, 4, 5));
    }
}