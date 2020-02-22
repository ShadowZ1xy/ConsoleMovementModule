package base;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UserInput {
    JFrame jf = new JFrame() {{
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }};

    public UserInput(Player player) {
        jf.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {
                if (event.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }
                if (event.getKeyCode() == KeyEvent.VK_W ||
                        event.getKeyCode() == KeyEvent.VK_A ||
                        event.getKeyCode() == KeyEvent.VK_S ||
                        event.getKeyCode() == KeyEvent.VK_D) {
                    switch (event.getKeyCode()) {
                        case KeyEvent.VK_W:
                            player.lastMove = Side.TOP;
                            break;
                        case KeyEvent.VK_S:
                            player.lastMove = Side.BOTTOM;
                            break;
                        case KeyEvent.VK_A:
                            player.lastMove = Side.LEFT;
                            break;
                        case KeyEvent.VK_D:
                            player.lastMove = Side.RIGHT;
                            break;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent event) {
            }

            @Override
            public void keyTyped(KeyEvent event) {
            }
        });
    }
}