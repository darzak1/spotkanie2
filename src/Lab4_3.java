public class Lab4_3 {

    public static void main(String[] args) {

        new C(false);
    }

}

class A {
    public A() {

        System.out.println("Działa konstruktor klasy A");
    }
    public A (boolean isSilent) {
        if (!isSilent){
            System.out.println("Konstruktor A (boolean isSilent");
        }

    }
}


class B extends A {
    public B() {

        System.out.println("Działa konstruktor klasy B");
    }
    public B (boolean isSilent) {
        super();
        if (!isSilent){
            System.out.println("Konstruktor B (boolean isSilent");
        }

    }

}

class C extends B {
   public C() {

        System.out.println("Działa konstruktor klasy C");
    }
    public C (boolean isSilent) {
        super();
        if (!isSilent){
            System.out.println("Konstruktor C (boolean isSilent)");
        }

    }
}
