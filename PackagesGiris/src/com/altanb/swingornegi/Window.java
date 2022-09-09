package com.altanb.swingornegi;

import javax.swing.*;

public class Window {


    private JFrame frame ;

    public Window(){

        frame = new JFrame();

        JButton button = new JButton("Click on Here");
        button.setBounds(130,100,100,40);
        frame.add(button);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);





    }

}
