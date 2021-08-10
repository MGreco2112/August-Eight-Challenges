package com.company;

import java.util.ArrayList;

public class MultiplesArray {


    public static ArrayList multiplesArray(int num, int length) {
        ArrayList<Integer> multiple = new ArrayList<>();
        int multiplier = 1;

        while (multiple.size() < length) {
            multiple.add(num * multiplier);
            multiplier++;
        }

        return multiple;
    }

}
