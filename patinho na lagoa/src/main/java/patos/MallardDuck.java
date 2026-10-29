package patos;

import quacks.Quack;
import voos.FlyWithWings;

public class MallardDuck extends Duck {
    
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
