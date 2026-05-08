package com.unmsm.firstappmvc.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UserView extends JFrame {

    private JLabel label;

    public UserView() {
        setTitle("MVC - Hola Mundo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("", SwingConstants.CENTER);
        add(label);
    }

    public void showGreeting(String message) {
        label.setText(message);
    }

    public void showWindow() {
        setVisible(true);
    }
}
