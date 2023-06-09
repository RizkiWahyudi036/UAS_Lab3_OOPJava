
/*
2. Polimorphism
jika diterjemahkan langsung polimorphisme berarti banyak bentuk. Dalam konteks OOP, konsep ini masih erat kaitannya dengan inheritance.
Konsep ini merujuk pada class yang punya method yang sama dengan method class induknya namun perilakunya berbeda.
Keyword : extend,implement,@override

 */

class Manusia {

    public void berkata() {
        System.out.println("Saya adalah Manusia");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void berkata() {
        System.out.println("Saya adalah mahasiswa");
    }
}

class AslabIKLC extends Manusia {
    @Override
    public void berkata() {
        System.out.println("Saya adalah ASLAB IKLC");
    }
}

public class Polymorphism {
    public static void main(String[] args) throws Exception {
        Mahasiswa harry = new Mahasiswa();
        AslabIKLC joe = new AslabIKLC();

        harry.berkata();
        joe.berkata();
    }
}
