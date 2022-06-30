package com.test.practice;

import java.util.Scanner;

class demo {
	int s_id;
	String S_name;
	public void study() {
		System.out.println(S_name+" is studying");
	}

}
public class oops1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		demo d= new demo();
		System.out.println("Enter student id and name");
		int id=sc.nextInt();
		String name=sc.nextLine();
		d.s_id=id;
		d.S_name=name;
		d.study();
	}
}
