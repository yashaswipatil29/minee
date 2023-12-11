package day2;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Fruit f1 = new Fruit();
     Fruit f2 = new Fruit("aa","ss");
     Fruit f3 = new Fruit("bb" ,"dd");
     
     System.out.println("FruitCout is "+Fruit.fruitCount);
     
//     System.out.println("TotalFruitCout is "+f1.getTotalFruitCount());
     
     System.out.println("TotalFruitCout is "+Fruit.getTotalFruitCount());
	}

}
 