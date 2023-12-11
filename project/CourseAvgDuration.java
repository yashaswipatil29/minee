package project;

public class CourseAvgDuration extends CourseDataCaalculator {

	@Override
	public float doCalculation(Course[] allCourses) {
		
		float totalDur=0;
		
		for(int i=0;i<allCourses.length;i++)
		{
			totalDur = totalDur + allCourses[i].getDuration();
		}
		float avgDur = totalDur /allCourses.length;
		return avgDur;
	}

}
