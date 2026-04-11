package recursion;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;

import static recursion.Methods.add;

class AddTest {

  @Property
  boolean testAdd(@ForAll int a, @ForAll @IntRange(min=1,max=10) int b) {
    return add(a,b) == a+b;
  }
}