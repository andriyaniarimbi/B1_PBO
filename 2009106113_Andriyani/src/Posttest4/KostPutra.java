package Posttest4;

public class KostPutra extends KOS {
    int diskonRamadhan;

    public KostPutra(String NamaKos, String Alamat, String Pemilik,int Kamar_Kosong, int Harga) {
        super(NamaKos, Alamat, Pemilik, Kamar_Kosong, Harga);
        this.diskonRamadhan = 10;
    }

    void BookingKamar() {
        System.out.println("\n*================================*");
        System.out.println("| Nama Kos           : " + this.NamaKos);
        System.out.println("| Alamat Kos         : " + this.Alamat);
        System.out.println("| Pemiliki           : " + this.Pemilik);
        System.out.println("| Kamar_Kosong       : " + this.Kamar_Kosong);
        System.out.println("| Harga              : " + this.Harga);
        System.out.println("*================================*");
        System.out.println("|    Kamar Berhasil Dibooking    |");
        System.out.println("*================================*\n");
    }

    void BatalBooking() {
        System.out.println("\n*================================*");
        System.out.println("| Nama Kos           : " + this.NamaKos);
        System.out.println("| Alamat Kos         : " + this.Alamat);
        System.out.println("| Pemiliki           : " + this.Pemilik);
        System.out.println("| Kamar_Kosong       : " + this.Kamar_Kosong);
        System.out.println("| Harga              : " + this.Harga);
        System.out.println("*================================*");
        System.out.println("|       Pembatan Dilakukan       |");
        System.out.println("*================================*\n");
    }

    public void overloading(int diskon_harga){
        diskon_harga = this.Harga * this.diskonRamadhan/100;
        System.out.println("| Total Biaya    : \n| \t\t" + diskon_harga + " Rupiah");
        System.out.println("*================================*\n");

    }
}
