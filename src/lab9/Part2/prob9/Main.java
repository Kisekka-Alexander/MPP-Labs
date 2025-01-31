package lab9.Part2.prob9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void printSquares(int num) {
        IntStream.iterate(1, n -> n + 1)
                .limit(num)
                .forEach(n -> System.out.println(n * n));
    }

    public static void main(String[] args) {
        printSquares(6);
    }
}
