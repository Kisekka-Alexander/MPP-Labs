package lab9.Part2.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static Optional<MySingletonLazy> instance = Optional.ofNullable(null);

    private MySingletonLazy() {}

    public static MySingletonLazy getInstance() {
        instance = Optional.ofNullable(instance.orElseGet(MySingletonLazy::new));
        return instance.get();
    }

    public static void main(String[] args) {
        MySingletonLazy singleton1 = MySingletonLazy.getInstance();
        MySingletonLazy singleton2 = MySingletonLazy.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}

