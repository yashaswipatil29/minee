package day10;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************Ascending order but it is not type safe**************");
		SortedSet countryNames = new TreeSet();
        countryNames.add("India");
        countryNames.add("England");
        countryNames.add("Goa");
        countryNames.add("Delhi");       
       // countryNames.add(100);//interger and string ar siblings
        
        //gives the compilation error
        
        for(Object obj : countryNames)
        {
        	System.out.println(obj);
        }
        
        System.out.println("******************** make type unsafe regular used ********************");
        SortedSet<String> countryNames1 = new TreeSet();
        countryNames1.add("India");
        countryNames1.add("England");
        countryNames1.add("Goa");
        countryNames1.add("Delhi");       
        
        //gives the compilation error
        
        for(String countryName : countryNames1)
        {
        	System.out.println(countryNames);
        }

	}

}
