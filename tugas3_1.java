import java.util.Scanner;
public class tugas3_1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
      System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
   boolean punyaKTM = sc.nextBoolean();
      System.out.print("Apakah sudah registrasi online? (true/false): ");
   boolean registrasiOnline = sc.nextBoolean();
   if (punyaKTM || registrasiOnline) {
      System.out.println("Izin masuk diberikan, silakan masuk ke perpustakaan.");
   } else {
      System.out.println("Izin masuk ditolak. Harap bawa KTM atau lakukan registrasi online.");
      }
   }
}