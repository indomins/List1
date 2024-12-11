package org.example;

import java.util.Scanner;

public class Ex6 {
    public static void comparator(double x){
        Scanner sc =new Scanner(System.in);
        System.out.println("Informe um número: ");
        x=sc.nextDouble();
        if(x<0) System.out.println("O número " +x+ " é menor que zero!");
        else if(x==0) System.out.println("O número " +x+ " é zero!");
        else System.out.println("O número " +x+ " é maior que zero!");
    }
}
