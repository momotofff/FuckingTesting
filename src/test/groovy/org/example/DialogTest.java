package org.example;

import org.example.Lesson2_Exam.DialogFrame;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

public class DialogTest
{
    @Test
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                DialogFrame frame = new DialogFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
