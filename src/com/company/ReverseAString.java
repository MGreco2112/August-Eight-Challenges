package com.company;

public class ReverseAString {
    public static void reverseAString(String input) {
        StringBuilder revInput = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            revInput.append(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                revInput.setCharAt(i, Character.toUpperCase(revInput.charAt(i)));
            } else {
                revInput.setCharAt(i, Character.toLowerCase(revInput.charAt(i)));
            }

        }


        System.out.println(revInput);
    }


}
