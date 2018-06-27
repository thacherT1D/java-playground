package com.galvanize;

import java.util.Arrays;
import java.util.List;

public class Application {


    public static void main(String[] args) {

        Accumulator acc = new Accumulator();
        List<String> input = Arrays.asList("Alice", "Bob");
        System.out.println(acc.aliceAndBob(input));
    }

}
