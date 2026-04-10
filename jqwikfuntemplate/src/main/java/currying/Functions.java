package currying;

import java.util.function.BiFunction;

public class Functions {

    Function<Integer, Integer> fact = new Function<>() {
        @Override
        public Integer apply(Integer n) {
            return n == 0 ? 1 : n * this.apply(n - 1);
        }
    };

    BiFunction<Integer, Integer, Integer> binom = new BiFunction<>() {
        @Override
        public Integer apply(Integer n, Integer k) {
            return k == 0 || k.equals(n)
                    ? 1 : k < 0 || k > n
                          ? 0 : this.apply(n - 1, k - 1) + this.apply(n - 1, k);
        }
    };

    Function<Integer, Integer> fib = new Function<>() {
        @Override
        public Integer apply(Integer n) {
            return n == 0 ? 0 : n == 1 ? 1 : this.apply(n - 1) + this.apply(n - 2);
        }
    };

    BiFunction<Integer, Integer, Integer> ggT = new BiFunction<>() {
        @Override
        public Integer apply(Integer a, Integer b) {
            return b == 0 ? a : this.apply(b, a % b);
        }
    };
}

