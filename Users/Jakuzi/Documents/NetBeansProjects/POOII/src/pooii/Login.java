package pooii;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Login extends Frame{

    Label email = new Label("Email"), senha = new Label("Senha");
    TextField te = new TextField(40);
    JPasswordField ts = new JPasswordField(23);
    Button botao = new Button("Login");
    Panel p = new Panel(new FlowLayout());
    
    Login(){
                setTitle("Tela Login");	
                setLayout(null); // posicionamento absoluto
		setResizable(true);
		//configureLabel(false);
		setBackground(Color.red);
                setLocation(100,100);
                p.setBounds(10,30, 400, 100);
                
                p.add(email);
                p.add(te);
                p.add(senha);
                p.add(ts);
		p.add(botao);
                
                add(p);
                setMinimumSize(new Dimension(500,120));
                setVisible(true);
                
                botao.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                analisar();
                }
                });
                
            this.addWindowListener(new WindowListener(){
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
    
    public void analisar(){
    
        String usuarioSistema = "gilberto123@hotmail.com";
        String senhaSistema = "123";
        String s = new String(ts.getPassword());
        
        if(te.getText().contains(usuarioSistema) && s.contains(senhaSistema)){
        JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO!");
        CadastrarUsuario c = new CadastrarUsuario();
        this.setVisible(false);
        } else {
        JOptionPane.showMessageDialog(null, "ACESSO NEGADO!");
        }
    }
    
    public static void main(String[] args) {
		new Login();
	}
}
