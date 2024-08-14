package org.example.Lesson2_Exam;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Scope extends JFrame
{
    JPanel frame = new JPanel();

    public Scope()
    {
        super("Прозрачное окно");
        frame.setLayout(new GridBagLayout());
        frame.setSize(300,200);
        //frame.setLocationRelativeTo(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton ok = new JButton("OK");
        frame.add(ok);




        ok.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent event)
            {
                System.out.println(getScopeSize());
                getScreenShot();
            }
        });

        add(frame, BorderLayout.SOUTH);

    }

    public Rectangle getScopeSize()
    {
        return new Rectangle(getX(),getY(),getSize().width, getSize().height);
    }

    public void getScreenShot()
    {
        Robot robot = null;

        try
        {
            robot = new Robot();
        }
        catch (AWTException e)
        {
            throw new RuntimeException(e);
        }

        String format = "png";
        String name = "screenshot_name." + format;

        Rectangle rectangle = new Rectangle(getScopeSize());
        BufferedImage image = robot.createScreenCapture(rectangle);

        try
        {
            ImageIO.write(image, format, new File(name));
        }

        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
