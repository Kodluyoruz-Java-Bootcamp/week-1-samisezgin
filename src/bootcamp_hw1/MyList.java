package bootcamp_hw1;

import java.util.Arrays;

public class MyList
{
	String[] myStringList;
	private int currentIndex;

	private static final int DEFAULT_SIZE = 5;

	public MyList()
	{
		myStringList = new String[DEFAULT_SIZE];
		currentIndex = 0;
	}

	private void extendList()
	{
		int currentSize = myStringList.length;
		String[] newStringList = new String[currentSize + 7];
		System.arraycopy(myStringList, 0, newStringList, 0, currentSize);
		myStringList = newStringList;
	}

	public void add(String s)
	{
		if (currentIndex >= myStringList.length - 1)
		{
			System.out.println("extending");
			extendList();
		}
		if (s.trim().length() > 0)
		{

			if (s.toLowerCase().charAt(0) == 'c')
			{
				myStringList[currentIndex] = s;
				currentIndex++;
			} else
			{
				System.out.println("Eklenmek istenen string 'c' karakteri ile baslamamaktadir");
			}
		} else
		{
			System.out.println("Bos string eklenemez!");
		}

	}

	public void print()
	{
		System.out.println(Arrays.toString(myStringList));
	}

	public int getCurrentIndex()
	{
		return currentIndex;
	}

	public int getListLength()
	{
		return myStringList.length;
	}

	public static void main(String[] args)
	{
		MyList samiList = new MyList();
		for (int i = 0; i < 21; i++)
		{
			System.out.println("\nBefore adding elements: ");
			System.out.println("------------------------");
			System.out.println(samiList.getCurrentIndex());
			System.out.println(samiList.getListLength());
			samiList.add("Sami");
			samiList.add("Cem");
			samiList.add("cem");
			System.out.println("After adding elements: ");
			System.out.println("------------------------");
			System.out.println(samiList.getCurrentIndex());
			System.out.println(samiList.getListLength());
		}
		samiList.print();

	}
}
