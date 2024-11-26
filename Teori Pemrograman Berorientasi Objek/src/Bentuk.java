public class Bentuk {
    public static int LuasP (int p, int l){
        return p * l;
    }
    public static float LuasS (int a, float t){
        return a / 2 * t;
    }
    public static double LuasL (double phi, int j){
        return j * j * phi;
    }
    public static void main (String[] args){
        Bentuk Lingkaran = new Bentuk();
        System.out.println ("Data berbagai Luas Bentuk Bangun Datar");
        System.out.println ("Luas Persegi   : " +Bentuk.LuasP (3, 4));
        System.out.println ("Luas Segitiga  : " +Lingkaran.LuasS (3, 4));
        System.out.println ("Luas Lingkaran : " +Lingkaran.LuasL (3, 4));
    }
}
