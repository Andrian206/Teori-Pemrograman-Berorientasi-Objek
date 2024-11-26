import Informasi.Spesifikasi;
public class Mobil extends Spesifikasi {
    @Override
    public String namaKendaraan() {
        return "Honda Jazz 2024";
    }
    @Override
    public String namaMerk() {
        return "Honda";
    }
    @Override
    public int ccMesin() {
        return 1497;
    }
    @Override
    public double hargaMotor() {
        return 256.6;
    }
    public static void main(String[] args) {
        Mobil mb = new Mobil();
        System.out.println("Informasi Kendaraan 2024");
        System.out.println("========================================");
        System.out.println("Nama Kendaraan  : " + mb.namaKendaraan());
        System.out.println("Nama Merk       : " + mb.namaMerk());
        System.out.println("Jumlah CC Mesin : " + mb.ccMesin());
        System.out.println("Harga Motor     : Rp." + mb.hargaMotor() + " Jt");
    }
}
