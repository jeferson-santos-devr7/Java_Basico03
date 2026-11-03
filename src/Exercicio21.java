import java.util.Arrays;

public class Exercicio21 {
    static int[] menorEMaior(int[] valores) {
        int menor = valores[0];
        int maior = valores[0];
        for (int v : valores) {
            if (v < menor) menor = v;
            if (v > maior) maior = v;
        }
        return new int[]{menor, maior};
    }

    public static void main(String[] args) {
        int[] dados = {14, 2, 45, 9, 31};
        int[] resultado = menorEMaior(dados);
        System.out.println("Menor e Maior: " + Arrays.toString(resultado));
    }
}