package bootcamp_hw1;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
	public static void main(String[] args) {
		List<Long> palindromeChain=new ArrayList<>();
		long stepSize=0;
		
		
		for (int i = 10; i <= 100; i++) {
			List<Long> tempPalindromeChain=new ArrayList<>();
			
			long tempNum = i;
			long tempStepSize = 0;
			long reverseNum = reverseNumber(tempNum);
			long tempSum=tempNum+reverseNum;	
			tempPalindromeChain.add(tempNum);
			
			
			
			if(reverseNumber(tempSum)==tempSum && tempPalindromeChain.size()>=palindromeChain.size())
			{
				tempStepSize++;
				tempPalindromeChain.add(tempSum);				
			}
			while(reverseNumber(tempSum)!=tempSum)
			{
				//System.out.println("Not palindrome number, continuing process..."+tempSum);
				
				tempStepSize++;				
				tempSum=tempNum+reverseNum;
				tempNum=tempSum;
				reverseNum=reverseNumber(tempNum);
				tempPalindromeChain.add(tempSum);
				
			}			
			if(tempPalindromeChain.size()>palindromeChain.size())
			{
				palindromeChain = tempPalindromeChain;
				stepSize=tempStepSize;
			}	
			
			/*System.out.println("tempSum: "+tempSum);
			System.out.println("stepSize: "+stepSize);
			System.out.println("Palindrome Chain: "+tempPalindromeChain);*/
		}
		if(palindromeChain.size()>0) {
		System.out.println("Found number for longest chain: "+palindromeChain.get(0));
		System.out.println("Chain: "+palindromeChain);
		System.out.println("Step Size: "+stepSize);
		}
		else {
			System.out.println("No valid chain for the interval!");
		}

	}
	public static long reverseNumber(long number)
	{
		long reverseNum=0;
		long lastDigit;
		while (number > 0) {
			reverseNum *= 10;
			lastDigit = number % 10;
			reverseNum += lastDigit;				
			number /= 10;
		}
		return reverseNum;
	}
}
