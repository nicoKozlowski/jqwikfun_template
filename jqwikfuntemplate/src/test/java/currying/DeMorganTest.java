package currying;
import net.jqwik.api.*;
import static currying.Operators.*;

public class DeMorganTest {
  @Property
  boolean prop_deMorgan(@ForAll boolean a, @ForAll boolean b) {
    return not().apply(and().apply(a).apply(b))
            == or().apply(not().apply(a)).apply(not().apply(b))
            == not().apply(or().apply(a).apply(b))
            == and().apply(not().apply(a)).apply(not().apply(b));
  }
}
