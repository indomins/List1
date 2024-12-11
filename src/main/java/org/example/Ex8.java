package org.example;

import java.util.Scanner;

public class Ex8 {
    public static void media(double x, double y, double z){
        Scanner sc =new Scanner(System.in);
        System.out.println("Informe as notas do aluno: ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        double media = (x+y+z)/3;
        if(media<4) System.out.println("O aluno foi reprovado com a média de: "+media);
        else if(media>=4 && media<6) System.out.println("O aluno está de recuperação com a média de: "+media);
        else System.out.println("O aluno foi aprovado com a média de: "+media);
    }
}
