
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kamar_reguler kmr = new  Kamar_reguler();
        Kamar_VIP vip = new Kamar_VIP();
        Meeting_room mt = new Meeting_room();
        Aula aula = new Aula();
        System.out.println("SELAMAT DATANG DI HOTEL KAMI");
        System.out.println("=======================================");
        char lanjut;
        do{
        System.out.println("PILIHAN KAMAR");
        System.out.println("1. Reguler Room");
        System.out.println("2. VIP Room");
        System.out.println("3. Meeting Room");
        System.out.println("4. Penyewaan Aula");
        System.out.println("5. Lihat Data Tamu");
        System.out.println("6. Exit");
        System.out.print("Silahkan Pilih : ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:            
            kmr.sewaKamar();    
            break;
            case 2:
            vip.sewaKamar();
            break;
            case 3:
            mt.sewaMeetingRoom();
            break;
            case 4:
            aula.bookAula();
            break;

            case 5:
            kmr.lihatTamu();
            vip.lihatTamu();
            mt.lihatTamu();
            aula.infoPemesananAula();
            break;

            case 6:
            System.out.println("TERIMA KASIH SUDAH MENGGUNAKAN HOTEL KAMI");
            System.exit(0);

            default:
            System.out.println("PILIHAN TIDAK TERSEDIA");
            
        }
            System.out.print("Apakah ingin lanjut memilih (y/n): ");
             lanjut = in.next().charAt(0);
        }while(lanjut == 'y' || lanjut == 'Y');

    }
}