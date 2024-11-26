package Pemanggil;
abstract class Pengajar {
    public String nama;
    public abstract void caramakan();
    public void kerja(){
        System.out.println (this.nama + " sebagai dosen yang mengajar mata kuliah PBO");
    }
    public static void main (String[] args){
        Dosen obj1 = new Dosen("Siti Maesyaroh");
        obj1.kerja();
        obj1.caramakan();
    }
}
class Dosen extends Pengajar {
    public Dosen (String nama){
        this.nama = nama;
    }
    @Override
    public void caramakan(){
        System.out.println ("Jika makan menggunakan sendok");
    }
}