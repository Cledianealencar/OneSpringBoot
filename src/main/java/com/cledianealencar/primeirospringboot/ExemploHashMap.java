package com.cledianealencar.primeirospringboot;

import java.util.HashMap;
import java.util.Scanner;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // adicionando manualmente os itens
        estoque.put("maca", 15);
        estoque.put("a", 25);
        estoque.put("b", 35);
        estoque.put("c", 45);
        estoque.put("limao", 55);

        System.out.println("ESTOQUE:");

        for (String produto : estoque.keySet()) {
            System.out.println(produto + " : " + estoque.get(produto) + " unidades.");
        }

        // buscar produto
        System.out.println("\nProcurar produto: ");
        String buscar = sc.nextLine();

        if (estoque.containsKey(buscar)) {
            int quantidade = estoque.get(buscar);
            System.out.println("Temos: " + quantidade + " do produto: " + buscar);
        } else {
            System.out.println("Produto não encontrado!");
        }

        System.out.println("\nQuer adicionar mais produtos? (s/n)");
        String resposta = sc.nextLine();

        // DECLARAR ANTES do if
        String adicionarProduto = "";
        int quantidadeDoProduto = 0;

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Qual produto deseja adicionar?");
            adicionarProduto = sc.nextLine();

            System.out.println("Quantas unidades deseja adicionar?");
            quantidadeDoProduto = sc.nextInt();
        }

        // atualizar a quantidade
        if (!adicionarProduto.equals("")) {
            if (estoque.containsKey(adicionarProduto)) {
                int novaQuantidade = estoque.get(adicionarProduto) + quantidadeDoProduto;
                estoque.put(adicionarProduto, novaQuantidade);
                System.out.println("Produto atualizado com sucesso!");
            } else {
                // adicionar o novo produto
                estoque.put(adicionarProduto, quantidadeDoProduto);
                System.out.println("Produto novo adicionado ao estoque!");
            }
        }

        System.out.println("\nEstoque FINAL:");
        for (String produtos : estoque.keySet()) {
            System.out.println(produtos + " : " + estoque.get(produtos) + " UNIDADES! ");
        }

        sc.close();
    }
}
