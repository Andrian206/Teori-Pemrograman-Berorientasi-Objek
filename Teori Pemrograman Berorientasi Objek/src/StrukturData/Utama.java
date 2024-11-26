package StrukturData;
class NilaiMatkul {
    private String Nama;
    private String Nim;
    private String Nilai;
    NilaiMatkul(){
    }
    void setNim(String Nim){
        this.Nim = Nim;
    }
    String getNim(){
        return Nim;
    }
    void setNama(String Nama){
        this.Nama = Nama;
    }
    String getNama(){
        return Nama;
    }
    void setNilai(String Nilai){
        this.Nilai = Nilai;
    }
    String getNilai(){
        return Nilai;
    }
}
class Node {
    NilaiMatkul data;
    Node next;
    Node prev;
    
    Node(NilaiMatkul data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoubleLinkedListNilai {
    private Node head;
    private Node tail;

    DoubleLinkedListNilai() {
        this.head = null;
        this.tail = null;
    }
    void add(NilaiMatkul nilaiMatkul) {
        Node newNode = new Node(nilaiMatkul);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.println("Nama: " + current.data.getNama() + "\nNIM: " + current.data.getNim() +
            "\nNilai: " + current.data.getNilai() + "\n");
            current = current.next;
        }
    }
    void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println("Nama : " + current.data.getNama() + "\nNIM : " + current.data.getNim() +
            "\nNilai : " + current.data.getNilai() + "\n");
            current = current.prev;
        }
    }
}
public class Utama {
    public static void main(String[] args) {
        DoubleLinkedListNilai list = new DoubleLinkedListNilai();

        NilaiMatkul n1 = new NilaiMatkul();
        n1.setNama("Hakim");
        n1.setNim("20230810120");
        n1.setNilai("A");

        NilaiMatkul n2 = new NilaiMatkul();
        n2.setNama("Rio");
        n2.setNim("20230810155");
        n2.setNilai("B");
        
        NilaiMatkul n3 = new NilaiMatkul();
        n3.setNama("Danis");
        n3.setNim("20230810027");
        n3.setNilai("A");
        
        NilaiMatkul n4 = new NilaiMatkul();
        n4.setNama("Nuzul");
        n4.setNim("20230810117");
        n4.setNilai("AB");
        
        NilaiMatkul n5 = new NilaiMatkul();
        n5.setNama("Wahyu");
        n5.setNim("20230810147");
        n5.setNilai("A");

        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);

        System.out.println("Display Forward : \n");
        list.displayForward();

        System.out.println("\nDisplay Backward : \n");
        list.displayBackward();
    }
}
