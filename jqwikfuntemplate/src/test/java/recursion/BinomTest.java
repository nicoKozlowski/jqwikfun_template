//package recursion;
//
//import net.jqwik.api.*;
//import net.jqwik.api.constraints.IntRange;
//import static recursion.Methods.binom;
//
//public class BinomTest {
//    @Example
//    boolean binom_example() {
//        return binom(3,2) == 3;
//    }
//
//    @Data
//    Iterable<Tuple.Tuple3<Integer, Integer, Integer>> data() {
//        return Table.of(
//                Tuple.of(4, 3, 4),
//                Tuple.of(2, 1, 2),
//                Tuple.of(6, 2, 15),
//                Tuple.of(1, 1, 1)
//        );
//    }
//
//
//    @Property
//    @FromData("data")
//    boolean data_binom(@ForAll int n, @ForAll int k, @ForAll int expected) {
//        return binom(n, k) == expected;
//    }
//
//    @Property
//    boolean prop_binom1(@ForAll @IntRange(min = 0, max = 100) int n) {
//        return binom(n, 0) == 1;
//    }
//
//    @Property
//    boolean prop_binom2(@ForAll @IntRange(min = 0, max = 100) int n) {
//        return binom(n, n) == 1;
//    }
//
//    @Property
//    boolean prop_binom3(@ForAll @IntRange(min = 0, max = 100) int n) {
//        return binom(n, 1) == n;
//    }
//
//    @Property
//    boolean prop_binom4(@ForAll @IntRange(min = 0, max = 20) int n,
//                        @ForAll @IntRange(min = 0, max = 20) int k) {
//        Assume.that(n >= k);
//        return binom(n, k) == binom(n, n - k);
//    }
//
//    @Property
//    boolean prop_binom5(@ForAll @IntRange(min = 0, max = 20) int n,
//                        @ForAll @IntRange(min = 1, max = 20) int k) {
//        return binom(n, k) * k == binom(n - 1, k - 1) * n;
//    }
//
//    @Property
//    boolean prop_binom6(@ForAll @IntRange(min = 0, max = 20) int n,
//                        @ForAll @IntRange(min = 0, max = 20) int k,
//                        @ForAll @IntRange(min = 0, max = 20) int h) {
//        return binom(n, h) * binom(n - h, k)
//            == binom(n, k) * binom(n - k, h);
//    }
//}

package recursion;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;

import static recursion.Methods.binom;

public class BinomTest {

    @Example
    boolean example_binom() {
        return binom(5, 2) == 10;
    }

    @Data
    Iterable<Tuple.Tuple3<Integer, Integer, Integer>> data_b() {
        return Table.of(
                Tuple.of(0, 0, 1),
                Tuple.of(5, 0, 1),
                Tuple.of(5, 1, 5),
                Tuple.of(5, 2, 10),
                Tuple.of(5, 5, 1)
        );
    }

    @Property
    @FromData("data_b")
    boolean data_binom(@ForAll int n,@ForAll int k,@ForAll int result) {
        return binom(n, k) == result;
    }

    @Property
    boolean prop_binom1(@ForAll @IntRange(min = 0, max = 10) int n) {
        return binom(n, 0) == 1;
    }
    @Property
    boolean prop_binom2(@ForAll @IntRange(min = 0, max = 10) int n) {
        return binom(n, n) == 1;
    }
    @Property
    boolean prop_binom3(@ForAll @IntRange(min = 1, max = 10) int n) {
        return binom(n, 1) == n;
    }
    @Property
    boolean prop_binom4(@ForAll @IntRange(min = 0, max = 10) int n,
                        @ForAll @IntRange(min = 0, max = 10) int k
    ) {
        Assume.that(n >= k);
        return binom(n, k) == binom(n, n - k );
    }
    @Property
    boolean prop_binom5(@ForAll @IntRange(min = 1, max = 10) int n,
                        @ForAll @IntRange(min = 1, max = 10) int k) {
        Assume.that(k <= n);
        return binom(n, k) == (n * binom(n - 1, k - 1)) / k;
    }
    @Property
    boolean prop_binom6(@ForAll @IntRange(min = 0, max = 10) int n,
                        @ForAll @IntRange(min = 0, max = 10) int h,
                        @ForAll @IntRange(min = 0, max = 10) int k
    ) {
        Assume.that(n >= h);
        Assume.that(n - h >= k);

        int left = binom(n, h) * binom(n - h, k);
        int right = binom(n, k) * binom(n - k, h);

        return left == right;
    }


}