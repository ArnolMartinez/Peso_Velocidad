package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner d=new Scanner(System.in);
            int valor,tipo;
            menu();
            System.out.println("Ingrese  el peso:");
            valor=d.nextInt();
            System.out.println("Si el peso esta en libras ingrese 1");
            System.out.println("Si el peso esta en kilogramos ingrese 2");
            tipo=d.nextInt();
            peso(valor,tipo);
            System.out.println("Ingrese la velocidad:");
            valor=d.nextInt();
            System.out.println("Si la velocidad esta en kilometros ingrese 1");
            System.out.println("Si la velocidad esta en millas ingrese 2");
            tipo=d.nextInt();
            velocidad(valor,tipo);

    }
    public static void peso(int a,int b) {
        double p;
        if(b==1){
            p=a/2.2;
            System.out.printf("En %d libras hay %f en kilogramos \n",a,p);

        }
        else{
            p=a*2.2;
            System.out.printf("En %d kilogramos hay %f libras \n",a,p);
        }


    }

    public static void velocidad(int a,int b) {

        double v;
        if(b==1){
            v=a*0.6;
            System.out.printf("En %d kilometros hay %f millas \n",a,v);
        }
        else{
            v=a/0.6;
            System.out.printf("En %d millas hay %f kilometros \n",a,v);
        }


    }
    public static void menu(){
        System.out.println("Seleccione una opcion:");
        System.out.println("a.Peso");
        System.out.println("b.Velocidad");
         }
    public static double decimal(Scanner a){
        System.out.println("Ingrese un numero:");
        double b=a.nextDouble();
        return b;
    }
    public static int entero(Scanner a){
        System.out.println("Ingrese un numero:");
        int b=a.nextInt();
        return b;
    }
    public static String texto(Scanner a){
        System.out.println("Ingrese texto:");
        String b=a.nextLine();
        return b;
    }
}
