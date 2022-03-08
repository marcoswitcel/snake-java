package io.github.marcoswitcel.app;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.Toolkit;

import io.github.marcoswitcel.entity.Snake;
import io.github.marcoswitcel.utils.Vec2;


public class Display extends Canvas implements ActionListener {

    private Timer timer;
    private Snake snake;

    public Display(int width, int height) {
        setBackground(Color.BLACK);
        setSize(width, height);
        setFocusable(true);

        timer = new Timer(1000/4, this);
        snake = new Snake(new Vec2(20,20), new ArrayList<Vec2>());
    }

    public void init() {
        addKeyListener(new KeyboardAdapter());
        timer.start();
    }

    public void paint(Graphics graphics) {
        System.out.println("paint");
        graphics.setColor(Color.GREEN);

        // graphics.fillRect(10, 10, 50, 50);
        for (int x = 33; --x >= 0; ) {
            for (int y = 33; --y >= 0; ) {
                graphics.fillRect(20 + x * 10, 20 + y * 10, 10, 10);
            }
        }
        Vec2 head = snake.getHead();
        head.x++;
        head.y--;
        if (head.x < 0) {
            head.x = 32;
        } else if (head.x > 32) {
            head.x = 0;
        }
        if (head.y < 0) {
            head.y = 32;
        } else if (head.y > 32) {
            head.y = 0;
        }
        graphics.setColor(Color.RED);
        graphics.fillRect(20 + head.x * 10, 20 + head.y * 10, 10, 10);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        java.lang.System.out.println("Atualizando:");
        
        repaint();
    }
}
