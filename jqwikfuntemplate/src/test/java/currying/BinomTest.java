package currying;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import static currying.Functions.binom;


public class BinomTest {
    @Example
    boolean binom_example() {
        return binom.apply(3, 2) == 3;
    }

    @Data
    Iterable<Tuple.Tuple3<Integer, Integer, Integer>> data() {
        return Table.of(
                Tuple.of(4, 3, 4),
                Tuple.of(2, 1, 2),
                Tuple.of(6, 2, 15),
                Tuple.of(1, 1, 1)
        );
    }


    @Property
    @FromData("data")
    boolean data_binom(@ForAll int n, @ForAll int k, @ForAll int expected) {
        return binom.apply(n, k) == expected;
    }

    @Property
    boolean prop_binom1(@ForAll @IntRange(max = 100) int n) {
        return binom.apply(n, 0) == 1;
    }

    @Property
    boolean prop_binom2(@ForAll @IntRange(max = 100) int n) {
        return binom.apply(n, n) == 1;
    }

    @Property
    boolean prop_binom3(@ForAll @IntRange(max = 100) int n) {
        return binom.apply(n, 1) == n;
    }

    @Property
    boolean prop_binom4(@ForAll @IntRange(max = 20) int n,
                        @ForAll @IntRange(max = 20) int k) {
        Assume.that(n >= k);
        return binom.apply(n, k).equals(binom.apply(n, n - k));
    }

    @Property
    boolean prop_binom5(@ForAll @IntRange(max = 20) int n,
                        @ForAll @IntRange(min = 1, max = 20) int k) {
        return binom.apply(n, k) * k == binom.apply(n - 1, k - 1) * n;
    }

    @Property
    boolean prop_binom6(@ForAll @IntRange(max = 20) int n,
                        @ForAll @IntRange(max = 20) int k,
                        @ForAll @IntRange(max = 20) int h) {
        return binom.apply(n, h) * binom.apply(n - h, k)
                == binom.apply(n, k) * binom.apply(n - k, h);
    }
}
