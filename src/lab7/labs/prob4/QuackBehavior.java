package lab7.labs.prob4;

public interface QuackBehavior {
    default void quack() {
        System.out.println("Quacking");
    };
}
