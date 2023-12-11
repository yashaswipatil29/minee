package day11;

public class GreetingMain {
//program that makes use of lambda expression for method returning a value
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting firstGreeting = () -> "Hello";
		
		Greeting secondGreeting=()->{
		String message="Welcome";
		return message;
		
		
	};
	
	String greeting1=firstGreeting.sayGreeting();
	String greeting2=secondGreeting.sayGreeting();
	
	System.out.println(greeting1);
	System.out.println(greeting2);

}
}