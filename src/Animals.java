import java.util.SortedMap;

public class Animals {

    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Delfin("Błękitek");
        animals[4] = new Bull("Fernando");
        animals[5] = new Animal();

        for (Animal animal : animals) {
            animal.introduce();
        }

    }

}


class Animal {

    String name;

    public Animal() {
        this.name = "bezimienny ";
    }

    String showname() {

        return "Zwierzę " + name;
    }

    String makesound() {
        return " ?????????";
    }

    void introduce() {
        System.out.println("Jestem " + showname() + makesound());
    }

}


class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showname() {
        return "pies " + name;
    }

    @Override
    String makesound() {
        return " hau hau";
    }
}

class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }
}

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showname() {
        return "świnka " + name;
    }

    @Override
    String makesound() {
        return " chrum chrum";
    }
}
class Delfin extends Animal {
    public Delfin(String name) {
        this.name = name;
    }

    @Override
    String showname() {
        return "Delfin " + name;
    }

    @Override
    String makesound() {
        return " bul bul ";
    }
}
class Bull extends Animal {
    public Bull(String name) {
        this.name = name;
    }

    @Override
    String showname() {
        return "Bull " + name;
    }

    @Override
    String makesound() {
        return " Mu mu";
    }
}
