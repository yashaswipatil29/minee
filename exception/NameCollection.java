

public class NameCollection {

	private static String nameList[]= {"ram","sham","sita","gita"};
	
	public static int getPosition(String name) throws NameNotFoundException{
		
		int position = -1;
		int size = nameList.length;
		for(int index=0;index<size;index++)
		{
			String CurrentName = nameList[index];
			if(CurrentName.equals(name)) {
				position=index;
				break;
			}
		}
		if(position == -1)
		{
			String error = "the entered name is invalid.It is not available";
			NameNotFoundException nx = new NameNotFoundException(error,name);
			throw nx;
		}
		return position;
		
		
	}
}
