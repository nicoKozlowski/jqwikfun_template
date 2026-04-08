package currying;

public interface Function<T, U> {
  U apply(T arg);

  Function<Integer, Integer> triple = new Function<>() {
    @Override
    public Integer apply(Integer arg) {
      return arg * 3;
    }
  };

  Function<Integer, Integer> square = new Function<>() {
    @Override
    public Integer apply(Integer arg) {
      return arg * arg;
    }
  };

  static Function<Integer, Integer> compose1(Function<Integer, Integer> f1, Function<Integer,Integer> f2) {
    return new Function<>() {
      @Override
      public Integer apply(Integer arg) {
        return f1.apply(f2.apply(arg));
      }
    };
  }
}


