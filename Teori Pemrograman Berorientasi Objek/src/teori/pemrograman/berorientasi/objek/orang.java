/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori.pemrograman.berorientasi.objek;

/**
 *
 * @author Pongo
 */
public class orang {
    public void caraMakan(){
        System.out.println("Sebagian orang jika makan menggunakan tangan");
    }
    public void caraMinum(){
        System.out.println("Rio minum pipis anak TK");
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
        super.caraMinum(); // Pemanggilan super.caraMinum() di sini
        System.out.print("Namun ");
        super.caraMakan();
    }
    public mahasiswa() {
        System.out.println("eksekusi constructor mahasiswa...");
    }
    public void caraMakan() {
        System.out.println("Mahasiswa makan menggunakan sendok");
    }
}



