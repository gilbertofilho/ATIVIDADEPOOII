package pooii;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JanelaConfirmacao extends JFrame{

    private JLabel frase;
    private JButton confirmar, cancelar;
    private JPanel painel;
    private Aluno a;
            
    public JanelaConfirmacao(Aluno aluno){
    super("Cadastro de informações");
    setLayout(null);
    setResizable(false);
    setLocation(200,200);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    this.a = aluno;
    
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
    
    confirmar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    mostrarUsuario();
    }
    });
    cancelar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    voltar();
    }
    });
    /*this.addWindowListener(new WindowListener(){
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
        });*/
    }
    
    public void mostrarUsuario(){
        JOptionPane.showMessageDialog(null, "NOME: "+a.getNome()+" \nSEXO: "+a.getSexo()+" \nDISCIPLINAS: "
                +Arrays.toString(a.getDisciplinas())+" \nCOMENTÁRIOS: "+a.getComentario());
        this.setVisible(false);
    }
    
    public void voltar(){
    this.setVisible(false);
    }
}
