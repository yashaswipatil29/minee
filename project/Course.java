package project;

public class Course {
    int courseId;
    String title;
    int duration ;
    String provider;
    int fees;
    static int totalCourse;
    
	public Course(int courseId, String title, int duration, String provider, int fees) {
		
		this.courseId=courseId;
		this.title = title;
		this.duration = duration;
		this.provider = provider;
		this.fees = fees;
		totalCourse++;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public static int getTotalCourse()
	{
		return totalCourse;
	}
	
	
	public void getDisplay()
	{
		System.out.println("Courseid is "+courseId);
		System.out.println("Title is "+title);
		System.out.println("Duration is "+duration);
		System.out.println("Provider is "+provider);
		System.out.println("Fees is "+fees);
	}
	
	
	
	
}
