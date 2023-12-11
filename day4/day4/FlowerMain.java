package day4;

public class FlowerMain {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x);
		
		System.out.println("******** ToString method *************");
		Flower f1= new Flower();
		//System.out.println(f1.getName()+","+f1.getColor());
        //System.out.println(f1);
		String FlowerData = f1.toString();
		System.out.println(FlowerData);
		
		System.out.println("************ using Finalize method **************");
		for(int a=0;a<=5;a++)
		{
			new Flower();
		}
		System.gc();
		
		
		
		
	}

}
