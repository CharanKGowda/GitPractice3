package com.test.practice;

import java.util.Scanner;

public class arrayadd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		System.out.println("Enter the elements of array");
		a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		add(a);
		}
	static void add(int a[]) 
	{
       int sum=0;
	
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
	
		System.out.println("The sum is "+sum);
	}
}