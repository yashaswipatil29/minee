package day10;

import java.util.HashSet;
import java.util.Set;

public class Recipe {

	private String name;
	private int prepartionTime;
	private Set<String>ingredients;
	
	
	public Recipe() {
		// TODO Auto-generated constructor stub
		name="Tea";
		prepartionTime = 10;
		ingredients=new HashSet<>();
		ingredients.add("Water");	
		ingredients.add("Sugar");	
		ingredients.add("Ginger");	
		ingredients.add("Tea powder");	
		ingredients.add("Milk");	
		
}


	public Recipe(String name, int prepartionTime, Set<String> ingredients) {
		super();
		this.name = name;
		this.prepartionTime = prepartionTime;
		this.ingredients = ingredients;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrepartionTime() {
		return prepartionTime;
	}


	public void setPrepartionTime(int prepartionTime) {
		this.prepartionTime = prepartionTime;
	}


	public Set<String> getIngredients() {
		return ingredients;
	}


	public void setIngredients(Set<String> ingredients) {
		this.ingredients = ingredients;
	}
	//this is a utility method that allows to add one ingredients at a time
 	public void addIngredients(String ingredient)
	{
		ingredients.add(ingredient);//this refer to r3 but this is hidden parameter which is ignored
	}
}