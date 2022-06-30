package com.test.practice;
abstract  class MyClass{
	public void call() {
		System.out.println("something");
	}
	abstract public void launch();
}
class child extends MyClass{
	public void launch() {
		System.out.println("Something Again");
	}
}

public class oops4ab {
public static void main(String args[]) {
	MyClass ob=new child();
	ob.call();
	ob.launch();
}
}
