package currying;
import static currying.Function.compose;
import static currying.Functions.fib;
import static currying.Operators.odd;
import static currying.Operators.not;

public class Composition {

    public static final Function<Integer, Boolean> even
        = compose(not(), odd());

    public static final Function<Integer, Boolean> evenFib
        = compose(even, fib);
}
