package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex2 {
    public static void idade(int x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua  idade:");
        int i = sc.nextInt();
        if(i<18) System.out.println("Você é menor de idade.");
        else if(i>=18 && i<60) System.out.println("Você é maior de idade.");
        else System.out.println("Você é idoso.");
    }
}
