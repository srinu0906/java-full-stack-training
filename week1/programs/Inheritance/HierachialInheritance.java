 class Animal {
    void eat(){
        System.err.println("This animla eats food");
    }
}

class Cow extends Animal{
    void milks(){
        System.err.println("Cow gives milk");
    }
}

class Horse extends Animal{
    void runs(){
        System.err.println("Horse Runs");
    }

}

public class HierachialInheritance {
    public static void main(String[] args) {
        Cow c = new Cow();
        Horse h = new Horse();

        c.eat();
        c.milks();

        h.eat();
        h.runs();
    }
}
