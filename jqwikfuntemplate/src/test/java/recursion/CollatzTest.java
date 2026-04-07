package recursion;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;

import static recursion.Methods.collatz;

public class CollatzTest {

  @Property
  boolean conjecture(@ForAll @IntRange(min=1,max=10) int n) {
    return collatz(n) == 1;
  }

}
