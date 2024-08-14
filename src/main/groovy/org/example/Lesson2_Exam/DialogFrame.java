package org.example.Lesson2_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogFrame extends JFrame
{
    public static final int DEFAULT_WIDTH = 640;
    public static final int DEFAULT_HEIGHT = 480;
    public Scope dialog;

    public DialogFrame()
    {
        setTitle("DialogTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JButton screenshot = new JButton("Screenshot");
        menuBar.add(screenshot);

        screenshot.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                if(dialog == null)
                {
                    dialog = new Scope();

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            dialog = new Scope();

                            // Set the window to 55% opaque (45% translucent).
                            dialog.setOpacity(0.55f);

                            // Display the window.
                            dialog.setVisible(true);
                        }
                    });
                    dialog.setOpacity(0.55f);
                    dialog.setVisible(true);
                }

                dialog.setVisible(true); // отобразить диалог
            }
        });
    }
}
