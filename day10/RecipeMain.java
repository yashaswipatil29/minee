package day10;

import java.util.HashSet;
import java.util.Set;

public class RecipeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recipe r1 = new Recipe();//this is the default recipe
		System.out.println("Printing 1nd recipe data");
		System.out.println("Name" +r1.getName());
		System.out.println("PrepartionTime "+r1.getPrepartionTime()+"Minutes");
		System.out.println("Ingredients ");
		Set<String> r1Ingredients = r1.getIngredients();
		
		for(String ing : r1Ingredients)
		{
			System.out.println(ing);
		}
		
  //creating second recipe using parametrized constructor
		Set<String> recipe2Ingredients = new HashSet<>();
		recipe2Ingredients.add("cobbage1");
		recipe2Ingredients.add("cobbage2");
		recipe2Ingredients.add("cobbage3");
		
		//set is interface you cannot create object of set
		
		Recipe r2 = new Recipe("noodles" , 30,recipe2Ingredients);

		System.out.println("Printing 2nd recipe data");
		System.out.println("Name" +r2.getName());
		System.out.println("PrepartionTime "+r2.getPrepartionTime()+"Minutes");
		System.out.println("Ingredients ");
		Set<String> r2Ingredients = r2.getIngredients();
		
		for(String ing : r2Ingredients)
		{
			System.out.println(ing);
		}
		
		
		//creating third receipe using utility method
		Set<String>  recipe3Ingredients = new HashSet<>();
		Recipe r3 = new Recipe("Shrikhand",20,recipe3Ingredients );
		r3.addIngredients("Mango");
		r3.addIngredients("Badam");
		r3.addIngredients("Pista");
		r3.addIngredients("Ilaychi");
		System.out.println("Printing 3nd recipe data");
		System.out.println("Name" +r3.getName());
		System.out.println("PrepartionTime "+r3.getPrepartionTime()+"Minutes");
		System.out.println("Ingredients ");
		Set<String> r3Ingredients = r3.getIngredients();
		
		for(String ing : r3Ingredients)
		{
			System.out.println(ing);
		}

		
	}

}
