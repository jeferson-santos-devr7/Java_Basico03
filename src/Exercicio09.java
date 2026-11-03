public class Exercicio09 {
    static String saudacao(String nome) {
        return "Olá, " + nome + "! Seja muito bem-vindo(a).";
    }

    public static void main(String[] args) {
        String mensagem = saudacao("Beatriz");
        System.out.println(mensagem);
    }
}