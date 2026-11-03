public class Exercicio04 {
    static boolean ehPositivo(int numero) {
        return numero > 0;
    }

    public static void main(String[] args) {
        System.out.println("10 é positivo? " + ehPositivo(10));
        System.out.println("-3 é positivo? " + ehPositivo(-3));
    }
}