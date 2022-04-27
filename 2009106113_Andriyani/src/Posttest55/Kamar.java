package POSTTEST55;

import java.util.Scanner;

/**
 *
 * @author AelAwyR
 */
public abstract class Kamar {
    protected int nomor;
    protected int harga;
    protected String ukuran;
    protected String Status;
    protected int jumlahKamarMandi = 1;

    public Kamar(int nomor, int harga, String Status){
        this.nomor = nomor;
        this.Status = Status;
        this.harga = harga;
}

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void tampil() {
        System.out.print("Nomor Kamar : ");
        System.out.println(this.nomor);
        System.out.print("Status Kamar : ");
        System.out.println(this.Status);
        System.out.print("Harga Kamar semalam : Rp.");
        System.out.println(this.harga);
        System.out.print("Ukuran Kamar : ");
        System.out.println(this.ukuran);
        System.out.print("Banyak Kamar Mandi : ");
        System.out.println(this.jumlahKamarMandi);
        System.out.println("");
    }

    public abstract void edit(Scanner input);
} 