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
}



