package org.example;

import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;

class Lesson1Test
{
    @Test
    void getCharsCount_ExpectOne()
    {
        assertEquals(1, Lesson1.getCharCount("жопа", "попа"));
    }

    @Test
    void getCharsCount_ExpectFive()
    {
        assertEquals(5, Lesson1.getCharCount("пизда", "хуй"));
    }

    @Test
    void getCharsCount_ExpectZero()
    {
        assertEquals(0, Lesson1.getCharCount("Я кушаю не говно", "говно кушаю не я"));
    }

    @Test
    void getCharsCount_Uppercase_ExpectCorrect() { assertEquals(0, Lesson1.getCharCount("голос овощей", "ГОЛОС ОВОЩЕЙ")); }

    @Test
    void getCharsCount_ExtraSpace_ExpectCorrect()
    {
        assertEquals(1, Lesson1.getCharCount("поза 69", "поза  69"));
    }

    @Test
    void getCharsCount_SpecialSymbols_ExpectCorrect()
    {
        assertEquals(1, Lesson1.getCharCount(":-)", ":-("));
    }

    @Test
    void getCharsCount_SameStrings_ExpectZero()
    {
        assertEquals(0, Lesson1.getCharCount("blah", "blah"));
    }

    @Test
    void getCharsCount_EmptyString_ExpectCorrect()
    {
        assertEquals(4, Lesson1.getCharCount("", "blah"));
    }
}