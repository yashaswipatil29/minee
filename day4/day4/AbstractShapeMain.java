package day4;

public class AbstractShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh;
		sh=new Circle();
		sh.draw();
		sh.erase();
		
		sh=new Rectangle();
		sh.draw();
		sh.erase();
	}

}
