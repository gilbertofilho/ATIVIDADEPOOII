package pooii;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;

public class Login extends Frame{

    Label email = new Label("Email"), senha = new Label("Senha");
    TextField te = new TextField(50), ts = new TextField(50);
    Button botão = new Button("Login");
    Panel p = new Panel(new FlowLayout());
    
    Login(){
		setLayout(null); // posicionamento absoluto
		//setSize(500,500);
                setResizable(false);
		//configureLabel(false);
		setBackground(Color.red);
                
                //p = new Panel(new FlowLayout());
                //p.setBounds(10,30,400,400);
                p.setBounds(10,30, 400, 400);
                
                p.add(email);
                p.add(te);
                p.add(senha);
                p.add(ts);
		p.add(botão);
                
                add(p);
                setMinimumSize(new Dimension(500,500));
                setVisible(true);
        }
    
    
    public static void main(String[] args) {
		new Login();
	}
}
