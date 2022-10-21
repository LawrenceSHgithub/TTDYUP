package Main;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameScreen extends JPanel {

        private Random random;
        public GameScreen(){
                random = new Random();
        }
        public void paintComponent(Graphics g){
                super.paintComponent(g);


                for (int x = 0; x < 20; x++) {
                        g.setColor(getRndColor());
                        g.fillRect(x * 32, 0, 32, 32);
                }
                for (int y = 0; y < 20; y++) {
                        g.setColor(getRndColor());
                        g.fillRect(0, y * 32, 32, 32);
                }
        }
        private Color getRndColor() {
                 int r = random.nextInt(256);
                 int g = random.nextInt(256);
                 int b = random.nextInt(256);
                return new Color(r, g, b);
        }
}
