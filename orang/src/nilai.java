public class nilai {
    String nm;
    String nim;
    String kls;
    String jrsn;
    int n1;
    int n2;
    String nm2;
    String nim2;
    String kls2;
    String jrsn2;
    int n12;
    int n22;
    String nm3;
    String nim3;
    String kls3;
    String jrsn3;
    int n13;
    int n23;

    public void nilaiLulus() {
        System.out.println("Lulus");
    }

    public void nilaiTidakLulus() {
        System.out.println("Tidak Lulus");
    }
    public static void main(String[] args) {
        nilai mahasiswa = new nilai();
        mahasiswa.nm = "Rio";
        mahasiswa.nim = "20230810155";
        mahasiswa.kls = "TINFC - 2023 - 04";
        mahasiswa.jrsn = "Teknik Informatika";
        mahasiswa.n1 = 90;
        mahasiswa.n2 = 85;

        mahasiswa.nm2 = "Miaw";
        mahasiswa.nim2 = "20230810115";
        mahasiswa.kls2 = "TINFC - 2023 - 04";
        mahasiswa.jrsn2 = "Teknik Informatika";
        mahasiswa.n12 = 40;
        mahasiswa.n22 = 55;

        mahasiswa.nm3 = "Ambatron";
        mahasiswa.nim3 = "20230810037";
        mahasiswa.kls3 = "TINFC - 2023 - 04";
        mahasiswa.jrsn3 = "Teknik Informatika";
        mahasiswa.n13 = 75;
        mahasiswa.n23 = 90;

        System.out.println("Data Mahasiswa Ke - 1");
        System.out.println("Nama            : " + mahasiswa.nm);
        System.out.println("NIM             : " + mahasiswa.nim);
        System.out.println("Kelas           : " + mahasiswa.kls);
        System.out.println("Jurusan         : " + mahasiswa.jrsn);
        System.out.println("Nilai Ke - 1    : " + mahasiswa.n1);
        System.out.println("Nilai Ke - 2    : " + mahasiswa.n2);
        System.out.print("Dinyatakan ");
        mahasiswa.nilaiLulus();
        
        System.out.println(" ");
        System.out.println("Data Mahasiswa Ke - 2");
        System.out.println("Nama            : " + mahasiswa.nm2);
        System.out.println("NIM             : " + mahasiswa.nim2);
        System.out.println("Kelas           : " + mahasiswa.kls2);
        System.out.println("Jurusan         : " + mahasiswa.jrsn2);
        System.out.println("Nilai Ke - 1    : " + mahasiswa.n12);
        System.out.println("Nilai Ke - 2    : " + mahasiswa.n22);
        System.out.print("Dinyatakan ");
        mahasiswa.nilaiTidakLulus();

        System.out.println(" ");
        System.out.println("Data Mahasiswa Ke - 3");
        System.out.println("Nama            : " + mahasiswa.nm3);
        System.out.println("NIM             : " + mahasiswa.nim3);
        System.out.println("Kelas           : " + mahasiswa.kls3);
        System.out.println("Jurusan         : " + mahasiswa.jrsn3);
        System.out.println("Nilai Ke - 1    : " + mahasiswa.n13);
        System.out.println("Nilai Ke - 2    : " + mahasiswa.n23);
        System.out.print("Dinyatakan ");
        mahasiswa.nilaiLulus();
    }
}