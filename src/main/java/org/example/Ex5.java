package org.example;

import java.util.Scanner;

public class Ex5 {
    public static void calculadora(String op,double x,double y){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os números que deseja calcular: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        sc.nextLine();
        System.out.println("Informe a operação:");
        op = sc.nextLine();
        double calc=0;
        switch (op){
            case "+":
                calc = x+y;
                break;
            case "-":
                calc = x-y;
                break;
            case "*":
                calc = x*y;
                break;
            case "/":
                calc = x/y;
                break;
            default:
                System.out.println("Operação inválida!");
        }
        System.out.println("O número resultante é: "+calc);
    }
}
