package com.galvanize;

public class Math {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Needs 2 arguments");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a + b);
    }
}
