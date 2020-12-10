package AllPgms;

import java.util.Scanner;

/*
 * Purpose- Write three functions that compute the sum of the numbers in a list: 
 *          using a for-loop, a while-loop and recursion
 * 
 * Author:Shubham Sathe
 * Version:12.0
 * since 10th Dec 2020
 */
public class NumberSum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many number you want to sum");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		SumMethods.for_function(arr);
		SumMethods.while_loop(arr);
		int sum=SumMethods.sum(arr,0,n);
		System.out.println("sum using recursion is"+sum);
			
	}
}
class SumMethods
{
	static void for_function(int arr1[])
	{
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum=sum+arr1[i];
		}
		System.out.println("sum of the numbers using for loop is "+sum);
	}
	
	static void while_loop(int arr1[])
	{
		int sum=0;
		int i=0;
		while(i<arr1.length)
		{
			sum=sum+arr1[i];
			i++;
		}
		System.out.println("sum of the numbers using while loop is "+sum);
	}
	
	static int sum(int arr[], int start, int len) 
	{
	    /* Recursion base condition */
	    if(start >= len)
	    {
	        return 0;
	    }
	    else
	    {
	    return (arr[start] + sum(arr, start + 1, len));
	    }
	}
}
