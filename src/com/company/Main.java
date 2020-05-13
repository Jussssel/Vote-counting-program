package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int kandidatet = 4;
        int adresat = 4;
        int moshat = 4;

        String[] emri = new String[kandidatet];
        String[] adresa = new String[adresat];
        String[] mosha = new String[moshat];

        for (int a = 0; a != kandidatet; a++) {
            emri[a] = JOptionPane.showInputDialog("Të dhënat për kandidatin " + a + ":" + "\n" + "Shënojeni emrin dhe" +
                    " mbiemrin tuaj: ");
            adresa[a] = JOptionPane.showInputDialog("Të dhënat për kandidatin " + a + ":" + "\n" + "Shënojeni adresën" +
                    " tuaj: ");
            mosha[a] = JOptionPane.showInputDialog("Të dhënat për kandidatin " + a + ":" + "\n" + "Shënojeni moshën " +
                    "tuaj: ");
        }
        JOptionPane.showMessageDialog(null, "Kandidatët e dhënë janë: " + "\n" + "\n" + emri[0] + ", " + adresa[0] +
                ", " + mosha[0] + "\n" +  emri[1] + ", " + adresa[1] + ", " + mosha[1] + "\n" + emri[2] + ", " + adresa[2] +
                ", " + mosha[2] + "\n" + emri[3] + ", " + adresa[3] + ", " + mosha[3] + "\n" + " ");

        int[] votat = new int[kandidatet];
        int procesimi = 0;
        while (procesimi <= 15) {
            int v = Integer.parseInt(JOptionPane.showInputDialog("Votoni për këta kandidatë:" + "\n" + "\n" +
                    emri[0] + "\n" + emri[1] + "\n" + emri[2] + "\n" + emri[3] + "\n" + "\n" +
                    "-----------------------------------------------------------------------" +
                    "\n" + "\nNëse votoni për kandidatin e parë - " + emri[0] + ", shtypni numrin 0. " + "\n" +
                    "\nNëse votoni për kandidatin e dytë - " + emri[1] + ", shtypni mumrin 1. " + "\n" + "\nNëse " +
                    "votoni për kandidatin e tretë - " + emri[2] + ", shtypni numrin 2. " + "\n" + "\nNëse votoni për" +
                    " " + "kandidatin e katërt - " + emri[3] + ", shtypni numrin 3. " + "\n" + " "));
            procesimi++;

            if (v >= 0 && v < votat.length) {
                votat[v]++;
            }
            else if (v >= votat.length) {
                JOptionPane.showMessageDialog(null, "Ky kandidat nuk ekziston, ju lutem klikoni butonin OK për të " +
                        "vazhduar votimin.");
            }
            else if (v < 0){
                JOptionPane.showMessageDialog(null, "Ky kandidat nuk ekziston, ju lutem klikoni butonin OK për të " +
                        "vazhduar votimin.");
            }
        }
        JOptionPane.showMessageDialog(null,
                "Votat e kandidatëve janë si vijojnë: " + "\n" + "\nKandidati - " + emri[0] + " ka " + votat[0] +
                        " vota." + "\nKandidati - " + emri[1] + " ka " + votat[1] + " vota. " + "\nKandidati - " + emri[2] + " ka " + votat[2] + " vota. " +
                        "\nKandidati - " + emri[3] + " ka " + votat[3] + " vota." + "\n" + " ");
        System.exit(0);
    }
}

