package AllPgms;

import java.util.ArrayList;

/*
 * Purpose- Write a function that concatenates two lists.
 *        [a,b,c], [1,2,3] → [a,b,c,1,2,3]
 * 
 * Author:Shubham Sathe
 * Version:12.0
 * since 10th Dec 2020
 */
public class ListConcat {
	public static void main(String[] args) {
		
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		System.out.println("list 1 is "+a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		System.out.println("list 2 is "+a2);
	 
		
		ArrayList a3=new ArrayList();
		a3.addAll(a1);
		a3.addAll(a2);
		System.out.println("concatenate list is"+a3);
		
	}

}
