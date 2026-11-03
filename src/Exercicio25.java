import java.util.Optional;

public class Exercicio25 {
    static Optional<String> buscarNome(String[] nomes, String alvo) {
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(alvo)) {
                return Optional.of(nome);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String[] lista = {"Ana", "Bruno", "Carla"};
        String encontrado = buscarNome(lista, "Bruno").orElse("Não encontrado");
        String ausente = buscarNome(lista, "Daniel").orElse("Não encontrado");

        System.out.println("Busca 1: " + encontrado);
        System.out.println("Busca 2: " + ausente);
    }
}