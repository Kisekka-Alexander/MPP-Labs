package lab7.labs.prob4;

public abstract class Duck implements FlyBehavior, QuackBehavior {

    public void swim() {
        System.out.println("swimming");
    }

    public abstract void display();
}
