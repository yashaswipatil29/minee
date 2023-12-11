package day3;

public class OnlineTraining extends Training {
   private String meetingLink;

public String getMeetingLink() {
	return meetingLink;
}

public void setMeetingLink(String meetingLink) {
	this.meetingLink = meetingLink;
}


public OnlineTraining(String moduleName, int duration, String meetingLink) {
	super(moduleName, duration);
	this.meetingLink = meetingLink;
}
@Override
public void conductTraining()
{
	 System.out.println("Conducting online training "+meetingLink);
}

   
}
