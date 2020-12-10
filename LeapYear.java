package AllPgms;
/*
 * Purpose- program to prints the next 20 leap years.
 * 
 * Author:Shubham Sathe
 * Version:12.0
 * since 10th Dec 2020
 */
import java.util.*;

public class LeapYear {
	public static void main(String[] args)
	{
		System.out.println("upcoming leap years are:");
		for(int i=2021;i<=2041;i++)
		{
			if(i%4==0)
			{
				if(i%100==0)
				{
					if(i%400==0)
					{
						System.out.println(i);
					}
				}
				else
				{
					System.out.println(i);
				}
			}			
		}	
	}

}
