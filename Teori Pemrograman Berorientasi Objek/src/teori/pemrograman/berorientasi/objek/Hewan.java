/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teori.pemrograman.berorientasi.objek;

/**
 *
 * @author Pongo
 */
public class Hewan { //SuperClass
    public void JumlahKaki(){
        System.out.println("Hewan Memiliki Jumlah Kaki 4 atau 2");
    }
    public void Habitat(){
        System.out.println("Habitat Hewan Sangat Beragam");
    }
    public static void main(String[]args){
        Harimau Hewan1 = new Harimau();
        Burung Hewan2 = new Burung();
        Hewan1.JumlahKaki();
        Hewan1.Habitat();
        Hewan2.JumlahKaki();
        Hewan2.Habitat();
    }
}
class Harimau extends Hewan{ //SubClass
    public Harimau(){//Constructor 
        super();
        super.JumlahKaki();
        super.Habitat();
        System.out.println("============================");
    }
    @Override
    public void JumlahKaki(){
        System.out.println("Harimau Memiliki Jumlah Kaki 4");
    }
    @Override
    public void Habitat(){
        System.out.println("Habitat Harimau Di Darat");
        System.out.println("============================");
    }
}
class Burung extends Hewan{//SubClass
    public Burung(){ //Constructor 
        super();
    }
    @Override
    public void JumlahKaki(){
        System.out.println("Burung Memiliki Jumlah Kaki 2");
    }
    @Override
    public void Habitat(){
        System.out.println("Habitat Burung Di Udara");
    }
}