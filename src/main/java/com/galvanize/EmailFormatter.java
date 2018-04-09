package com.galvanize;

public class EmailFormatter {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("Please specify a name and email");
            System.exit(1);
        }

        if(args.length == 1) {
            System.out.println(String.format("Please specify an email for %s", args[0]));
            System.exit(1);
        }

        String name = args[0];
        String email = args[1];

        System.out.println(name + " <" + email + ">");

    }
}
