package com.cledianealencar.primeirospringboot;
import java.util.Scanner;

public class ExemploArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vendas = new double[5]; // array com 5 vendas
        double total = 0;

        System.out.println("=== Registro de Vendas ===");

        for (int i = 0; i < vendas.length; i++) {
            System.out.print("Digite o valor da venda " + (i + 1) + ": R$ ");
            vendas[i] = scanner.nextDouble();
            total += vendas[i]; // vai somando o total
        }

        System.out.println("Total de vendas do dia: R$ " + total);
    }
}
