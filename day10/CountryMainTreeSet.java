package day10;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CountryMainTreeSet {

	//program to demonstrate the use of sorted collection for user defined objects
	public static void main(String[] args) {
		
		Country ind = new Country();
		Country us = new Country("us" , "USA" , 53);
		Country ger = new Country("ger" , "GERMANY" , 12);
		
		System.out.println("***using default argument ****");

		SortedSet<Country> countrySet = new TreeSet<>();
		countrySet.add(ind);
		countrySet.add(us);
		countrySet.add(ger);

		for(Country ctr : countrySet)
		{
			System.out.println(ctr);
		}
		
		System.out.println("********Sorting Customization*****");
		Comparator<Country> nameAscComp = new NameWiseAscendingComparator();
		Comparator<Country> nameDescComp = new NameWiseDescendingComparator();

		System.out.println("***********using customized algorithm - ascending **********");
		SortedSet<Country> countrySet2 = new TreeSet<>(nameAscComp);
		countrySet2.add(ind);
		countrySet2.add(us);
		countrySet2.add(ger);

		for(Country ctr : countrySet2)
		{
			System.out.println(ctr);
		}
		
		System.out.println("***********using customized algorithm -descending **********");
		
		
		SortedSet<Country> countrySet3 = new TreeSet<>(nameDescComp);
		countrySet3.add(ind);
		countrySet3.add(us);
		countrySet3.add(ger);

		for(Country ctr : countrySet3)
		{
			System.out.println(ctr);
		}
		
		
		//it gives exception bz treeset cannot undersand which they want code population or name to avoid the use interface comparable
	}

}
