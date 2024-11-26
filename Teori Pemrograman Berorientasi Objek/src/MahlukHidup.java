class MahlukHidup {
    public String nama;
    protected MahlukHidup (String nama){
        this.nama = nama;
    }
    public String Biodata(){
        return ("Nama   : "+nama);
    }
    public static void main (String[] args){
        Pelajar Siswa = new Pelajar ("Daffa", "20230810", "SMAN 3 Kuningan");
        System.out.println (Siswa.Biodata());
    }
    class Pelajar extends MahlukHidup {
        public int nis;
        private String AsalSekolah;
        public Pelajar (String NamaPelajar, int nis, String Sekolah){
            super (NamaPelajar);
            this.nis = nis;
            AsalSekolah = Sekolah;
        }
    }
    public String Biodata(){
        return super.Biodata()+"\nNIS    : "+nis+"\nAsal Sekolah   : "+AsalSekolah;
    }
}
