public class Exercicio24 {
    static double calcularFrete(double pesoKg) {
        return 10.0 + (pesoKg * 2.5);
    }

    static double calcularFrete(double pesoKg, double distanciaKm) {
        return 10.0 + (pesoKg * 2.5) + (distanciaKm * 0.15);
    }

    static double calcularFrete(double pesoKg, double distanciaKm, boolean expresso) {
        double base = calcularFrete(pesoKg, distanciaKm);
        return expresso ? base * 1.5 : base;
    }

    public static void main(String[] args) {
        System.out.println("Frete 1: R$ " + calcularFrete(3.0));
        System.out.println("Frete 2: R$ " + calcularFrete(3.0, 50.0));
        System.out.println("Frete 3: R$ " + calcularFrete(3.0, 50.0, true));
    }
}