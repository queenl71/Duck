package duck;

import fly.FlyNoWay;
import quack.MuteQuack;

public class RubberDuck extends Duck{

	public RubberDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	
	}
	public void display(){
		System.out.println("我是一个塑料鸭");			
	}	
	
}
