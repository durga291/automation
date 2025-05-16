package Abstraction;

	 interface AnimalEat //by default all methods abstract     //parent
	 					//public accessiblity
	 {
		 void eat();
	 }
	 interface AnimalTravell    //parent
	 {
		 void travell();
	 }
	 
	 class Animal implements AnimalEat,AnimalTravell      //Animal is child //multiple inheritance
	 {
		 public void eat()   //acceesiblity level of public is default
		 {
			 System.out.println("animal is eating");
		 }
		 public void travell()
		 {
			 System.out.println("animal is travelling");
		 }
	 }

public class usinginterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal an = new Animal();
		an.eat();
		an.travell();

	}

}
