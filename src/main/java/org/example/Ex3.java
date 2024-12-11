package org.example;

import java.util.Scanner;

public class Ex3 {
    public static void pi(int x) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int i = sc.nextInt();
        if (i % 2 == 0) System.out.print("O número é par!");
        else System.out.print("O número é ímpar!");
    }
}
