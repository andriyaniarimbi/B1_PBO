package Posttest4
        ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static ArrayList<DataKost> kos = new ArrayList<>();
        static String NamaKos;
        static String Alamat;
        static String Pemilik;
        static int Kamar_Kosong;
        static int Harga;
        static BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 

        public static void main(String[] args) throws IOException{
        showMenu();
        }
        static void backtoMenu() throws IOException{

            System.out.print("\nTekan Enter Untuk Kembali ke Menu Utama... \n");
            String x = input.readLine();
            showMenu();
        }
        static void showMenu() throws IOException{    
            boolean ulang = true;
            while (ulang) {
            System.out.println("==================");
            System.out.println("|  KOS PRAMUKA   |");
            System.out.println("==================\n");
            System.out.println("------------------");
            System.out.println("| 1. Tambah Data |");
            System.out.println("| 2. Lihat Data  |");
            System.out.println("| 3. Edit Data   |");
            System.out.println("| 4. Hapus Data  |");
            System.out.println("| 5. Exit        |");
            System.out.println("------------------");
            System.out.print("\nMenu yang anda Inginkan : ");
            int pilihan = Integer.parseInt(input.readLine());
            if (pilihan == 1){
                TambahData();
            }
            else if (pilihan == 2){
                TampilkanData();
                backtoMenu();
            }
            else if (pilihan == 3){
                EditData();
            }
            else if (pilihan == 4){
                HapusData();

            }
            else if (pilihan == 5){
                System.out.println("========================");
                System.out.println(">>>>>   Tengkyuu   <<<<<");
                System.out.println("========================\n");
                System.exit(0);
            }

        }
    }
        static void TambahData() throws IOException{  
            System.out.println("=====================================");  
            System.out.println(" Nama Kos               : ");
            NamaKos = input.readLine();
            System.out.println(" Alamat Kos             : ");
            Alamat = input.readLine();
            System.out.println(" Nama Pemiliki          : ");
            Pemilik = input.readLine();
            System.out.println(" Jumlah Kamar Kosong    : ");
            Kamar_Kosong = Integer.parseInt(input.readLine());
            System.out.println(" Harga Sewa PerBulan    : ");
            Harga = Integer.parseInt(input.readLine());


            if("".equals(NamaKos) || "".equals(NamaKos) || "".equals(Alamat) || "".equals(Pemilik) || "".equals(Kamar_Kosong) || "".equals(Harga)){
            System.out.println("\n*=============================*");
            System.out.println("|     Data Gagal Ditambahkan    |");
            System.out.println("================================\n");
            return;
            }
            backtoMenu();

        }

        static void TampilkanData() throws IOException{ 
            System.out.println("=========================");
            System.out.println("|   Data Kos Pramuka    |");
            System.out.println("=========================\n");
            if(kos.isEmpty()==true){
                System.out.println("Data Kos Kosong \n");
            }
            else {
               for(int i = 0 ; i < kos.size();i++){
                System.out.println("-"+" Nomor ["+(i+1)+"]  ");
                System.out.println("- Nama Kos              : "+ kos.get(i).getNamaKos());
                System.out.println("- Alamat Kos            : "+ kos.get(i).getAlamat());
                System.out.println("- Nama Pemilik Kos      : "+ kos.get(i).getPemilik());
                System.out.println("- Jumlah Kamar Kosong   : "+ kos.get(i).getKamar_Kosong());
                System.out.println("- Harga Sewa PerBulan   : "+ kos.get(i).getHarga());
            }
            }
        } 
        static void EditData() throws IOException{
            System.out.println("=========================");
            System.out.println("     Ubah Data Kos       ");
            System.out.println("=========================\n");
            if(kos.isEmpty()==true){
                System.out.println("Data Kos Kosong \n");
                backtoMenu();
            }
            TampilkanData();

            System.out.print("\n Pilih Nomor = ");
            int index;
            index = Integer.parseInt(input.readLine());
            index--;
            System.out.println("Nama Kos              : ");
            NamaKos = input.readLine();
            System.out.println("Alamat Kos            : ");
            Alamat = input.readLine();
            System.out.println("Nama Pemilik Kos      : ");
            Pemilik = input.readLine();
            System.out.println("Jumlah Kamar Kosong   : ");
            Kamar_Kosong = Integer.parseInt(input.readLine());
            System.out.println("Harga Sewa PerBulan   : ");
            Harga = Integer.parseInt(input.readLine());

            kos.get(index).setNamaKos (NamaKos);
            kos.get(index).setAlamat (Alamat);
            kos.get(index).setPemilik (Pemilik);
            kos.get(index).setKamar_Kosong(Kamar_Kosong);
            kos.get(index).setHarga(Harga);
            kos.get(index).HapusData();

            backtoMenu();   
        }
        static void HapusData() throws IOException{
            System.out.println("==============================");
            System.out.println(">>>>>   Hapus Data Kos   <<<<<");
            System.out.println("==============================\n");
            if(kos.isEmpty()==true){
                System.out.println("Data Kos Kosong \n");
                backtoMenu();
            }
            TampilkanData();

            System.out.print("\n Pilih Nomor = ");
            int index;
            index = Integer.parseInt(input.readLine());
            index--;
            kos.get(index).HapusData();
            kos.remove(index);

            backtoMenu();

        }
}
