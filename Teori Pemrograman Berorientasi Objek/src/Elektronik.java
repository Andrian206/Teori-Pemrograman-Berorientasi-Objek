import javax.swing.JOptionPane;

class Elektronik {
    protected String merek;
    protected int daya;
    protected int tahun;

    public Elektronik(String merek, int daya, int tahun) {
        this.merek = merek;
        this.daya = daya;
        this.tahun = tahun;
    }

    public void nyalakan() {
        JOptionPane.showMessageDialog(null, "Elektronik dinyalakan.");
    }

    public void info(String tambahan) {
        JOptionPane.showMessageDialog(null, "Merek: " + merek + "\nDaya: " + daya + " watt\nTahun: " + tahun + "\n" + tambahan);
    }
}

class Kulkas extends Elektronik {
    private int kapasitas;

    public Kulkas(String merek, int daya, int tahun, int kapasitas) {
        super(merek, daya, tahun);
        this.kapasitas = kapasitas;
    }

    @Override
    public void nyalakan() {
        JOptionPane.showMessageDialog(null, "Kulkas " + merek + " dengan kapasitas " + kapasitas + " liter dinyalakan.");
    }

    @Override
    public void info(String tambahan) {
        JOptionPane.showMessageDialog(null, "Merek: " + merek + "\nDaya: " + daya + " watt\nTahun: " + tahun + "\nKapasitas: " + kapasitas + " liter\n" + tambahan);
    }
}


class Televisi extends Elektronik {
    private int ukuranLayar;

    public Televisi(String merek, int daya, int tahun, int ukuranLayar) {
        super(merek, daya, tahun);
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public void nyalakan() {
        JOptionPane.showMessageDialog(null, "Televisi " + merek + " dengan ukuran layar " + ukuranLayar + " inci dinyalakan.");
    }
    
    @Override
    public void info(String tambahan) {
        JOptionPane.showMessageDialog(null, "Merek: " + merek + "\nDaya: " + daya + " watt\nTahun: " + tahun + "\nUkuran Layar: " + ukuranLayar + " inci\n" + tambahan);
    }
}
class MesinCuci extends Elektronik {
    private int kapasitas;

    public MesinCuci(String merek, int daya, int tahun, int kapasitas) {
        super(merek, daya, tahun);
        this.kapasitas = kapasitas;
    }

    @Override
    public void nyalakan() {
        JOptionPane.showMessageDialog(null, "Mesin Cuci " + merek + " dengan kapasitas " + kapasitas + " kg dinyalakan.");
    }

    @Override
    public void info(String tambahan) {
        JOptionPane.showMessageDialog(null, "Merek: " + merek + "\nDaya: " + daya + " watt\nTahun: " + tahun + "\nKapasitas: " + kapasitas + " kg\n" + tambahan);
    }
}

class Main {
    public static void main(String[] args) {
        Elektronik elektronik = null;

        String[] options = {"Kulkas", "Televisi", "Mesin Cuci"};
        int choice = JOptionPane.showOptionDialog(null, "Pilih jenis elektronik:", "Pilihan Elektronik",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(choice == JOptionPane.CLOSED_OPTION){
            System.exit(0);
        }

        String merek = JOptionPane.showInputDialog("Masukkan merek:");
        int daya = Integer.parseInt(JOptionPane.showInputDialog("Masukkan daya (watt):"));
        int tahun = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tahun:"));

        
        switch (choice) {
            case 0:
                int kapasitas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kapasitas (liter):"));
                elektronik = new Kulkas(merek, daya, tahun, kapasitas);
                break;
            case 1:
                int ukuranLayar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan ukuran layar (inci):"));
                elektronik = new Televisi(merek, daya, tahun, ukuranLayar);
                break;
            case 2:
                kapasitas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kapasitas (kg):"));
                elektronik = new MesinCuci(merek, daya, tahun, kapasitas);
                break;
            default:
                System.exit(0);
                 
        }

        elektronik.nyalakan();
        elektronik.info("");
    }
}



