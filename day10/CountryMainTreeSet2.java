package day10;

import java.util.SortedSet;
import java.util.TreeSet;

public class CountryMainTreeSet2 {

	//program to demonstrate the use of sorted collection for user defined objects
	public static void main(String[] args) {
		
		System.out.println("*******");
		Country ind = new Country();
		Country us = new Country("us" , "USA" , 53);
		Country ger = new Country("ger" , "GERMANY" , 12);
		
		SortedSet<Country> allCountries = new TreeSet<>();
		allCountries.add(ind);
		allCountries.add(us);
		allCountries.add(ger);

		for(Country ctr : allCountries)
		{
			System.out.println(ctr);
		}
		//it gives exception bz treeset cannot undersand which they want code population or name to avoid the use interface comparable
	}

}
