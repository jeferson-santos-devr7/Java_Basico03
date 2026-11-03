public class Exercicio19 {
    static boolean validarSenha(String senha) {
        if (senha == null) return false;
        if (senha.isBlank()) return false;
        if (senha.length() < 8) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Senha '123': " + validarSenha("123"));
        System.out.println("Senha 'senhaSegura2026': " + validarSenha("senhaSegura2026"));
    }
}