/*Y=10+2.sin(x) egrisini çizen program
*/
package grafik;

import java.awt.*;
import javax.swing.*;

public class grafik2 extends JFrame {
    public grafik2(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(450,500);
    }
    public void paint(Graphics g){
        double y1,y2;
        for(double x=0.0;x<=6.28;x+=0.01){
            y1 = 2.0*Math.sin(x);
            y2 = 2.0*Math.sin(x+0.01);
            g.drawLine(225,250,500,250);//x eksenimiz olsun
            g.drawLine(225,250,225,20);
            g.drawString("y=2sin(x) egrisi",250,150);
            g.drawLine(225+(int)(30*x),250-(int)(30*y1),225+(int)(30*(x+0.01)),250-(int)(30*y2));
        }
    }
    public static void main(String[] args) {
        grafik2 x=new grafik2();
        x.setVisible(true);
    }
}
