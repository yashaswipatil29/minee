
public class MultipleExceptionHandling3 {

	public static void main(String[] args) {
		
		try {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		int  result = x/y;
		System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Enter atleast 2 numbers");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Enter secoond number as non zero");
		}

	}

}
