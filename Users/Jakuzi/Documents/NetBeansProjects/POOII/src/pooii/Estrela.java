
package pooii;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Estrela {
    Frame f = new Frame();

    public Estrela() {
        f.setSize(400, 400);
        f.setLocation(100, 100);
        f.setTitle("Estrela");
        f.setResizable(true);
        f.setVisible(true);
        
        f.add(new MyCanvas());
        
        f.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
            }
            @Override
            public void windowClosing(WindowEvent e) {
            System.exit(0);
            }
            @Override
            public void windowClosed(WindowEvent e) {
            }
            @Override
            public void windowIconified(WindowEvent e) {
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
            }
            @Override
            public void windowActivated(WindowEvent e) {
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
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
