package org.example;

import org.example.database.GsonParser;
import org.example.gameapp.ShowInitialWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        GsonParser gsonParser = new GsonParser();
        System.out.println(gsonParser.getCityNames());
        //GameApp.start();
        SwingUtilities.invokeLater(ShowInitialWindow::show);

    }
}
