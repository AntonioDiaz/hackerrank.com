package challenges.java.objectoriendedprogramming.interface_01;

import java.util.stream.IntStream;

public class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        return IntStream.rangeClosed(1, n).filter(i-> n%i==0).sum();
    }
}
