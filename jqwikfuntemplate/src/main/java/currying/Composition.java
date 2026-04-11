package currying;
import static currying.Functions.fib;
import static currying.Operators.odd;
import static currying.Operators.not;

public class Composition {

    public static final Function<Integer, Boolean> even
        = n -> not().apply(odd().apply(n));

    public static final Function<Integer, Boolean> evenFib
        = n -> even.apply(fib.apply(n));
}
