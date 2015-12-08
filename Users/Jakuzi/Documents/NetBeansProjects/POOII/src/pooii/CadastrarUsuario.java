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
    public JButton botao;
    public JPanel painel, painel2;
    Aluno aluno = new Aluno();
    String sexoSelect;
    
    public CadastrarUsuario(){
    
        super("Cadastrar Usuário");
        setLayout(new GridLayout(2,1));
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nome = new JLabel("Nome");
        sexo = new JLabel("Sexo");
        disciplinas = new JLabel ("<html><font color =\"white\">Disciplinas");
        comentario = new JLabel("<html><font color=\"white\">Comentário");
        
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
        
        painel = new JPanel(new FlowLayout());
        painel.setBounds(10, 50, 680, 40);
        painel.setBackground(Color.ORANGE);
        painel2 = new JPanel(new GridLayout(3,2));
        painel2.setBounds(10, 100, 680, 90);
        painel2.setBackground(Color.DARK_GRAY);
        
        painel.add(nome);
        painel.add(tnome);
        painel.add(sexo);
        painel.add(masculino);
        painel.add(feminino);
        painel2.add(disciplinas);
        painel2.add(lista);
        painel2.add(comentario);
        painel2.add(tcomentario);
        painel2.add(botao);
        
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
            JanelaConfirmacao();
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
    this.aluno.setNome(tnome.getText());
    this.aluno.setSexo(sexoSelect);
    this.aluno.setDisciplinas(lista.getSelectedItems());
    this.aluno.setComentario(tcomentario.getText());
    }
    
    public void JanelaConfirmacao(){
    JanelaConfirmacao c = new JanelaConfirmacao(aluno);
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
