package pooii;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastrarUsuario extends JFrame{

    public JLabel nome, sexo, comentario, disciplinas;
    public JTextField tnome;
    public TextArea tcomentario;
    public JRadioButton masculino, feminino;
    public RadioButtonHandler handler;
    public ButtonGroup grupo;
    public List lista;
    public JButton botao, botao2;
    public JPanel painel, painel2, mini1, mini2;
    Aluno aluno = new Aluno();
    String sexoSelect;
    
    public CadastrarUsuario(){
    
        super("Cadastrar Usuário");
        setLayout(new GridLayout(2,1));
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nome = new JLabel("Nome");
        sexo = new JLabel("Sexo");
        disciplinas = new JLabel ("<html><font color =\"gray\">Disciplinas");
        comentario = new JLabel("<html><font color=\"gray\">Comentário");
        
        tnome = new JTextField(30);
        tcomentario = new TextArea();
        
        masculino = new JRadioButton("M", false);
        feminino = new JRadioButton("F", false);
        handler = new RadioButtonHandler();
        
        lista = new List(5, true);
        
        lista.add("matematica");
        lista.add("português");
        lista.add("geografia");
        lista.add("historia");
        lista.add("ciências");
        
        botao = new JButton("Cadastrar");
        botao2 = new JButton("Voltar");
        
        painel = new JPanel(new FlowLayout());
        painel.setBounds(10, 50, 680, 40);
        painel.setBackground(Color.ORANGE);
        painel2 = new JPanel(new GridLayout(3,2));
        painel2.setBounds(10, 100, 680, 90);
        mini1 = new JPanel(new BorderLayout());
        mini1.setBounds(0, 0, 100, 40);
        mini1.setBackground(Color.lightGray);
        mini2 = new JPanel(new BorderLayout());
        mini2.setBounds(0, 0, 100, 40);
        mini2.setBackground(Color.LIGHT_GRAY);
        
        painel.add(nome);
        painel.add(tnome);
        painel.add(sexo);
        painel.add(masculino);
        painel.add(feminino);
        mini1.add(disciplinas, BorderLayout.EAST);
        painel2.add(mini1);
        painel2.add(lista);
        mini2.add(comentario, BorderLayout.EAST);
        painel2.add(mini2);
        painel2.add(tcomentario);
        painel2.add(botao);
        painel2.add(botao2);
        
        add(painel);
        add(painel2);
        
        grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);
        
        masculino.addItemListener(handler);
        feminino.addItemListener(handler);
        
        setMinimumSize(new Dimension(700, 500));
        setVisible(true);
        
        botao.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Cadastrar();
        }
        });
        botao2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Login l = new Login();
            setVisible(false);
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
    
    public void Cadastrar(){
        if(tnome.getText() != null && sexoSelect != null && lista.getSelectedItems() != null && tcomentario.getText() != null){
    this.aluno.setNome(tnome.getText());
    this.aluno.setSexo(sexoSelect);
    this.aluno.setDisciplinas(lista.getSelectedItems());
    this.aluno.setComentario(tcomentario.getText());
    JanelaConfirmacao c = new JanelaConfirmacao(aluno);
    } else{
        JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }
    
    private class RadioButtonHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(masculino.isSelected()){
            sexoSelect = "masculino";
            }
            if(feminino.isSelected()){
            sexoSelect = "feminino";
            }
        }
    
    }
    public static void main(String[] args) {
        new CadastrarUsuario();
    }
    
}
