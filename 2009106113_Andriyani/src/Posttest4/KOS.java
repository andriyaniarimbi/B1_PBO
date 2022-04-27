package Posttest4;

import Posttest3.*;

class KOS {
    String NamaKos;
    String Alamat;
    String Pemilik;
    int Kamar_Kosong;
    int Harga;
    KOS(String NamaKos, String Alamat, String Pemilik,int Kamar_Kosong, int Harga)
    {
        this.NamaKos = NamaKos;
        this.Alamat = Alamat;
        this.Pemilik = Pemilik;
        this.Kamar_Kosong = Kamar_Kosong;
        this.Harga = Harga;
    }

    KOS() {
        }

    public String getNamaKos() {
        return NamaKos;
    }

    public void setNamaKos(String NamaKos) {
        this.NamaKos = NamaKos;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getPemilik() {
        return Pemilik;
    }

    public void setPemilik(String Pemilik) {
        this.Pemilik = Pemilik;
    }

    public int getKamar_Kosong() {
        return Kamar_Kosong;
    }

    public void setKamar_Kosong(int Kamar_Kosong) {
        this.Kamar_Kosong = Kamar_Kosong;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

     void TambahData(){
        System.out.println("----------------------------------------\n");
        System.out.println("> Selamat, Data Berhasil ditambahkan ! <\n");
        System.out.println("----------------------------------------\n");
     }
    
    void EditData(){
        System.out.println("-------------------------");
        System.out.println("> Data Berhasil diubah! <");
        System.out.println("-------------------------\n");
     }
    
    void HapusData(){
        System.out.println("------------------------");
        System.out.println(">>>  Data Terhapus ! <<<");
        System.out.println("------------------------\n");
     }
}
