package Inheritance;
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

public class Inheritance {
    public static void main(String[] args) {
        Dog d  = new Dog();
        d.bark();
        d.eat();
    }
}
