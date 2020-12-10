/* Write a program , to take a user input n then 
 * 1)find the sum of the range 1 to n
 * 2)store the 1 to n numbers into array
 * by passing this array simply
 *  (1)find the how many elements in the given array are even  also find their sum 
 *  (2)find the how many elements in the given array are odd  also find their sum
 *  (3)find the how many elements in the given array are prime  also find their sum  
 */

package AllPgms;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=i;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of 1 to "+n+" is "+sum);
		
		VariousFunctions f=new VariousFunctions();
		f.even_sum(arr);
		f.odd_sum(arr);
		f.prime(arr);
	 }

}

class VariousFunctions
{
	ArrayList a=new ArrayList();
	void even_sum(int[] arr1)
	{
		int evensum=0;
		for(int i=1;i<=arr1.length;i++)
		{
			if(i%2==0)
			{
	           a.add(i);
				evensum=evensum+i;
			}	
		}	
		System.out.println("array with even number is");
		System.out.println(a);
		System.out.println("sum of even number is"+evensum);
	}
	
	ArrayList b=new ArrayList();
	 void odd_sum(int[] arr)
	{
		int oddsum=0;
		for(int i=1;i<=arr.length;i++)
		{
			if(i%2==1)
			{
				b.add(i);
				oddsum=oddsum+i;
			}
			
		}
		System.out.println("array with odd number is");
		System.out.println(b);	
		System.out.println("sum of odd number is"+oddsum);
	}
	
	 ArrayList c=new ArrayList();
	 void prime(int[] arr1)
	{
		 int primesum=0;
	    int count=0; 
		for(int i=2;i<=arr1.length;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}		
		       if(count==2)
		       {
		        primesum=primesum+i;
			    c.add(i);
		       }
		       count=0;
		  
		 }
		   System.out.println("prime number are");
		   System.out.println(c);
		   System.out.println("prime number sum is"+primesum);
		
     }
}

/*output:
  enter the value of n
10
sum of 1 to 10 is 45
array with even number is
[2, 4, 6, 8, 10]
sum of even number is30
array with odd number is
[1, 3, 5, 7, 9]
sum of odd number is25
prime number are
[2, 3, 5, 7]
prime number sum is17

 */
  
