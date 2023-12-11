package project;

public class CourseProcessor {
	public static void printShortDurationCourseNames(Course [] CourseListRef)
	{
		int size = CourseListRef.length;
		for(int i = 0;i<size;i++)
		{
			

			int CurrentCourseDuration=CourseListRef[i].getDuration();
			String CurrentCourseName=CourseListRef[i].getTitle();

			if(CurrentCourseDuration<40)
			{
				System.out.println(CurrentCourseName);
			}
			
			
		}
		
		/*
		for(Course CurrentCourse : CourseListRef)
		{
			int CurrentCourseDuration=CurrentCourse.getDuration();
			String CurrentCourseName=CurrentCourse.getTitle();

			if(CurrentCourseDuration<40)
			{
				System.out.println(CurrentCourseName);
			}
		}*/
	}
	
	
	

}
