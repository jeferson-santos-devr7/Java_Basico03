public class Exercicio26 {
    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            setPreco(preco);
        }

        public void setPreco(double preco) {
            if (preco > 0) {
                this.preco = preco;
            } else {
                throw new IllegalArgumentException("O preço deve ser maior que zero.");
            }
        }

        public double getPreco() {
            return preco;
        }

        public String getNome() {
            return nome;
        }
    }

    public static void main(String[] args) {
        Produto p = new Produto("Caderno", 25.0);
        System.out.println("Produto: " + p.getNome() + " | Preço: R$ " + p.getPreco());
    }
}