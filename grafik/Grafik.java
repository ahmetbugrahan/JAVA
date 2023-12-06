package grafik;

import java.awt.*;
import javax.swing.*;

public class Grafik extends JFrame {
    public Grafik(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(1000,1000);
    }
    public void paint(Graphics g){
        g.drawLine(100,100,200,400);
        g.drawOval(100, 100, 500,500 );
        g.fillOval(100, 100,100, 100);
        g.setColor(Color.red);
    }
    public static void main(String[] args) {
        Grafik x=new Grafik();
        x.setVisible(true);
    }
    
}
