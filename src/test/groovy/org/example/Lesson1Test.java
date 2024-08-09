package org.example;

import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;

class Lesson1Test {

    @Test
    void getCountChar()
    {
        //test1
        assertEquals(1, Lesson1.getCountChar("жопа", "попа"));

        //test2
        assertEquals(5, Lesson1.getCountChar("пизда", "хуй"));

        //test3
        assertEquals(0, Lesson1.getCountChar("Я кушаю не говно", "говно кушаю не я"));

        //test4
        assertEquals(3, Lesson1.getCountChar("голос овощей", "ГОЛОС ОВО..."));

        //test5
        assertEquals(1, Lesson1.getCountChar("поза 69", "ПоЗа  69"));
    }
}