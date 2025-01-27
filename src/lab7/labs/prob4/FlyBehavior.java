package lab7.labs.prob4;

public interface FlyBehavior {
    default void fly() {
        System.out.println("Flying with wings");
    };
}
