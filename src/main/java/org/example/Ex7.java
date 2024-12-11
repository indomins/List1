package org.example;

import java.util.Scanner;

public class Ex7 {
    public static void week(int x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7:");
        x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println(+x+" = Domingo.");
                break;
            case 2:
                System.out.println(x+" = Segunda-Feira.");
                break;
            case 3:
                System.out.println(x+" = Terça-Feira.");
                break;
            case 4:
                System.out.println(x+" = Quarta-Feira.");
                break;
            case 5:
                System.out.println(x+" = Quinta-Feira.");
                break;
            case 6:
                System.out.println(x+" = Sexta-Feira");
            default:
                System.out.println("O número "+x+" não corresponde a um dia da semana válido!");
        }
    }
}
