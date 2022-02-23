package currying;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;

import static currying.Examples.fact0;

class ExamplesTest {

  @Data
  Iterable<Tuple.Tuple2<Integer,Integer>> facts(){
    return Table.of(
            Tuple.of(0,1),
            Tuple.of(1,1)
    );
  }

  @Property
  @FromData("facts")
  boolean testFact0(@ForAll int n, @ForAll int result) {
    return fact0.apply(n) == result;
  }

}