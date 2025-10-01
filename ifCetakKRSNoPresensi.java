import java.util.Scanner;
public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean(); 

        if (uktLunas) {
            System.out.println("pembayaran UKT telah terverivikasi");
            System.out.print("silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("pembayaran UKT belum terverivikasi");
            System.out.print("silahkan selesaikan pembayaran terlebih dahulu");
        }
        sc.close();
    }
}