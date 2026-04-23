package currying;
import net.jqwik.api.*;
import static currying.Operators.*;

public class DeMorganTest {
  @Property
  boolean prop_deMorgan(@ForAll boolean a, @ForAll boolean b) {
    boolean gesetz1 = nand().apply(a).apply(b)
            == or().apply(not().apply(a)).apply(not().apply(b));
    boolean gesetz2 = nor().apply(a).apply(b)
            == and().apply(not().apply(a)).apply(not().apply(b));
    return gesetz1 && gesetz2;
  }
}
