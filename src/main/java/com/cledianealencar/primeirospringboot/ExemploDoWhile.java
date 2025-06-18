package com.cledianealencar.primeirospringboot;
import java.util.Scanner;
public class ExemploDoWhile {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("\nMENU:");
        System.out.println("1- Saldo");
        System.out.println("2- Deposito");
        System.out.println("3- Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Seu saldo é R$ 1000,00");
                break;
            case 2:
                System.out.println("Depósito realizado!");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }while(opcao != 3);
    }
}
