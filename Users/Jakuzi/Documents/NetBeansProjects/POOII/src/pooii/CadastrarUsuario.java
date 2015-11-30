package pooii;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastrarUsuario extends JFrame{

    public JLabel nome, sexo, comentario;
    public JTextField tnome, tcomentario;
    public JRadioButton masculino, feminino;
    public ButtonGroup grupo;
    public List lista;
    public JButton botao;
    public JPanel painel, painel2;
    
    public CadastrarUsuario(){
    
        super("Cadastrar Usuário");
        setLayout(new GridLayout(2,1));
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nome = new JLabel("Nome");
        sexo = new JLabel("Sexo");
        comentario = new JLabel("Comentário");
        
        tnome = new JTextField(10);
        tcomentario = new JTextField(10);
        
        masculino = new JRadioButton("M", false);
        feminino = new JRadioButton("F", false);
        
        lista = new List(5, true);
        
        lista.add("matematica");
        lista.add("português");
        lista.add("geografia");
        lista.add("historia");
        lista.add("ciências");
        
        botao = new JButton("Cadastrar");
        
        painel = new JPanel(new FlowLayout());
        painel.setBounds(10, 50, 330, 75);
        painel.setBackground(Color.red);
        painel2 = new JPanel(new FlowLayout());
        painel2.setBounds(10, 130, 330, 90);
        painel2.setBackground(Color.DARK_GRAY);
        
        painel.add(nome);
        painel.add(tnome);
        painel.add(sexo);
        painel.add(masculino);
        painel.add(feminino);
        painel2.add(lista);
        painel2.add(comentario);
        painel2.add(tcomentario);
        painel2.add(botao);
        
        add(painel);
        add(painel2);
        
        grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);
        
        setMinimumSize(new Dimension(350, 270));
        setVisible(true);
    }
    public static void main(String[] args) {
        new CadastrarUsuario();
    }
    
}
