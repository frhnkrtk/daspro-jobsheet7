import java.util.Scanner;
public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i<= 10; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                System.out.println("Lulus");
                lulus++;
            } else {
                System.out.println("Mahasiswa tidak lulus");
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus (>= 60) :" + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus (< 60) : " + tidakLulus);
    }
    
}