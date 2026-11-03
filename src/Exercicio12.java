public class Exercicio12 {
    static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    static String situacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }

    public static void main(String[] args) {
        double resultadoMedia = media(8.0, 6.5, 7.5);
        System.out.printf("Média: %.2f%n", resultadoMedia);
        System.out.println("Situação: " + situacao(resultadoMedia));
    }
}