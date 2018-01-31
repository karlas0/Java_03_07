package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int suma = 0;
    static int[] masyvas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        masyvas = new int[5];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite skaiciu");
            int skaicius = sc.nextInt();
            masyvas[i] = skaicius;
            suma = suma + skaicius;
        }
        atvaizdavimas();
    }
    public static void atvaizdavimas() {
        System.out.println("skaiciu suma " +suma);
        for (int i = 0; i <masyvas.length; i++) {
            System.out.print(masyvas[i]);

        }
    }
}
