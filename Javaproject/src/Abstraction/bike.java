package Abstraction;

public abstract class bike //abstarct class
{
	bike()
	{
		System.out.println("this is constructor");
	}
	
	abstract void run(); //abstract method or partial method or incomplete method
	
	void start() //complete method or conctrete method
	{
		System.out.println("bike is started");
	}
	
	void stop() //
	{
		System.out.println("bike is stopped");
	}
	
}

