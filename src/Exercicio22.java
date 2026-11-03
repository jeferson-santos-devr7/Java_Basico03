public class Exercicio22 {
    static class Conta {
        private double saldo;

        void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            }
        }

        void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            }
        }

        double consultarSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.depositar(500.0);
        minhaConta.sacar(150.0);
        System.out.println("Saldo atual: R$ " + minhaConta.consultarSaldo());
    }
}