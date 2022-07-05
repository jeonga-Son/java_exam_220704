package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        boolean isMinus = s.indexOf(" - ") != -1;

        if (isMinus) {
           return runMinus(s);
        }

       return runPlus(s);
    }

    private static int runPlus(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split(" \\- ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }
}

