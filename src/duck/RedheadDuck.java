package duck;

import fly.FlyWithRocket;
import quack.Squeak;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithRocket();

	}

	public void display(){
		System.out.println("我是一只火箭红头鸭");
	}
}
