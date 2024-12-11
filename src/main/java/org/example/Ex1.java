package org.example;

import java.util.Scanner;

public  class Ex1 {
    public static void soma(double x, double y){
        Scanner sc = new Scanner(System.in);
        double soma = 0.0;
        System.out.println("Digite os números que deseja somar: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        soma = x+y;
        System.out.println("A soma dos números é: "+soma);
    }
}
