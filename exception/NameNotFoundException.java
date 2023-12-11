
public class NameNotFoundException extends Exception {
	

		private String invalidName;

		public NameNotFoundException(String errorMessage , String invalidName) {
			super(errorMessage);
			this.invalidName = invalidName;
		}
		public String getMessage()
		{
			String message = super.getMessage();
			String finalMessage=message + ":"+invalidName;
			
			return finalMessage;
			
		}
		
		
	

}
