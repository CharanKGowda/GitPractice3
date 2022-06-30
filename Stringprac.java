package com.test.practice;

import java.util.Scanner;

public class Stringprac {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1= s.nextLine();
		findlength(s1);
		}
 static void findlength(String a) {
	 System.out.println("The length of the string is"+a.length());
 }
}