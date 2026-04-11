package currying;

public interface Function<T, U> {
  U apply(T arg);
}
