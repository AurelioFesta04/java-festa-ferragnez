package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {

        String[] ListaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner inputNome = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String nomeUtente = inputNome.nextLine();

        inputNome.close();

        Boolean nomeUtenteInLista = false;
        int index = 0;

        while (!nomeUtenteInLista && index < ListaInvitati.length) {
            
            if (nomeUtente.equals(ListaInvitati[index])) {
                nomeUtenteInLista = true;
            } else {
                index++;
            }
        }


        // for (int i = 0; i < ListaInvitati.length; i++) {

        //     if (nomeUtente.equals(ListaInvitati[i])) {
        //         nomeUtenteInLista = true;
        //     }
        // }

        if (nomeUtenteInLista) {
            System.out.println("IL TUO NOME é PRESENTE SULLA LISTA: VAMOS A BAILAR!!!");
        } else {
            System.out.println("SCAPPA INTRUSO!!! CHE SENNò CHIAMO I CARAMBAAA!!!");
        }

    }
}
