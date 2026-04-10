package currying;

import net.jqwik.api.*;
import static currying.Functions.fact;


public class FactTest {
  @Example
  boolean example_fact() {
    return fact.apply(5) == 120;
  }

  @Data
  Iterable<Tuple.Tuple2<Integer, Integer>> data() {
    return Table.of(
            Tuple.of(4, 24),
            Tuple.of(10, 3628800),
            Tuple.of(6, 720),
            Tuple.of(2, 2)
    );
  }


  @Property
  @FromData("data")
  boolean data_fact(@ForAll int input, @ForAll int expected) {
    return fact.apply(input) == expected;
  }
}
