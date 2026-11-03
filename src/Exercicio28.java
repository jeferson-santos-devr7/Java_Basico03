public class Exercicio28 {
    /**
     * Calcula o montante com base em juros simples.
     *
     * @param capital capital inicial aplicado, maior ou igual a zero
     * @param taxa    taxa de juros percentual ao período
     * @param tempo   tempo da aplicação em períodos
     * @return o valor total do montante calculado
     * @throws IllegalArgumentException se o capital ou o tempo forem negativos
     */
    static double calcularJurosSimples(double capital, double taxa, double tempo) {
        if (capital < 0 || tempo < 0) {
            throw new IllegalArgumentException("Capital e tempo não podem ser negativos.");
        }
        return capital + (capital * (taxa / 100.0) * tempo);
    }

    public static void main(String[] args) {
        double montante = calcularJurosSimples(1000.0, 5.0, 2.0);
        System.out.println("Montante final: R$ " + montante);
    }
}