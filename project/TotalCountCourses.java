package project;

public class TotalCountCourses implements CourseInfoProcessor {

	
	float count=0;
	@Override
	public float processCourseInfo(Course[] c, CourseInfo[] ci) {
	    for(int i=0;i<c.length;i++)
	    {
	    	if(c[i].getProvider()==(ci[0].getProviderName()) && (c[i].getDuration()==(ci[1].getDuration())))
	    	{
	    		count++;
	    	}
	    }
	    return count;
	}
        
}
