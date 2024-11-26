public class orang {
    public void caraMakan(){
        System.out.println("Sebagian orang jika makan menggunakan tangan");
    }
     public static void main (String[] args){
     mahasiswa mhs1 = new mahasiswa();
     mhs1.asalSekolah();
     mhs1.caraMakan();
    }
}
class mahasiswa extends orang {
    public void asalSekolah(){
        System.out.println("Terdapat mahasiswa berasal dari UNIKU");
        System.out.print("Namun ");       
        super.caraMakan();
    }
    public void caraMakan() {
        System.out.println("Mahasiswa makan menggunakan sendok");
    }
}