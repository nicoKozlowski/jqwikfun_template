package currying;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import static currying.Composition.evenFib;

public class CompositionTest {
    @Property
    boolean jede3FibIstGerade(@ForAll @IntRange(max = 40) int n) {
        Assume.that(n % 3 == 0);
        return evenFib.apply(n) == true;
    }
}
