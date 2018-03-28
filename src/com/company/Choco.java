package com.company;

public class Choco {
    //We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars(5 kilo each) Return the number of small bars to use, assuming we always use big bars
    //before small bars. Return -01 if it can't be done
    public static void main(String[] args) {
        int small = 4;
        int big =1;
        int goal=7;
        int makeChocolate;
            if (small + 5 * big < goal) {
                makeChocolate = -1;
            } else if (goal % 5 == 0) {
                makeChocolate = 0;
            } else
                makeChocolate = (goal - 5 * big);

        System.out.println("Number of small bars=" +makeChocolate);
        }

    }
