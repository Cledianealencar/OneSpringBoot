package Praticando;
public class AppProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setNome("Camiseta");
        p1.setPreco(59.90);
        p1.setQuantidade(10);

        p1.exibirInformacoes();

        // Teste com valores inválidos
        p1.setPreco(-100);  // Deve mostrar "Inválido" e não mudar o preço
        p1.setQuantidade(-5); // Deve mostrar "Inválido"

        // Mostrar de novo pra ver se os valores continuam certos
        p1.exibirInformacoes();
    }
}

