package day2;

public class SquareRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {9,49,81,64};
		float allSquareRoots[] = getSquareRoots(numbers);
		for(float sqRoot:allSquareRoots)
		{
			System.out.println(sqRoot);
		}

	}

	private static float[] getSquareRoots(int[] numsArray) {
		
		// TODO Auto-generated method stub
		int size=numsArray.length;
		int index=0;
		float squareRoots[]=new float[size];//dyanamically create array
		for(int num:numsArray)
		{
			float SquareRoot = (float)Math.sqrt(num);
			squareRoots[index]=SquareRoot;
			index++;
		}
		
		return squareRoots;
	}
  
}
