package currying;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import static currying.Functions.ggT;


public class GgtTest {
    @Example
    boolean example_ggT() {
        return ggT.apply(24).apply(76) == 4;
    }

    @Data
    Iterable<Tuple.Tuple3<Integer, Integer, Integer>> data() {
        return Table.of(
                Tuple.of(27, 9, 9),
                Tuple.of(186, 96, 6),
                Tuple.of(38, 19, 19),
                Tuple.of(56, 23, 1)
        );
    }


    @Property
    @FromData("data")
    boolean data_ggT(@ForAll int a, @ForAll int b, @ForAll int expected) {
        return ggT.apply(a).apply(b) == expected ;
    }

    @Property
    boolean idempotenzGesetz(@ForAll @IntRange(max = 100) int a) {
        return ggT.apply(a).apply(a) == a;
    }

    @Property
    boolean neutralesElement(@ForAll @IntRange(max = 100) int a) {
        return ggT.apply(a).apply(0) == a;
    }

    @Property
    boolean absorbierendesElement(@ForAll @IntRange(max = 100) int a) {
        return ggT.apply(a).apply(1) == 1;
    }

    @Property
    boolean kommutativGesetz(@ForAll @IntRange(max = 100) int a,
                             @ForAll @IntRange(max = 100) int b) {
        return ggT.apply(a).apply(b).equals(ggT.apply(b).apply(a));
    }

    @Property
    boolean assoziativGesetz(@ForAll @IntRange(max = 100) int a,
                             @ForAll @IntRange(max = 100) int b,
                             @ForAll @IntRange(max = 100) int c) {
        return ggT.apply(a).apply(ggT.apply(b).apply(c)).equals(ggT.apply(ggT.apply(a).apply(b)).apply(c));
    }

    @Property
    boolean distributivGesetz(@ForAll @IntRange(max = 100) int a,
                              @ForAll @IntRange(max = 100) int b,
                              @ForAll @IntRange(max = 100) int m) {
        Assume.that(m >= 0);
        return ggT.apply(m * a).apply(m * b) == m * ggT.apply(a).apply(b);
    }

    @Property
    boolean prop_ggT7(@ForAll @IntRange(max = 100) int a,
                      @ForAll @IntRange(max = 100) int b) {
        Assume.that(a > b);
        return ggT.apply(a).apply(b).equals(ggT.apply(a - b).apply(b));
    }

    @Property
    boolean prop_ggT8(@ForAll @IntRange(max = 100) int a,
                      @ForAll @IntRange(max = 100) int b) {
        Assume.that(a < b);
        return ggT.apply(a).apply(b).equals(ggT.apply(a).apply(b - a));
    }
}
