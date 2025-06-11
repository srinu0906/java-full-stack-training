package Polymorphism;
public class MethodOverLoading {

    void add(int a,int b ){
        System.err.println("Sum:"+(a+b));
    }

    void add(int a,int b ,int c){
        System.err.println("Sum:"+(a+b+c));
    }

    void add(double a,double b ){
        System.err.println("Sum:"+(a+b));
    }

    // Compile time polymorphism or method overloading
    // same name different signature
    public static void main(String[] args) {

        MethodOverLoading m = new MethodOverLoading();
        m.add(1, 2);
        m.add(1.0, 2.3);
        m.add(1, 2, 3);
        
    }
}
