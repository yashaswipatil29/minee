
public class NameCollectionMain {

	public static void main(String[] args) {
	 
		try {
			int position = NameCollection.getPosition("sita");
			System.out.println(position);
		} catch (NameNotFoundException nameEx) {
			// TODO Auto-generated catch block
			String Message = nameEx.getMessage();
			System.out.println(Message);
		}
		

	}

}
