package com.test.practice;

import java.util.Scanner;

public class Additionex {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers");
		x=s.nextInt();
		y=s.nextInt();
		add(x,y);
		}

static void add(int a,int b) 
{
	System.out.println("The sum is "+(a+b));
	System.out.println();
}
}