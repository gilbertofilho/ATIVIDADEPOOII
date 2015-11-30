
package pooii;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Estrela {
    Frame f = new Frame();

    public Estrela() {
        f.setSize(400, 400);
        f.setLocation(100, 100);
        f.setTitle("Estrela");
        f.setResizable(true);
        f.setVisible(true);
        
        f.add(new MyCanvas());
    }
    
    public static void main(String[] args) {
        Estrela e = new Estrela(); 
    }
    
    class MyCanvas extends Canvas {

      public MyCanvas () {
         setBackground (Color.GRAY);
         setSize(300, 300);
      }

      public void paint (Graphics g) {
          Graphics2D g2;
         g2 = (Graphics2D) g;
         g2.drawLine(150, 0, 0, 300);
         g2.drawLine(0, 100, 300, 100);
         g2.drawLine(0, 100, 300, 300);
         g2.drawLine(300, 300, 150, 0);
         g2.drawLine(300, 100, 0, 300);
      }
   }
    
}
