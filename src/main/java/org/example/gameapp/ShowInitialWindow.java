package org.example.gameapp;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
public class ShowInitialWindow {
        public static void show() {
            JFrame initialFrame = new JFrame("City Game");
            initialFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            initialFrame.setSize(400, 200);

            JButton startButton = new JButton("Start Game");
            JButton instructionsButton = new JButton("Instructions");

            startButton.addActionListener(e -> {
                initialFrame.dispose();
                ShowGameWindow.show(); // Викликаємо метод showGameWindow() після натискання кнопки
            });

            instructionsButton.addActionListener(e -> {
                ShowInstructionsWindow.show();
            });

            JPanel panel = new JPanel();
            panel.add(new JLabel("To start the game, press OK"));
            panel.add(startButton);
            panel.add(instructionsButton);

            initialFrame.getContentPane().add(panel);
            initialFrame.setVisible(true);
        }
    }

