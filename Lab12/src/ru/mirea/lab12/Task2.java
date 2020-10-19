package ru.mirea.lab12;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]+ \\+");
        String[] tests = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9 "
        };
        for (String test : tests)
            System.out.println(pattern.matcher(test).matches() + "\t:" + test);
    }
}
