package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double no1, double no2){
        if((Math.abs(no1 - no2)) < 0.0009){
            System.out.println("Numbers are equal by 3 decimal places " + Math.abs(no1 - no2));
            return true;
        } else {
            System.out.println(Math.abs(no1 - no2));
            return false;
        }
    }
}
