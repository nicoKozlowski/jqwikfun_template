package currying;

import java.util.function.BiFunction;

public class Functions {

    public static final Function<Integer, Integer> fact
            = n -> n == 0 ? 1 : n * Functions.fact.apply(n - 1);

    public static final Function<Integer, Function<Integer, Integer>> binom
           = n -> k -> (k == 0 || k.equals(n))
            ? 1 : k < 0 || k > n
                  ? 0 : Functions.binom.apply(n - 1).apply(k - 1)
                        + Functions.binom.apply(n - 1).apply(k);

    public static final Function<Integer, Integer> fib
            = n -> n == 0
            ? 0 : n == 1
            ? 1 : Functions.fib.apply(n - 1) + Functions.fib.apply(n - 2);

    public static final Function<Integer, Function<Integer, Integer>> ggT
            = a -> b -> b == 0
            ? a : Functions.ggT.apply(b).apply(a % b);
}

