public class Exercicio07 {
    static double quadrado(double n) {
        return n * n; // ou Math.pow(n, 2)
    }

    public static void main(String[] args) {
        System.out.println("Quadrado de 5.5: " + quadrado(5.5));
    }
}