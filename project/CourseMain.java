package project;



public class CourseMain {
	
	
	

	public static void main(String[] args) {
		
		Course CourseList[]=new Course[3];
	    
    	CourseList[0] = new Course(1,"web dev",1000,"udemy",20000);
		CourseList[1] = new Course(1,"Angular",10,"udemy",20000);
		CourseList[2] = new Course(1,"React",100,"udemy",20000);
		
		CourseProcessor.printShortDurationCourseNames(CourseList);
		
		
		System.out.println("*************************************************");
		Course c = new Course(1,"web dev",2,"udemy",20000);
		Course c1 = new Course(1,"web dev",2,"udemy",20000);
		Course c2 = new Course(1,"web dev",2,"udemy",20000);

		System.out.println("********* Display all Courses *********");
		c.getDisplay();
        c1.getDisplay();
        
        System.out.println("******* Total Course Count *********");
        System.out.println("Total Course is "+Course.totalCourse);
        
        System.out.println("****** Using Abstract method ******");
        
        System.out.println("********** Average  Duration  *************");
        CourseDataCaalculator calDur = new CourseAvgDuration();
        System.out.println("Avg of Duration is "+calDur.doCalculation(CourseList));
        
        System.out.println("********** Average  Fees  *************");
        CourseDataCaalculator calFee = new AvgCourseFees();
        System.out.println("Avg of Fees is "+calFee.doCalculation(CourseList));
        
        
        System.out.println("****** ToDO5 ***********");
        
       Course CourseList1[]=new Course[5];
		CourseInfo CourseInfo1[]=new CourseInfo[1];		

		
    	CourseList1[0] = new Course(101, "Core Java",100, "Udemy", 5500);
		CourseList1[1] = new Course(102, "Adv Java",100, "Udemy", 8500);
		CourseList1[2] = new Course(103, "Angular",60, "Edureka",7500);
		CourseList1[3] = new Course(104, "Angular",75, "Coursera", 8000);
		CourseList1[4] = new Course(105, "Spring",40, "Udemy", 10500);
		
		
		CourseInfo1[0]=new CourseInfo("udemy",100);
		
		CourseInfoProcessor cip;
        System.out.println("************** Total count  *******************");
        cip = new TotalCountCourses();
        System.out.println("Total Count is "+cip.processCourseInfo(CourseList1, CourseInfo1));
		
		System.out.println("*************** Average Fee Coure Info *******************");
		
		cip=new AvgfeeCourses();
		System.out.println("Average of fee is "+cip.processCourseInfo(CourseList1, CourseInfo1));

       
        
}
}
