package day2;

public class Fruit {

	private String name , color ;
	static int fruitCount;
	private static int totalFruitCount;

	public Fruit(String name, String color) {
		
		this.name = name;
		this.color = color;
		fruitCount++;
		totalFruitCount++;
	}
	
	public Fruit()
	{
		name="mango";
		color="yellow";
		fruitCount++;
		totalFruitCount++;
	}
	
	
//	public int getTotalFruitCount()
//	{
//		return totalFruitCount;
//	}

	public static int getTotalFruitCount()
	{
		return totalFruitCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
