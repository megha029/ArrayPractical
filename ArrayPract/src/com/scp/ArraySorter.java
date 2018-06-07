package com.scp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySorter {

	public static void main(String[] args) {

		int[] a = { 60, 2, 3, 6, 9, 30, 101 };
		int sum=0;
		int n=50;
		int b[]=new int[a.length];
	
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		for(int i=0;i<a.length;i++)
		{
			if(sum<n)
			{
				b[i]=a[i];
				sum=sum+b[i];
				
			}
			System.out.println(b[i]);
		}
			}
		
		
}
	
	
