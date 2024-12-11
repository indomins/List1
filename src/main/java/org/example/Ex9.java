package org.example;

import java.util.Scanner;

public class Ex9 {
    public static void verify(double x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        x=sc.nextDouble();
        if(x==0.0) System.out.println("O número " +x+ " é zero!");
        else if(x<0) System.out.println("O número "+x+" é negativo!");
        else System.out.println("O número "+x+" é positivo!");
    }
}
