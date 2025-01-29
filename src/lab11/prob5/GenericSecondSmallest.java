package lab11.prob5;


import java.util.*;

public class GenericSecondSmallest {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> elements) {
        Collections.sort(elements);
        return elements.get(1);
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(24,15,23,13,20,2);
        System.out.println(secondSmallest(ints));

        List<String> strings = Arrays.asList("l", "m", "k", "a", "e", "h", "g", "j");
        System.out.println(secondSmallest(strings));

    }
}