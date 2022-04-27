package Posttest5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<KostPutra> KostPutra = new ArrayList<>();
    static ArrayList<KostPutri> KostPutri = new ArrayList<>();
//    static ArrayList<Main> kosan = new ArrayList<>();
//    private Object NamaKos;
    
//    Main (String NamaKos1, String Alamat, String Pemilik, String KamarKosong, int Harga){
//        kosan = new ArrayList<>();
//        
//    }
//    void datakost(String NamaKos, String Alamat, String Pemilik, String KamarKosong, int Harga){
//        kosan.add(new Main(NamaKos, Alamat, Pemilik, KamarKosong, Harga));
//    }

    static void TambahData() {
        System.out.println("\n=================");
        System.out.println("Jenis Kost Anda :");
        System.out.println("=================");
        System.out.println("| 1. Kost Putra |");
        System.out.println("| 2. Kost Putri |");
        System.out.println("==================");
        System.out.print("Masukan Pilihan Anda : ");
        int menu = input.nextInt();
        if (menu < 1 || menu > 2) {
            System.out.println("Menu yang Anda Pilih Salah");
            return;
        }

        System.out.println("\n-------------------------");
        System.out.println("<<  Menu Tambah Data   >>");
        System.out.println("-------------------------");
        
        String Nama_Kos;
        String Alamat_Kos;
        String Pemilik_Kos;
        String jumlahKamarKosong;
        int Harga_Kos;
        
        System.out.print("Nama Kos              : ");
        Nama_Kos = input.nextLine();

        System.out.print("Alamat Kos            : ");
        Alamat_Kos = input.nextLine();

        System.out.print("Pemilik Kos           : ");
        Pemilik_Kos = input.nextLine();

        System.out.print("Harga Sewa Per Bulan  : ");
        Harga_Kos = input.nextInt();
        input.nextLine();
        System.out.println("\n");
        
        if (menu == 1) {
            System.out.print("Masukan Jumlah Kamar Kosong: \n");
            jumlahKamarKosong = input.nextLine();
            KostPutra kosan = new KostPutra(Nama_Kos, Alamat_Kos, Pemilik_Kos, jumlahKamarKosong, Harga_Kos);
            KostPutra.add(kosan);
        } 
        else if (menu == 2) {
            KostPutri kosan = new KostPutri(Nama_Kos, Alamat_Kos, Pemilik_Kos, Harga_Kos);
            KostPutri.add(kosan);
        }
    }
    
    static void TampilkanData(){
        System.out.println("\n-------------------------------");
        System.out.println("<<  Berikut Adalah Data Kos  >>");
        System.out.println("-------------------------------");
        System.out.println(">> Kost Putra : <<\n");
        
        for (int i = 0; i < KostPutra.size(); i++) {
            System.out.print(i + 1);
            KostPutra.get(i).tampilData();
        }

        System.out.println(">> Kost Putri : <<\n");
        for (int i = 0; i < KostPutri.size(); i++) {
            System.out.print(i + 1);
            KostPutri.get(i).tampilData();   
        }
    }
    
    static void EditData(){
        System.out.println("\n=================");
        System.out.println("Jenis Kost Anda :");
        System.out.println("=================");
        System.out.println("| 1. Kost Putra |");
        System.out.println("| 2. Kost Putri |");
        System.out.println("==================");
        System.out.print("Masukan Pilihan Anda : ");
  
        int menu = input.nextInt();
        if (menu < 1 || menu > 2) {
            System.out.println("Menu yang Anda Pilih Salah");
            return;
        }

        System.out.print("Masukan id Kost : ");
        int idKost = input.nextInt();
        idKost--;

        if (menu == 1) {
            KostPutra.get(idKost).EditData(input);
        } else if (menu == 2) {
            KostPutri.get(idKost).EditData(input);
        }
    }
    
    static void HapusData(){
        System.out.println("\n=================");
        System.out.println("Jenis Kost Anda :");
        System.out.println("=================");
        System.out.println("| 1. Kost Putra |");
        System.out.println("| 2. Kost Putri |");
        System.out.println("==================");
        System.out.print("Masukan Pilihan Anda : ");
  
        int menu = input.nextInt();
        if (menu < 1 || menu > 2) {
            System.out.println("Menu yang Anda Pilih Salah");
            return;
        }

        System.out.print("Masukan id Kost : ");
        int idKost = input.nextInt();
        idKost--;

        if (menu == 1) {
            KostPutra.remove(idKost);
        } else if (menu == 2) {
            KostPutri.remove(idKost);
        }
    }
    
    public static void main(String[] args) {
//    Scanner input = new Scanner (System.in);
//    int Ulang = 1;
//    Main md = new Main();
        while(true){
            System.out.println("\n==================");
            System.out.println("|  KOS PRAMUKA   |");
            System.out.println("==================\n");
            System.out.println("------------------");
            System.out.println("| 1. Tambah Data |");
            System.out.println("| 2. Lihat Data  |");
            System.out.println("| 3. Edit Data   |");
            System.out.println("| 4. Hapus Data  |");
            System.out.println("| 5. Exit        |");
            System.out.println("------------------");
            int pilihan;
            System.out.print("\nMenu yang anda Inginkan : ");
            pilihan = input.nextInt();

            if (pilihan == 1){
                TambahData();
                
            }
            else if (pilihan == 2){
                TampilkanData();
            }
            else if (pilihan == 3){
                EditData();
            }
            else if (pilihan == 4){
                HapusData();

            }
            else if (pilihan == 5){
                System.out.println("\n========================");
                System.out.println(">>>>>   Tengkyuu   <<<<<");
                System.out.println("========================\n");
                System.exit(0);
            }   
        }
    }
}