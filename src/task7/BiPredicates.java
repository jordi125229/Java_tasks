package task7;

import java.util.function.BiPredicate;

public class BiPredicates {
    BiPredicate<String, String> sameIgnoreCase = (firstString, secondString) ->
            firstString.equalsIgnoreCase(secondString) ? true : false;

    BiPredicate<String, String> isSuffix = (firstString, secondString) ->
            firstString.endsWith(secondString) ? true : false;
}