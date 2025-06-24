public interface DefaaultStaticInterface {
 
    void run(); //abstract method till java 7
	
	default void show() {
		System.out.println("Default method"); // java 8 onwards 9,11,12....24
	}
	
	static void print() {
		System.out.println("static method"); // java 8 onwards 9,11,12....24
	}
}