package Posttest3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Main {

    static void add(KOS databaru) {
    }
    
    ArrayList<KOS> kosan;
    
    Main(){
        kosan = new ArrayList<>();
        
    }
    
    void dataKos(String NamaKos, 
                 String Alamat, 
                 String Pemilik,
                 int Kamar_Kosong, 
                 int Harga){
        kosan.add(new KOS(NamaKos, Alamat, Pemilik, Kamar_Kosong, Harga));
    }
    
    static void ClearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    void MenghapusData(String idd){
        kosan.removeIf(item -> item.getNamaKos().equals(idd));
    }
    
    void editData(String NamaKos, 
                 String Alamat, 
                 String Pemilik,
                 int Kamar_Kosong, 
                 int Harga){
        int cek = -1;
        for(int i=0; i<kosan.size(); i++){
            if(kosan.get(i).getNamaKos().equals(Harga) ){
                cek = i;
                System.out.println(cek);
                kosan.set(cek, new KOS(NamaKos, Alamat, Pemilik, Kamar_Kosong, Harga));
            }
        }
    }
            
    void lihatData(){
        for(KOS datakos:kosan)
        {
            System.out.println("Nama Kos            :  "+datakos.getNamaKos());
            System.out.println("Alamat              :  "+datakos.getAlamat());
            System.out.println("Pemilik             :  "+datakos.getPemilik());
            System.out.println("Jumlah Kamar Kosong :  "+datakos.getKamar_Kosong());
            System.out.println("Harga               :  "+datakos.getHarga());
        }
    }
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws IOException{
        showMenu();
        }
    
//    static void backtoMenu() throws IOException{
//
//            System.out.print("\nTekan Enter Untuk Kembali ke Menu Utama... \n");
//            String x = input.readLine();
//            showMenu();
//        }
    
    static void showMenu() throws IOException{    
        boolean ulang = true;
        Scanner inputan = new Scanner (System.in);
        Main md = new Main();
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
//        int pilihan;
        System.out.print("\nMenu yang anda Inginkan : ");
        int pilihan = Integer.parseInt(input.readLine());
        switch (pilihan) {
        case 1:
            {
                System.out.println("\n-------------------------");
                System.out.println("  << Menu Tambah Data  >>");
                System.out.println("-------------------------");
                String Nama_Kos;
                String Alamat_Kos;
                String Pemilik_Kos;
                int KamarKosong;
                int Harga_Kos;
                System.out.print("Nama Kos              : ");
                Nama_Kos = inputan.next();
                System.out.print("Alamat Kos            : ");
                Alamat_Kos = inputan.next();
                System.out.print("Pemilik Kos           : ");
                Pemilik_Kos = inputan.next();
                System.out.print("Jumlah Kamar Kosong   : ");
                KamarKosong = inputan.nextInt();
                System.out.print("Harga Kos             : ");
                Harga_Kos = inputan.nextInt();
                System.out.println("\n\n\n");
                md.dataKos(Nama_Kos,
                        Alamat_Kos,
                        Pemilik_Kos,
                        KamarKosong,
                        Harga_Kos);
                KOS databaru = new KOS();
                Main.add(databaru);
                databaru.TambahData();
                break;
            }
        case 2:
            System.out.println("\n-------------------------------");
            System.out.println("<<  Berikut Adalah Data Kos  >>");
            System.out.println("-------------------------------");
            md.lihatData();
            System.out.println("\n\n\n");
            break;
        case 3:
            {
                System.out.println("\n -----------------------");
                System.out.println("<<   Menu Ubah Data  >>");
                System.out.println("-----------------------");
                String Nama_Kos;
                String Alamat_Kos;
                String Pemilik_Kos;
                int KamarKosong;
                int Harga_Kos;
                String pilih;
                System.out.print("Pilih Nama Kos yang Ingin diubah : ");
                pilih = inputan.next();
                System.out.print("Nama Kos            : ");
                Nama_Kos = inputan.next();
                System.out.print("Alamat Kos          : ");
                Alamat_Kos = inputan.next();
                System.out.print("Pemilik Kos         : ");
                Pemilik_Kos = inputan.next();
                System.out.print("Jumlah Kamar Kosong : ");
                KamarKosong = inputan.nextInt();
                System.out.print("Harga Kos           : ");
                Harga_Kos = inputan.nextInt();
                System.out.println("\n\n\n");
                md.editData(pilih,Nama_Kos,
                        Alamat_Kos,
                        Pemilik_Kos,
                        KamarKosong,
                        Harga_Kos);
                KOS databaru = new KOS();
                Main.add(databaru);
                databaru.EditData();
                break;
            }
        case 4:
            {
                System.out.println("\n------------------------");
                System.out.println("<<  Menu Hapus Data   >>");
                System.out.println("------------------------");
                String pilih_hapus;
                System.out.print("\n>> Pilih Nama Kos yang Akan dihapus : ");
                pilih_hapus = inputan.next();
                System.out.println("\n\n\n");
                md.MenghapusData(pilih_hapus);
                KOS databaru = new KOS();
                Main.add(databaru);
                databaru.HapusData();
                break;
            }
        case 5:
            System.out.println("-----------------------");
            System.out.println(">>> Selamat Tinggal <<< ");
            System.out.println("-----------------------");
//            Ulang = 5;
            System.out.println();
            break;
        default:
            break;
        }
        
        }
    }

    private void editData(String pilih, String Nama_Kos, String Alamat_Kos, String Pemilik_Kos, int KamarKosong, int Harga_Kos) {
    }

}
