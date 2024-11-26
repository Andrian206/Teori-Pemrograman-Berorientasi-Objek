public class Mahasiswa {
    public static String mahasiswa (String nama) {
        return "Nama    : " +nama;
    }
    public static String mahasiswa (int nim) {
        return "NIM     : " +nim;
    }
    
    public static String mahasiswa (double nilai) {
        return "Nilai   : " +nilai;
    }
    public static void main (String[] args) {
        System.out.println(Mahasiswa.mahasiswa ("Rio Andika Andriansyah"));
        System.out.println(Mahasiswa.mahasiswa (20230810));
        System.out.println(Mahasiswa.mahasiswa (90.5));
    }
}       

