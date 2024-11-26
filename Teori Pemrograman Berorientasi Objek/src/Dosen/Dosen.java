package Dosen;
interface Biodata {
    String nama = "Siti Maesyaroh, S.Kom., M.Kom.";
    void kerja();
}
interface Mengajar extends Biodata {
    String kelas = "TINFC - 2023 - 04";
    void tempat();
}
interface Waktu {
    int jammasuk = 10; int menitmasuk = 30;
    int jamselesai = 12; int menitselesai = 5;
    void waktu();
}
interface Device {
    String merklaptop = "Lenovo";
    void laptop();
}
class Dosen implements Mengajar, Waktu, Device {
    @Override
    public void kerja() {
        System.out.println(nama + " sebagai dosen mata kuliah PBO");
    }
    @Override
    public void tempat() {
        System.out.println("Mengajar di kelas " + kelas);
    }
    @Override
    public void waktu() {
        System.out.println("Masuk pada pukul " + jammasuk + ":" + menitmasuk + " dan selesai pada pukul " + jamselesai + ":0" + menitselesai);
    }
    @Override
    public void laptop() {
        System.out.println("Mengajar menggunakan laptop dengan merk " + merklaptop);
    }
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.kerja();
        d1.tempat(); 
        d1.waktu();
        d1.laptop();
    }
}
