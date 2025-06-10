 class Animal {
    void eat(){
        System.err.println("This animla eats food");
    }
}

 class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog{
    void weeps() {
        System.err.println("Puppy weeps");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.bark();
        p.eat();
        p.weeps();
        
    }
}
