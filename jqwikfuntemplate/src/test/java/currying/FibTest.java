package currying;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import static currying.Functions.fib;
import static currying.Functions.ggT;


public class FibTest {
    @Example
    boolean example_fib() {
        return fib.apply(7) == 13;
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
        return fib.apply(n) == expected;
    }

    @Property
    boolean prop_fib1(@ForAll @IntRange(min = 1, max = 20) int m,
                      @ForAll @IntRange(max = 20) int n) {
        Assume.that( m > 0);
        return fib.apply(m + n)
                == fib.apply(n + 1) * fib.apply(m) + fib.apply(n) * fib.apply(m - 1);
    }

    @Property
    boolean prop_fib2(@ForAll @IntRange(min = 1, max = 20) int m,
                      @ForAll @IntRange(min = 1, max = 20) int n) {
        Assume.that( m > 0 && n > 0);
        return ggT.apply(fib.apply(m)).apply(fib.apply(n)).equals(fib.apply(ggT.apply(m).apply(n)));
    }

    @Property
    boolean prop_fib3(@ForAll @IntRange(min = 1, max = 20) int n) {
        Assume.that( n > 0);
        return ggT.apply(fib.apply(n)).apply(fib.apply(n + 1)) == 1;
    }

    public int fibSum(int n) {
        return n == 0 ? fib.apply(0) : fib.apply(n) + fibSum(n - 1);
    }

    @Property
    boolean prop_fib4(@ForAll @IntRange(max = 20) int n) {
        return fibSum(n) == fib.apply(n + 2) - 1;
    }
}
