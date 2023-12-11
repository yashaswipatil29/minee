package day2;

public class PersonMain {
	
	
	private static void printMinorPersonNames(Person [] PersonListRef)
	{
		for(Person CurrentPerson : PersonListRef)
		{
			int CurrentPersonAge=CurrentPerson.getAge();
			String CurrentPersonName=CurrentPerson.getName();

			if(CurrentPersonAge<=18)
			{
				System.out.println(CurrentPersonName);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person PersonList[]=new Person[3];
		
		PersonList[0]=new Person();
		PersonList[1]=new Person("mayu",18);
		PersonList[2]=new Person(14,"pritish");
		
//		System.out.println(PersonList[0].getName()+","+PersonList[0].getAge());
//		System.out.println(PersonList[1].getName()+","+PersonList[1].getAge());
//		System.out.println(PersonList[2].getAge()+","+PersonList[2].getName());

		printMinorPersonNames(PersonList);
	}

}
