package currying;


public class Operators {

    static Function<Integer, Function<Integer, Integer>> max() {
        return a -> b -> a > b ? a : b;
    }

    static Function<Boolean, Boolean> not() {
        return x -> !x;
    }

    static Function<Boolean, Function<Boolean, Boolean>> and() {
        return x -> y -> x && y;
    }

    static Function<Boolean, Function<Boolean, Boolean>> or() {
        return x -> y -> x || y;
    }

    static Function<Boolean, Function<Boolean, Boolean>> nand() {
        return x -> y -> !(x && y);
    }

    static Function<Boolean, Function<Boolean, Boolean>> nor() {
        return x -> y -> !(x || y);
    }
}
