package currying;

public interface Function<T, U> {
  U apply(T arg);

  static Function<Integer, Integer> compose1(Function<Integer, Integer> f1,
                                             Function<Integer,Integer> f2) {
    return new Function<>() {
      @Override
      public Integer apply(Integer arg) {
        return f1.apply(f2.apply(arg));
      }
    };
  }

  static Function<Integer, Integer> compose2(Function<Integer, Integer> f1,
                                             Function<Integer,Integer> f2) {
    return arg -> f1.apply(f2.apply(arg));
    }

  static <T, U, V> Function<T, V> compose(Function<U, V> f1, Function<T, U> f2) {
    return arg -> f1.apply(f2.apply(arg));
  }

  Function<Integer, Function<Integer, Integer>> add
          = x -> y -> x + y;

  static <T, U, V> Function<U, Function<T, V>> flip(Function<T, Function<U, V>> f) {
    return u -> t -> f.apply(t).apply(u);
  }

  static <T> Function<T, T> id() {
    return t -> t;
  }

  static Function<Boolean, Boolean> not() {
    return x -> !x;
  }
}



