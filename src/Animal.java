public class Animal {

    public static void main(String[] args) {
        System.out.println("Działa klasa Animal");
    }

}


    abstract class Dog extends Animal implements Voice {
        public Dog() {
            System.out.println("Działa klasa Dog");
        }

        @Override
        public void hauHau() {

        }
    }

    abstract class Cat extends Animal implements Voice{
        public Cat() {
            System.out.println("Działa klasa Cat");
        }

        @Override
        public void mialMial() {

        }
    }
