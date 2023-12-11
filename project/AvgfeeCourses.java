package project;

public class AvgfeeCourses implements CourseInfoProcessor {

	float avg=0;
	float count=0;
	@Override
	public float processCourseInfo(Course[] c, CourseInfo[] ci) {
	
		for(int i=0;i<c.length;i++)
		{
			if((c[i].getProvider()==(ci[0].getProviderName())) && (c[i].getDuration()==ci[1].getDuration()))
			{
				count++;
				avg+=c[i].getFees();
			}
		}
		return avg/count;
		
	}
       
}
