package day11;

public class PrintableMain {
//this program makes use of simple lambda expression
	public static void main(String[] args) {

		Printable p1=()->System.out.println("Hello");
		Printable p2=()->System.out.println("Yashaswi");
		//this is blocked lambda
		Printable p3=()->{
			System.out.println("hiiii");
			System.out.println("Bye");
			
		};
        p1.print();
        p2.print();
        p3.print();
	}

}
