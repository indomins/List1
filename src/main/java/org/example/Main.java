package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual exercício da primeira lista deseja verificar?");
        int x = sc.nextInt();
        switch(x){
            case 1:
                Ex1.soma(0,0);
                break;
            case 2:
                Ex2.idade(0);
                break;
            case 3:
                Ex3.pi(0);
                break;
            case 4:
                Ex4.notas(0);
                break;
            case 5:
                Ex5.calculadora("+",0,0);
                break;
            case 6:
                Ex6.comparator(0);
                break;
            case 7:
                Ex7.week(0);
                break;
            case 8:
                Ex8.media(0,0,0);
                break;
            case 9:
                Ex9.verify(0);
                break;
            case 10:
                Ex10.faixa(0);
                break;
            default:
                System.out.println("A lista tem somente 10 exercícios!");
        }
    }
}
