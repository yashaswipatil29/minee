package day3;

public class OfflineTraining extends Training {
     private String venueDetails;

	public OfflineTraining() {
		super();
	}

	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}
     
     public OfflineTraining(String moduleName, int duration, String venueDetails) {
		super(moduleName, duration);
		this.venueDetails = venueDetails;
	}
@Override
	public void conductTraining()
     {
    	 System.out.println("Conducting offline training "+venueDetails);
     }
}
