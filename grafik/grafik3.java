package grafik;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

class demo extends JFrame {

    public demo() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        int oran = 20 * 360 / 100;
        int w = getWidth();
        int h = getHeight();
        boolean t = true;
        for (int x = 0; x < w; x = x + 30) {
            for (int y = 0; y < h; y = y + 20) {
                g.drawOval(x, y, 30, 30);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(demo.class.getName()).log(Level.SEVERE, null, ex);
                }
                g.drawRect(x, y, 30, 20);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(demo.class.getName()).log(Level.SEVERE, null, ex);
                }
                g.fillRect(x, y, 30, 20);
                if (t) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.yellow);
                }

                if (t) {
                    t = false;
                } else {
                    t = true;
                }
            }
        }

    }
}

public class grafik3 {

    public static void main(String[] args) {
        demo x = new demo();

    }
}
