/*
***************************************************************************
1. Inheritance
Sesuai namanya, inheritance berarti pewarisan. Dalam konteks OOP, konsep ini merujuk pada
ketika sebuah class(parent) menurunkan member class, yaitu atribut dan method ke class lain(child).
Inheritance ditandai oleh keywords  : extends,super,this



***************************************************************************

*/
class Mahasiswa {
    String namaMahasiswa = "Joe";
    String NIM = "211401230";
    int angkatan = 2021;

    public void perkenalan() {
        System.out.println(
                "Perkenalkan, nama saya " + namaMahasiswa + " dengan NIM : " + NIM + " Saya angkatan " + angkatan);
    }

}

class aslabIKLC extends Mahasiswa {
    String AslabMatkul = "Jarkom";

    public void mengajar() {
        System.out.println("Sekarang buka modul 1");
    }
}

public class Inheritance {

    public static void main(String[] args) throws Exception {
        aslabIKLC joe = new aslabIKLC();
        joe.perkenalan();
        joe.mengajar();
    }
}
