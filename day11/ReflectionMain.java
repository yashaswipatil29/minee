package day11;

public class ReflectionMain {

	private static void createObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		//this method creates an object of class where the name of the class is accepted by 'className' variable
		//loading the class explicitly 
		Class loadedClass=Class.forName(className);
		//creating an object of the loaded class n
		loadedClass.newInstance();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				createObject("day11.Employee");
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//package prefix is required
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
