package test;

import duck.Duck;
import duck.MallardDuck;
import duck.RedheadDuck;
import duck.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		/** 
		 * 测试类 
		 */ 
		Duck Mallard = new MallardDuck();
		Mallard.display();
		Mallard.swim();
		Mallard.performFly();
		Mallard.performQuack();
		System.out.println("----------");
		
		Duck Redhead = new RedheadDuck();
	    Redhead.display();
		Redhead.swim();
		Redhead.performFly();
		Redhead.performQuack();
		System.out.println("----------");
		
		Duck Rubber = new RubberDuck();
		Rubber.display();
		Rubber.swim();
		Rubber.performFly();
		Rubber.performQuack();

	}

}
