/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori.pemrograman.berorientasi.objek;

/**
 *
 * @author Pongo
 */
public class SpekHp {
    public void Brand () {
        System.out.print ("Setiap Brand Smartphone memiliki lini flagship ");
    }
    public void Chipset () {
        System.out.println ("dan setiap brand memiliki racikan chipset yang berbeda - beda dengan smartphone lainnya.");
    }
    public static void main (String[]args) {
        Xiaomi SpekHp1 = new Xiaomi();
        Vivo SpekHp2 = new Vivo();
        Honor SpekHp3 = new Honor();
        SpekHp1.Brand ();
        SpekHp1.Chipset ();
        SpekHp2.Brand ();
        SpekHp2.Chipset ();
        SpekHp3.Brand ();
        SpekHp3.Chipset ();
    }
}
class Xiaomi extends SpekHp{
    public Xiaomi () {
        super ();
        super.Brand ();
        super.Chipset ();
        System.out.println ("----------------------------------------");
    }
    @Override
    public void Brand () {
        System.out.print ("* ");
        System.out.println ("Brand smartphone Xiaomi memiliki lini flagship bernama Xiaomi 13 Ultra ");
    }
    @Override
    public void Chipset () {
        System.out.println ("dengan Chipset Qualcomm Snapdragon 8 Gen 2.");
    }
}
class Vivo extends SpekHp{
    public Vivo () {
        super ();
    }
    @Override
    public void Brand () {
        System.out.print ("* ");
        System.out.println ("Brand smartphone Vivo memiliki lini flagship bernama Vivo X100 Pro ");
    }
    @Override
    public void Chipset () {
        System.out.println ("dengan Chipset Mediatek Dimensity 9300.");
    }
}
class Honor extends SpekHp{
    public Honor () {
        super ();
    }
    @Override
    public void Brand () {
        System.out.print ("* ");
        System.out.println ("Brand smartphone Honor memiliki lini flagship bernama Honor Magic 6 Pro ");
    }
    @Override
    public void Chipset () {
        System.out.println ("dengan Chipset Snapdragon 8 Gen 3.");
    }
}


