package day11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain2 {

	
	private static void printClassInfo(String className) throws ClassNotFoundException
	{
		//this method prints some information about the class where the className is accepted by 'className' variable
		System.out.println("***************Method Names*************");
		Class loadedClass = Class.forName(className);
		
		//obtaining a list of methods available in this loaded class
		Method[]allMethods = loadedClass.getDeclaredMethods();
		for(Method currentMethod :allMethods)
		{
			String methodName=currentMethod.getName();
			System.out.println(methodName);
		}
		//obtaining the list of field available in this loaded class
		System.out.println("**************Field Names*************");
		Field[] allFields = loadedClass.getDeclaredFields();
		
		for(Field currentField : allFields)
		{
			String fieldName=currentField.getName();
			System.out.println(fieldName);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			printClassInfo("day11.TrainingProgram");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
