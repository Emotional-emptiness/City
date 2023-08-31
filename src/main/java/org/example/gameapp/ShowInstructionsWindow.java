package org.example.gameapp;

import javax.swing.*;
import java.awt.*;

public class ShowInstructionsWindow {
    public static void show() {
        JFrame instructionsFrame = new JFrame("Instructions");
        instructionsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        instructionsFrame.setSize(400, 300);

        JTextArea instructionsArea = new JTextArea("Here are the game instructions...");
        instructionsArea.setEditable(false);
        instructionsFrame.getContentPane().add(new JScrollPane(instructionsArea), BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> instructionsFrame.dispose());
        instructionsFrame.getContentPane().add(backButton, BorderLayout.SOUTH);

        instructionsFrame.setVisible(true);
    }
}

