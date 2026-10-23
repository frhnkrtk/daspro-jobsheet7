import java.util.Scanner;

public class TiketBioskop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        double harga, diskon, totalHarga = 0;

        do {
            System.out.print("Masukkan jumlah tiket (ketik '0' untuk menyelesaikan pesanan): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket > 0) {
                harga = jumlahTiket * 50000;
                diskon = 0;
                if (jumlahTiket > 10) {
                    diskon = harga * 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = harga * 0.10;
                }

                harga = harga - diskon;
                totalTiket += jumlahTiket;
                totalHarga += harga;

                System.out.println("Diskon: Rp " + diskon);
                System.out.println("Total pembayaran: Rp " + harga);

            } else if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
            }

        } while (jumlahTiket != 0);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalHarga);

    }
}