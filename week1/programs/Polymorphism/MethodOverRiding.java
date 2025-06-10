class Animal{
    void makeSound(){
        System.err.println("Animal sounds");
    }
}

// abstract class Animal{
//     abstract void makeSound();
// }


class Dog extends Animal{

    // @Override
    void makeSound(){
        System.err.println("Dog barks");
    }
}

public class MethodOverRiding {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();

    }
    
}
