public class Exercicio15 {
    static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    static String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25.0) return "Peso normal";
        if (imc < 30.0) return "Sobrepeso";
        return "Obesidade";
    }

    public static void main(String[] args) {
        double imc = calcularIMC(72.0, 1.75);
        System.out.printf("IMC calculado: %.2f%n", imc);
        System.out.println("Classificação: " + classificarIMC(imc));
    }
}