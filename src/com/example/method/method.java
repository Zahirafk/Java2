package com.example.method;

import java.util.Scanner;

public class method {
    //method menu 1
    public void menu1(){
        System.out.println(" _____________________________________");
        System.out.println("|     Program Bilangan Aritmatika     |");
        System.out.println("|_____________________________________|");
        System.out.println("|______________Menu Pilihan___________|");
        System.out.println("|  1. Mencari Bilangan Genap & Ganjil |");
        System.out.println("|  2. Menampilkan Matrix              |");
        System.out.println("|_____________________________________|");
        System.out.print("Pilihan anda: ");
    }
    //method menu 2
    public static void menu2(){
        System.out.println(" __________________________________________");
        System.out.println("|     Program Bilangan Genap & Ganjil      |");
        System.out.println("|__________________________________________|");
        System.out.println("|______________Menu Pilihan________________|");
        System.out.println("|  1. Mencari Bilangan Genap               |");
        System.out.println("|  2. Mencari Bilangan Ganjil              |");
        System.out.println("|__________________________________________|");
        System.out.print("Pilihan anda: ");
    }
    //method menu 3
    public static void menu3() {
        System.out.println(" ____________________________________");
        System.out.println("|     Program Menampilkan Matrix     |");
        System.out.println("|____________________________________|");
        System.out.println("|______________Menu Pilihan__________|");
        System.out.println("|  1. Menampilkan Matrix             |");
        System.out.println("|____________________________________|");
        System.out.print("Pilihan anda: ");
    }
    // method angkaganjil
    public static void angkaganjil(Scanner s){
        clearScreen();
        boolean f;
        do {
            System.out.print("Masukan Jumlah Baris Angka (MAX JUMLAH BARIS 20): ");
            int n;
            n = s.nextInt();
            int array[] = new int[n];
            System.out.println("Masukan Deret Angka: ");
            for(int i = 0; i < n; i++)
            {
                array[i] = s.nextInt();
            }
            System.out.print("Angka yang Ganjil adalah: ");
            for(int i = 0; i < n; i++)
            {
                if (array[i] % 2 != 0){
                    System.out.print(array[i] + ", ") ;
                }
            }
            System.out.print("\ningin lanjut?(y/t) ");
            char a = s.next().charAt(0);
            if (a == 'y' || a == 'Y'){
                f = true;
            }else {
                f = false;
            }
        }while(f);
    }
    //method angkagenap
    public static void angkagenap (Scanner s){
        clearScreen();
        boolean f;
        do {
            System.out.print("Masukan Jumlah Baris Angka (MAX JUMLAH BARIS 20): ");
            int n;
            n = s.nextInt();
            int array[] = new int[n];
            System.out.println("Masukan Deret Angka: ");
            for(int i = 0; i < n; i++)
            {
                array[i] = s.nextInt();
            }
            System.out.print("Angka yang Genap adalah ");
            for(int i = 0; i < n; i++)
            {
                if (array[i] % 2 == 0){
                    System.out.print(array[i] + ", ") ;
                }
            }
            System.out.print("\ningin lanjut?(y/t) ");
            System.out.print("\ningin lanjut?(y/t) ");
            char a = s.next().charAt(0);
            if (a == 'y' || a == 'Y'){
                f = true;
            }else {
                f = false;
            }

        }while(f);
    }
    //method matrix
    public static void printMatrix( Scanner s){
        clearScreen();
        boolean f;
        do {
            System.out.print("Masukan Jumlah Baris: ");
            int baris = s.nextInt();
            System.out.print("Masukan Jumlah Kolom: ");
            int kolom = s.nextInt();
            //Deklarasi matrix
            int[][] matrix = new int[baris][kolom];
            System.out.println("Masukan Angka Pada Matrix: ");
            for (int i = 0; i < baris; i++){
                for (int j = 0; j < kolom; j++) {
                    matrix[i][j] = s.nextInt();
                }
            }
            System.out.println("\nMatrix: ");
            for (int i = 0; i < baris; i++) {
                System.out.print("[");
                for  (int j = 0; j < kolom; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
            char a = s.next().charAt(0);
            if (a == 'y' || a == 'Y'){
                f = true;
            }else {
                f = false;
            }
        }while(f);
    }
    public static void pressAnyKey(Scanner s) {
        System.out.println("Press Any Key to continue");
        s.next();
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
