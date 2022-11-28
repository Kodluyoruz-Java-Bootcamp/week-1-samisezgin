package bootcamp_hw1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLeftHandTriangle(6);
		System.out.println();
		printRightHandTriangle(6);

	}
	
	public static void printLeftHandTriangle(long floorNum)
	{
		for (int i=0;i<floorNum;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printRightHandTriangle(long floorNum)
	{
		for (long i=0;i<floorNum;i++)
		{
			for(long k=floorNum-i;k>1;k--)
			{
				System.out.print(" ");
				
			}
			for(long j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	

}
