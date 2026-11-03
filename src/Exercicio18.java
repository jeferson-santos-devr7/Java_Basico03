public class Exercicio18 {
    static void demonstrarFinal(final int numero) {
        // numero = 15; // Erro de compilação se descomentado: não é permitido alterar um parâmetro final
        int resultado = numero + 10;
        System.out.println("Resultado seguro com parâmetro final: " + resultado);
    }

    public static void main(String[] args) {
        demonstrarFinal(5);
    }
}