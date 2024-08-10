package org.example;

import java.util.HashMap;
import java.util.Map;

public class Lesson1
{
    public static int getCharCount(String str1, String str2)
    {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : str1.toLowerCase().toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Character c : str2.toLowerCase().toCharArray())
            map.put(c, map.getOrDefault(c, 0) - 1);

        int plus = 0;
        int minus = 0;

        for (int value : map.values())
        {
            if (value > 0)
                plus += value;
            else if (value < 0)
                minus -= value;
        }

        return Math.max(plus, minus);
    }
}