package org.example;

import java.util.Scanner;

public class Ex10 {
    public static void faixa(int x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        x=sc.nextInt();
        if(x<=12) System.out.println("Você foi classificado como criança!");
        else if (x>=13 && x<18) System.out.println("Você foi classificado como adolescente!");
        else if (x>=18 && x<60) System.out.println("Você foi classificado como adulto!");
        else System.out.println("Você foi classificado como idoso!");
    }
}
