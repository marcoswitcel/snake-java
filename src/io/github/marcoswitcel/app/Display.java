package io.github.marcoswitcel.app;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Display extends Canvas implements ActionListener {

    private Timer timer;


    public Display(int width, int height) {
        setBackground(Color.BLACK);
        setSize(width, height);
        setFocusable(true);

        timer = new Timer(140, this);
    }

    public void init() {
        addKeyListener(new KeyboardAdapter());
        timer.start();
    }

    public void paint(Graphics graphics) {
        System.out.println("p");
        graphics.setColor(Color.GREEN);

        graphics.fillRect(10, 10, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        java.lang.System.out.println("Atualizando:");

        
        
        repaint();
    }
}
