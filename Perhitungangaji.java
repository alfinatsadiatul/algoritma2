package perhitungangaji;

import java.util.Scanner;

public class Perhitungangaji {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan golongan A/B/C: ");
    String golongan = input.next().toUpperCase();
    
    System.out.println("Masukkan jam lembur: ");
    int jamLembur = input.nextInt();
    
    double gajiPokok = 0;
    double gajiLembur =0;
    //menghitung gaji pokok
    if (golongan.equals("A")) {
        gajiPokok = 5000000;
    } else if (golongan.equals("B")) {
        gajiPokok = 6500000;
    } else if (golongan.equals("C")) {
        gajiPokok = 9500000;
    } else {
        System.out.println("Golongan Tidak Valid");
        input.close();
        return;
    }
    // menghitung gaji lembur
    if (jamLembur == 1) {
        gajiLembur = gajiPokok * 0.30;
    } else if (jamLembur == 2) {
        gajiLembur = gajiPokok * 0.32;
    } else if (jamLembur == 3) {
        gajiLembur = gajiPokok * 0.34;
    } else if (jamLembur == 4) {
        gajiLembur = gajiPokok * 0.36;
    } else if (jamLembur >= 5) {
        gajiLembur = gajiPokok * 0.38;
    } else {
        System.out.println("Jam Lembur tidak valid");
        input.close();
        return;
    }
    // menghitung jumlah penghasilan
    double jumlahPenghasilan = gajiPokok + gajiLembur;
    
    // output jumlah penghasilan
    System.out.println("Jumlah Penghasilan: " + jumlahPenghasilan);
    input.close();
    }
}
