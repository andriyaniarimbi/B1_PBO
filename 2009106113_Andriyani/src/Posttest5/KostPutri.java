package Posttest5;

import java.util.Scanner;

public class KostPutri extends KOS {
    int diskonRamadhan;

    public KostPutri(String NamaKos, String Alamat, String Pemilik, int Harga) {
        super(NamaKos, Alamat, Pemilik, Harga);
        this.KamarKosong = "Silahkan Konfirmasi Pada Pemilik";
    }

    @Override
    public void EditData(Scanner input) {
         System.out.print("Masukkan Nama Kos             : ");
        this.NamaKos = input.nextLine();

        System.out.print("Masukkan Alamat Kos           : ");
        this.Alamat = input.nextLine();

        System.out.print("Masukkan Nama Pemilik Kos     : ");
        this.Pemilik = input.nextLine();
        
        System.out.print("Harga Sewa Per Bulan          : ");
        this.Harga= input.nextInt();
        input.nextLine();
        System.out.println("\n\n\n");
    }
    
    public void tampilData(){
        System.out.println("=============================== ");
        System.out.print("Nama Kos                      : ");
        System.out.println(this.NamaKos);
        System.out.print("Alamat Kos                    : ");
        System.out.println(this.Alamat);
        System.out.print("Nama Pemilik Kos              : ");
        System.out.println(this.Pemilik);
        System.out.print("Harga Sewa Per Bulan          : ");
        System.out.println(this.Harga);
        System.out.print("Jumlah Kasur dalam 1 kamar    : ");
        System.out.println(this.jumlahKasur);
        System.out.println("=============================== \n");
    }
    
    public void edit(Scanner input) {}

}
