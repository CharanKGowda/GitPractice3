package com.test.practice;

import java.util.Scanner;

interface shape{
	void calculate(int r);
}
class circle implements shape{
	public void calculate(int r) {
		System.out.println("The area is"+(Math.PI*r*r));
	}
}

public class oops5int{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
			shape s1=new circle();
			System.out.println("enter the radius");
			int r=sc.nextInt();
			s1.calculate(r);
		}
	}

