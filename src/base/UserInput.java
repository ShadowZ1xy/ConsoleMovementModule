package base;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UserInput {
    JFrame jf = new JFrame() {{
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }};
    static boolean isChanged = false;

    public UserInput(Player player) {
        jf.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {
                if (event.getKeyCode() == KeyEvent.VK_W ||
                                event.getKeyCode() == KeyEvent.VK_A ||
                                event.getKeyCode() == KeyEvent.VK_S ||
                                event.getKeyCode() == KeyEvent.VK_D) {

                    if (event.getKeyCode() == KeyEvent.VK_W) {
                        if (player.currentPosition[0] - 1 >= 0) {
                            player.currentPosition[0] = player.currentPosition[0] - 1;
                        }
                    }
                    if (event.getKeyCode() == KeyEvent.VK_A) {
                        if (player.currentPosition[1] - 1 >= 0) {
                            player.currentPosition[1] = player.currentPosition[1] - 1;
                        }
                    }
                    if (event.getKeyCode() == KeyEvent.VK_D) {
                        if (player.currentPosition[1] + 1 < 20) {
                            player.currentPosition[1] = player.currentPosition[1] + 1;
                        }
                    }
                    if (event.getKeyCode() == KeyEvent.VK_S) {
                        if (player.currentPosition[0] + 1 < 20) {
                            player.currentPosition[0] = player.currentPosition[0] + 1;
                        }
                    }
                    isChanged = true;
                } else {
                    isChanged = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent event) {
                // different stuff
            }

            @Override
            public void keyTyped(KeyEvent event) {
                // more stuff
            }
        });
    }
}