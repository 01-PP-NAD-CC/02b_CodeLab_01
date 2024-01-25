package com.cc.java;

public class App {

    public static void main(String[] args) {
        Konto Konto1 = new Konto();
        Konto Konto2 = new Konto();
        Konto Konto3 = new Konto();

        //Varriante 1:


        // System.out.println("Varriante1 Anfangs Kontostand: ");
        // System.out.println("Konto1 Anfangs Kontostand: " + Konto1.Kontostand + "  | Aktueller Kontostand: " + (Konto1.Kontostand *= 2));
        // System.out.println("Konto2 Anfangs Kontostand: " + Konto2.Kontostand + "  | Aktueller Kontostand: " + (Konto2.Kontostand *= 3));
        // System.out.println("Konto3 Anfangs Kontostand: " + Konto3.Kontostand + "  | Aktueller Kontostand: " + (Konto3.Kontostand *= 10)); 


        // //Varriante 2:
       
        // System.out.println("Varriante2 Anfangs-Kontostand:");
        // System.out.println("Konto1: " + Konto1.Kontostand);
        // System.out.println("Konto2: " + Konto2.Kontostand);
        // System.out.println("Konto3: " + Konto3.Kontostand);

        // Konto1.Kontostand *= 2; // Verdoppelung
        // Konto2.Kontostand *= 3; // Verdreifachung
        // Konto3.Kontostand *= 10; // Verzehnfachung

        // System.out.println("Varriante2 Aktueller Kontostand:");
        // System.out.println("Konto1: " + Konto1.Kontostand);
        // System.out.println("Konto2: " + Konto2.Kontostand);
        // System.out.println("Konto3: " + Konto3.Kontostand);


        //Varriante 3:
        System.out.println("Varriante3 Anfangs-Kontostand:");
        System.out.println("Konto1: " + Konto1.Kontostand);
        System.out.println("Konto2: " + Konto2.Kontostand);
        System.out.println("Konto3: " + Konto3.Kontostand);

        Konto1.changeKontostand(2);
        Konto2.changeKontostand(3);
        Konto3.changeKontostand(10);

        System.out.println("Varriante3 Aktueller Kontostand:");
        System.out.println("Konto1: " + Konto1.Kontostand);
        System.out.println("Konto2: " + Konto2.Kontostand);
        System.out.println("Konto3: " + Konto3.Kontostand);
    }


    }