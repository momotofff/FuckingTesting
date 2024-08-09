package org.example;

import java.util.HashMap;
import java.util.Map;

public class Lesson1
{
    public Lesson1() {}

    public static int getCountChar(String str1, String str2)
    {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : str1.toLowerCase().toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Character c : str2.toLowerCase().toCharArray())
            map.put(c, map.getOrDefault(c, 0) - 1);

        int plus = 0;
        int minus = 0;

        for (int i : map.values())
        {
            if (i > 0)
                plus += i;
            else if (i < 0)
                minus -= i;
        }

        return Math.max(plus, minus);
    }
}