package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombreFruta;
        Boolean estaEnTemporada=true;
        Integer costoCarga;

        System.out.print("Ingrese el nombre de la fruta: ");
        nombreFruta=leer.nextLine();

        System.out.print(" ¿Esta en temporada? ");
        estaEnTemporada=leer.nextBoolean();

        if (estaEnTemporada){
            System.out.print(" ¿La fruta es Colombiana? ");
            Boolean esColombiana=leer.nextBoolean();
            if (esColombiana){
                costoCarga=1000000;
                System.out.println("El costo de la carga Colombiana es de: "+costoCarga);
            }else {
                costoCarga=2000000;
                System.out.println("El costo de la carga Extranjera es de: "+costoCarga);
            }
        }else {
            costoCarga=350000;
            System.out.println("El otro costo de la carga que no esta en temporada es de: "+costoCarga);
        }


    }
}