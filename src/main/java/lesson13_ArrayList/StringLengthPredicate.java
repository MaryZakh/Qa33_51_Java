package lesson13_ArrayList;

import java.util.function.Predicate;

public class StringLengthPredicate implements Predicate<String> {
    @Override
    public boolean test(String str) {
        return str.length() > 5;
    }
}
