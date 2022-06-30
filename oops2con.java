package com.test.practice;

import java.util.Scanner;

class demo1 {
	int s_id;
	String S_name;
	public demo1() {
		System.out.println(S_name+" is studying");
	}
	public demo1(int x) {
		System.out.println(Math.pow(x,2)+"is the square of" +x);
	}
	

}
public class oops2con{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		demo1 d= new demo1();
		System.out.println("Enter student id and name");
		int id=sc.nextInt();
		String name=sc.nextLine();
		d.s_id=id;
		d.S_name=name;
		
		System.out.println("Enter the number");
		int x=sc.nextInt();
		demo1 d1=new demo1(x);
	}
}