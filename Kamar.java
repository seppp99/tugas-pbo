public class Kamar {
    
    protected int harga;
    protected int kapasitas;
    

    
    public Kamar() {
        this.harga = 0;
        this.kapasitas = 2;
        
    }

    
    public Kamar(int harga, int kapasitas) {
        this.harga = harga;
        this.kapasitas = kapasitas;
    }

    
    public void infoKamar() {
        System.out.println("Harga per kamar : " + harga);
        System.out.println("Kapasitas: " + kapasitas);
    
    }

    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    
}
