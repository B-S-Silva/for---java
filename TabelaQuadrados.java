package com.javison;

import java.util.Scanner;

public class TabelaQuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de quadrados de 1 até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i + "² = " + (i * i));
        }

        scanner.close();
    }
}
