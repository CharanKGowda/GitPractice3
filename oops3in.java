package com.test.practice;

import java.util.Scanner;

class Animal{//Parent class
	String color="Black";
	
	public void eating() {
		System.out.println("Animal is eating");
	}
	
}
class dog extends Animal{
	public void abc() {
		System.out.println("The dog is the animal");
		System.out.println("The color of dog is"+color);
	}
}
public class oops3in {
	public static void main(String[] args) {
		
		dog d1=new dog();
		d1.eating();
		d1.abc();
}
}
