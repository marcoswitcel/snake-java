package io.github.marcoswitcel.app;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardAdapter extends KeyAdapter {
    
    @Override
    public void keyPressed(KeyEvent event) {
        int keyCode = event.getKeyCode();

        System.out.println(keyCode);
    }
}
