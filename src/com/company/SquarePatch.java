package com.company;

import java.util.Arrays;

public class SquarePatch {

    public static String squarePatch(int size) {
        Integer[][] outerBox = new Integer[size][size];

        for (int i = 0; i < size; i++) {
            Integer[] innerBox = new Integer[size];
            for (int j = 0; j < size; j++) {
                innerBox[j] = size;
            }

            outerBox[i] = innerBox;
        }


        return Arrays.deepToString(outerBox);
    }

}
