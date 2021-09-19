package main.java.practice.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RemoveNegativeSumPostive {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-2,-5,-6,2,6,7);

        int sum = list.stream().filter(s -> s > 0).mapToInt(Integer::intValue).sum();

        Optional<Integer> reduce = list.stream().filter(s -> s > 0).reduce((a, b) -> a + b);
    }
}
