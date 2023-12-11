package project;

public class AvgCourseFees extends CourseDataCaalculator {

	@Override
	public float doCalculation(Course[] allCourses) {
        float totalFees=0;
		
		for(int i=0;i<allCourses.length;i++)
		{
			totalFees = totalFees + allCourses[i].getFees();
		}
		float avgFee = totalFees /allCourses.length;
		return avgFee;

}
}
