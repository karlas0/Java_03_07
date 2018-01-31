package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int suma = 0;
    static int[] masyvas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite kiek norite skaiciu ivesti");
        int a = sc.nextInt();
        masyvas = new int[a];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite skaiciu");
            int skaicius = sc.nextInt();
            masyvas[i] = skaicius;
            suma = suma + skaicius;
        }
        atvaizdavimas();
    }

    public static void atvaizdavimas() {
        System.out.println("skaiciu suma " + suma);
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] <= 100) {
                System.out.print(masyvas[i]);
            } else {
                System.out.println("skaicius turi buti mazesnis uz 100");
            }

        }
    }
}
