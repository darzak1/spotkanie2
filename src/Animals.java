public class Animals {

    public static void main(String[] args) {

        Animal1[] animal1s = new Animal1[6];
        animal1s[0] = new Dog1("Burek");
        animal1s[1] = new Cat1("Filemon");
        animal1s[2] = new Pig("Prosiaczek");
        animal1s[3] = new Delfin("Błękitek");
        animal1s[4] = new Bull("Fernando");
        animal1s[5] = new Animal1();

        for (Animal1 animal1 : animal1s) {
            animal1.introduce();
        }

    }

}


class Animal1 {

    String name;

    public Animal1() {
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


class Dog1 extends Animal1 {
    public Dog1(String name) {
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

class Cat1 extends Animal1 {

    public Cat1(String name) {
        this.name = name;
    }
}

class Pig extends Animal1 {
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
class Delfin extends Animal1 {
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
class Bull extends Animal1 {
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
