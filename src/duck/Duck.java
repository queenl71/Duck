package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
     //动态设置飞行行为
		public void setQuackBehavior(QuackBehavior qb) {
			quackBehavior = qb;
		}
		public void setFlyBehavior (FlyBehavior fb) {
			flyBehavior = fb;
		}
	public void performQuack() {
		quackBehavior.quack();
	}
	//将飞行行为委托给飞行行为类处理
	public void performFly() {
		flyBehavior.fly();
	}
	//所有鸭子都会游泳
	public void swim() {
System.out.println("我会游泳");
	}
	public void display() {
		System.out.println("我是鸭子");
	}
  

}
