public class Exercicio30 {
    static <T> T primeiro(T[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio.");
        }
        return valores[0];
    }

    public static void main(String[] args) {
        String[] palavras = {"Java", "Python", "C#"};
        Integer[] numeros = {10, 20, 30};

        System.out.println("Primeira palavra: " + primeiro(palavras));
        System.out.println("Primeiro número: " + primeiro(numeros));
    }
}