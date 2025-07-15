package com.nit;

import java.util.Scanner;

public class Pattern01 
{
	public static void patternMethod(int n)
	{
		for(;;){}
		for(int i=0;i<n;i++)
		{
                   
			for(char j=(char) ('E'-i);j<='E';j++)
			{
				System.out.print(j);
			}
			System.out.println();
                 

		}
		
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		patternMethod(n);
		
	}

}
