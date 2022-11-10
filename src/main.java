public class main
{
	static int solution(int[] A)
	{

		if (A.length == 0)
			return 1;
		
		int sumNum = 0;
		int arrSum = 0;
		int lenArr = A.length + 1;
		
		//sum of consecutive integers from 1 to n  equals to n(n+1)/2.
		sumNum = (lenArr*(lenArr + 1))/2;
		
		for (int i = 0; i < A.length; i++) 
		{
			//calculate the sum of array elements
			arrSum += A[i];
		}
		//value of the missing element
		int missEl = sumNum - arrSum;
		
		return missEl;
	}
	
	public static void main(String[] args) 
	{
		// array of missing one number
	    int[] arr = {3,2,1,5};
	    System.out.println(solution(arr));
	    
	}
}
