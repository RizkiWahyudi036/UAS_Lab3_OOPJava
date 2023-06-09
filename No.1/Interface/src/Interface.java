
/*
3. Interface
Interface mirip dengan class yang menjadi pembeda yaitu interface hanya memuat deklarasi method kosong yang nantinya akan diimplementasikan oleh class lain
Interface tidak memuat atribut,hanya deklarasi method kosong. Interface erat kaitannya dengan polimorfisme. Dengan ciri-ciri ini interface dapat juga disebut sebagai 
Kontrak yang harus dipenuhi oleh class yang akan mengimplementasinya dengan cara melakukan method overriding.
Keyword : implements, @override
 */
interface Manusia {
    public void bernafas();

    public void makan();

    public void bergerak();
}

class Harry implements Manusia {
    @Override
    public void bernafas() {
        System.out.println("Bernafas.....");
    }

    @Override
    public void makan() {
        System.out.println("Makan....");
    }

    @Override
    public void bergerak() {
        System.out.println("Bergerak....");
    }

}

public class Interface {
    public static void main(String[] args) throws Exception {
        Harry harry = new Harry();
        harry.bergerak();
        harry.bernafas();
        harry.makan();
    }
}
