package Tugas3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Gaji_pegawai objek = new Gaji_pegawai();

        System.out.println("-- Program Menghitung Gaji Pegawai ");

        System.out.print("-- Masukkan Nama Pegawai : ");
        String namapegawai = input.next();
        objek.setNama(namapegawai);

        System.out.print("-- Masukkan Golongan Kerja Pegawai " + objek.getNama() + " Adalah : ");
        String golongan = input.next();
        objek.setGolongan(golongan);

        System.out.print("-- Masukkan Jam Kerja Pegawai " + objek.getNama() + " Adalah : ");
        int jamkerja = input.nextInt();
        objek.setJamkerja(jamkerja);

        objek.TentukanUpah();

        objek.MenghitungGaji();

        System.out.println("================================================");
        System.out.println("-- Gaji Perjam adalah : Rp. " + objek.getUpahjamkerja());
        System.out.println("================================================");

        System.out.println("-- Jam Lembur Adalah : " + objek.getJamlembur());
        System.out.println("-- Presentasi Upah Lembur Adalah : Rp. " + objek.getUpahlembur());
        System.out.println("-- Gaji Lembur Adalah : Rp. " + objek.getTotalgajilembur());
        System.out.println("-- Total Lembur Adalah : Rp. " + objek.getTotallembur());

        System.out.println("================================================");
        System.out.println("Total Gaji ( Gaji pokok + Total Gaji Lembur ) Adalah Rp ." + objek.getUpahjamkerja() + " Rp. " + objek.getTotallembur() + " : Rp. " + objek.getTotalgaji());
    }

}
