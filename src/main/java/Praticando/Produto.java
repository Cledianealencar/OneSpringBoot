package Praticando;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("nao pode");
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("nao pode");
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Exibir informações
    public void exibirInformacoes() {
        System.out.println("Produto: " + getNome());
        System.out.printf("Preço: R$%.2f\n", getPreco());
        System.out.println("Quantidade em estoque: " + getQuantidade());
    }
}
