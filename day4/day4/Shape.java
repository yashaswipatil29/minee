package day4;

public abstract class Shape {

	public abstract void draw();
	final public void erase()
	{
		System.out.println("Erase the circle and Rectangle");
	}
	
}
class myShape extends Shape
{
	public void draw()
	{
		
	}
//	@Override
//	public void erase()
//	{
//		System.out.println("derived class erase");
//	}
}