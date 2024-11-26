import Struktural.Kaprodi;
public class Sekprodi {
    public void kerja() {
        System.out.println("1. Membantu melaksanakan kebijakan prodi");
    }
    public static void main (String[] args) {
        Kaprodi TI;
        TI = new Kaprodi();
        Sekprodi Ti = new Sekprodi();
        System.out.println("Tugas Sekretaris Prodi : ");
        Ti.kerja();
        TI.santai();
    }
}
