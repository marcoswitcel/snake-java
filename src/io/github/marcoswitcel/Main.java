package io.github.marcoswitcel;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;

import io.github.marcoswitcel.app.Display;

class Main implements Runnable {

    private static final String title = "Snake Java";
    private static final int width = 400;
    private static final int height = 400;

    public void run() {
        System.out.println("Iniciando: " + title);

        JFrame frame = new JFrame(title);

        
        frame.setLayout(null);
        frame.setSize(width, height);

        Display display = new Display(width, height);

        display.init();

        frame.add(display);

        frame.setResizable(false);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Rodando: " + title);
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Main());
    }
}
