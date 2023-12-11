package day10;

import java.util.Comparator;

public class NameWiseDescendingComparator implements Comparator<Country>{
	//this class provide sorting algorithm for country objects based upon their names in descending order
	//class is different thats wht two parameter

	@Override
	public int compare(Country country1, Country country2) {
		// TODO Auto-generated method stub
		String name1 = country1.getName();
		String name2 = country2.getName();
		
		int comparison=name2.compareTo(name1);
		return comparison;
	}

}
