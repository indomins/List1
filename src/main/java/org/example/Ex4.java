package org.example;

import java.util.Scanner;

public class Ex4 {
    public static void notas(double x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota do aluno: ");
        x=sc.nextDouble();
        if(x<5) System.out.println("Reprovado!");
        else if(x>=5 && x<=6) System.out.println("Recuperação");
        else System.out.println("Aprovado!");
    }
}
