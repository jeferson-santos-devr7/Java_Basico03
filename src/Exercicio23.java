import java.util.Arrays;

public class Exercicio23 {
    static void alterarPrimitivo(int numero) {
        numero = 100; // Altera apenas a cópia local
    }

    static void alterarArray(int[] array) {
        array[0] = 999; // Altera o conteúdo apontado pela referência
    }

    public static void main(String[] args) {
        int valor = 10;
        alterarPrimitivo(valor);
        System.out.println("Valor primitivo após método: " + valor);
        // Saída continua 10, pois primitivos são copiados por valor.

        int[] meuArray = {1, 2, 3};
        alterarArray(meuArray);
        System.out.println("Array após método: " + Arrays.toString(meuArray));
        // Saída altera o primeiro elemento para 999, pois o valor passado foi a referência do objeto.
    }
}