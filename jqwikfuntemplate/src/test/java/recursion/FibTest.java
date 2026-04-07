package recursion;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import static recursion.Methods.fib;
import static recursion.Methods.ggT;


public class FibTest {
    @Example
    boolean example_fib() {
        return fib(7) == 13;
    }

    @Data
    Iterable<Tuple.Tuple2<Integer, Integer>> data() {
        return Table.of(
                Tuple.of(1, 1),
                Tuple.of(17, 1597),
                Tuple.of(5, 5),
                Tuple.of(3, 2)
        );
    }


    @Property
    @FromData("data")
    boolean data_fib(@ForAll int n, @ForAll int expected) {
        return fib(n) == expected;
    }

    @Property
    boolean prop_fib1(@ForAll @IntRange(min = 1, max = 20) int m,
                      @ForAll @IntRange(max = 20) int n) {
        Assume.that( m > 0);
        return fib(m + n) == fib(n + 1) * fib(m) + fib(n) * fib(m - 1);
    }

    @Property
    boolean prop_fib2(@ForAll @IntRange(min = 1, max = 20) int m,
                      @ForAll @IntRange(min = 1, max = 20) int n) {
        Assume.that( m > 0 && n > 0);
        return ggT(fib(m), fib(n)) == fib(ggT(m, n));
    }

    @Property
    boolean prop_fib3(@ForAll @IntRange(min = 1, max = 20) int n) {
        Assume.that( n > 0);
        return ggT(fib(n), fib(n + 1)) == 1;
    }

    public int fibSum(int n) {
        return n == 0 ? fib(0) : fib(n) + fibSum(n - 1);
    }
    @Property
    boolean prop_fib4(@ForAll @IntRange(max = 20) int n) {
        return fibSum(n) == fib(n + 2) - 1;
    }

}

