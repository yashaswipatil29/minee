package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		Map<String,Integer> socialMediaDetails = new HashMap<>();
		socialMediaDetails.put("Facebook",25);
		socialMediaDetails.put("Instagram",45);
		socialMediaDetails.put("Linkledn",55);
		socialMediaDetails.put("Whatsapp",65);
		socialMediaDetails.put("Instagram",100);//This results into override]ing the value


		
		//fetching all the keys from this map
		Set<String> allAvailableKeys = socialMediaDetails.keySet();//returns the set of keys

		//Iterating over the set of keys allAvailableKeys
		for(String key : allAvailableKeys)
		{
			//obtaining the value based upon the corressponding key
			Integer value = socialMediaDetails.get(key);//accepting the keys and returning the 'value
			System.out.println("Key "+ key +" and Value "+ value);
		}


		
		//fetching values from the map directly
		Collection<Integer> allAvailableValues = socialMediaDetails.values();
		for(Integer value : allAvailableValues)
		{
			System.out.println(value);
		}

	}

}
