package javaprograming;

import org.testng.annotations.Test;

public class Arrayasort2 {
	@Test
	public void sortTest()
	{
		int[] arr= {1,0,1,0,0,1,4,1,5,0,0};
		int[] temp=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				temp[m]=arr[i];
				m++;
			}
			else 
			{
				temp[n]=arr[i];
n--;
				}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]);
		
	}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(temp[i]);
		}
}
}
