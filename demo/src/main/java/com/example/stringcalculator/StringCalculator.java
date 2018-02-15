package com.example.stringcalculator;

import java.util.Arrays;

public class StringCalculator {

    public int addNumbers(String s) {
        if( s.contains(",\n")) {
            throw new IllegalStateException("Input cannot contain ',\n'");
        }
        if( s.isEmpty() ) {
            return 0;
        }
        s = s.replace("\n", ",");
        return Arrays.stream(s.split(",")) //
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
