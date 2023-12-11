package day2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num[] = new int[2];
       num[0]=1;
       num[1]=2;
       System.out.println(num[0]);
       System.out.println(num[1]);
       
       int numList[]= {10,20,30,40,50,60,70,80};
       int size=numList.length;
//       for(int number:numList)
//       {
//    	   System.out.println(number);
//       }
       
       for(int i=0;i<size;i++)
       {
    	   int number=numList[i];
    	   System.out.print(number);
       }
	}

}
