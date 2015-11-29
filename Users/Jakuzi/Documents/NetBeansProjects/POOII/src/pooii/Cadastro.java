package pooii;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cadastro extends JFrame{

    private JLabel frase;
    private JButton confirmar, cancelar;
    private JPanel painel;
    
    public Cadastro(){
    super("Cadastro de informações");
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frase = new JLabel("deseja realmente cadastrar estas informações?");
    confirmar = new JButton("Confirmar");
    cancelar = new JButton("Cancelar");
    
    painel = new JPanel(new FlowLayout());
    painel.setBounds(20, 20, 300, 100);
    
    painel.add(frase);
    painel.add(confirmar);
    painel.add(cancelar);
    
    add(painel);
    
    setMinimumSize(new Dimension(320,120));
    setVisible(true);
    }
    
    public static void main(String[] args) {
        new Cadastro();
    }
}
