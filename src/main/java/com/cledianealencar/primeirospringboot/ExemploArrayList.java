package com.cledianealencar.primeirospringboot;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> vendas = new ArrayList<>();
        double total = 0;
        String resposta;

        System.out.println("REGISTRO DE VENDA: ");

        do {
            System.out.println("digite o valor da venda: ");
            double valor = sc.nextDouble();
            vendas.add(valor);
            total = total + valor;

            System.out.println("quer adicionar outra venda (s/n): ");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("s"));
        }
}
