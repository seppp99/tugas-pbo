import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kamar_VIP extends Kamar {

    private int stokKamar;
    private List<Tamu> daftarTamuRg;
    private int jumlah; 

    
    public Kamar_VIP() {
        this(500000, 2); 
        jumlah = 0;
    }

    public Kamar_VIP(int harga, int kapasitas) {
        super(harga, kapasitas); 
        this.stokKamar = 20; 
        this.daftarTamuRg= new ArrayList<>(); 
    }

    
    public int getStokKamar() {
        return stokKamar;
    }

    public void setStokKamar(int stokKamar) {
        this.stokKamar = stokKamar;
    }

    // Metode untuk menyewa kamar
    public void sewaKamar() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama tamu: ");
        String namaTamu = in.nextLine(); 
        System.out.print("Masukkan No Telpon anda: ");
        String noTelpon = in.nextLine();
        System.out.print("Masukkan jumlah kamar yang ingin disewa: ");
        int jumlahSewa = in.nextInt();
        System.out.print("Masukkan lama menginap (dalam malam): ");
        int lamaMenginap = in.nextInt();

        if (stokKamar >= jumlahSewa) {
            int totalHarga = harga * jumlahSewa * lamaMenginap; 
            

            
            daftarTamuRg.add(new Tamu(namaTamu, jumlahSewa, lamaMenginap, totalHarga, noTelpon));

            System.out.println("\n==========================================================================");
            System.out.println("DETAIL PENYEWAAN KAMAR VIP");
            System.out.println("==========================================================================");
            System.out.println("Kamar berhasil disewa oleh " + namaTamu + " sebanyak " + jumlahSewa + " kamar untuk " + lamaMenginap + " malam.");
            System.out.println("Total Harga: " + totalHarga);

        } else {
            System.out.println("Maaf, stok kamar tidak mencukupi.");
        }
    }


    public void lihatTamu() {
        
        if (daftarTamuRg.isEmpty()) {
            System.out.println("Belum ada tamu yang melakukan pemesanan.");
            return;
        }

        System.out.println("\n==========================================================================");
        System.out.println("DAFTAR TAMU KAMAR VIP");
        System.out.println("==========================================================================");
        System.out.println("FASILITAS");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("- 2 kasur");
        System.out.println("- 1 kamar mandi");
        System.out.println("- Ruangan ber AC");
        System.out.println("- Breakfast untuk 2 orang");
        System.out.println("- Akses TV + Netflix Premium");
        System.out.println("- Akses Spa Gratis");
        System.out.println("- Free akses makanan 2 kali per 2 porsi selama 24 jam pertama");
        System.out.println("- Pelayanan dari Resepsionis lebih di prioritaskan");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < daftarTamuRg.size(); i++) {
            Tamu tamu = daftarTamuRg.get(i);
            System.out.println("Tamu " + (i + 1) + ":");
            System.out.println("Nama: " + tamu.getNama());
            System.out.println("No Telpon: " + tamu.getNoTelpon());
            System.out.println("Jumlah Kamar: " + tamu.getJumlahKamar());
            System.out.println("Lama Menginap: " + tamu.getLamaMenginap() + " malam");
            System.out.println("Total Harga: " + tamu .getTotalHarga());
            System.out.println("-------------------------------------------------------------");
            jumlah += tamu.getJumlahKamar();
        }
        System.out.println("=============================================================");
        System.out.println("Sisa kamar yang tersedia :" + (stokKamar-jumlah));
    }
}