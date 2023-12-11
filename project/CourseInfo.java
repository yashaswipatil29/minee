package project;

public class CourseInfo {
    private String ProviderName;
    private int duration;
    int totalCount;
    
	public String getProviderName() {
		return ProviderName;
	}
	public void setProvidName(String providerName) {
		ProviderName = providerName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public CourseInfo(String providerName, int duration) {
		
		ProviderName = providerName;
		this.duration = duration;
		totalCount++;
	}
	
	
}
