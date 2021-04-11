package com.example;
import java.util.Scanner;
import com.example.method.method;

public class tugasmodul4 {
    public static void main(String[] args) {
        //Deklarasi Class
        method kelas = new method();

        //Nama Anggota
        System.out.println("Kelompok: kelompok 3");
        System.out.println("Shift: shift 1");
        System.out.println("Nama Anggota 1: Ananda Muhammad Zahir (21120120140115)");
        System.out.println("Nama Anggota 2: Didan Hasan Murtaqi (21120120140103)");
        System.out.println("Nama Anggota 3: Juliant Raffa (21120120130127)");
        System.out.println("Nama Anggota 4: Sachiko Fitria Ramandanti (21120120140103)\n");
        Scanner s = new Scanner(System.in);
        //Press Any Key
        kelas.pressAnyKey(s);

        //clear screen
        kelas.clearScreen();
        char a;

        // menu 1
        kelas.menu1();
        int y = s.nextInt();
        if ( y == 1){
            //menu 2
            kelas.menu2();
            int x = s.nextInt();
            //angkaganjil
            if (x == 1) {
                    kelas.angkaganjil(s);
            } //angkagenap
            else if (x == 2){
                kelas.angkagenap(s);
                //error
            } else{
                System.exit(0);
            }
        }else if(y == 2){
            kelas.menu3();
            kelas.printMatrix(s);

        }else {
            System.exit(0);
        }
    }
}
