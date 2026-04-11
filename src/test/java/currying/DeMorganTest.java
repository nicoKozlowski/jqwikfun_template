package currying;

import net.jqwik.api.*;

public class DeMorganTest {
  @Property
  boolean test(@ForAll boolean a, @ForAll boolean b) {
    return false;
  }
}
