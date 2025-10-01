import java.util.Scanner;
public class nestedUjianSkripsiNoPresensi {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan = "semua syarat terpenuhi. mahasiwa boleh menhikuti ujian skripsi";
            }else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            }else if (bimbinganP1 < 8) {
                pesan = "gagal! Log bimbingan P1 kurang dari 8 kali";
            }else {
                pesan = "gagal! Log bimbingan P2 kurang dari 4 kali";
            }
        }else {
            pesan = "gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
    System.out.println(pesan);
    }
    }

