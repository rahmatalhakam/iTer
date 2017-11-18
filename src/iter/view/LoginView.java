package iter.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JFrame{
    private JLabel jlJudul, jlUser, jlPass;
    private JTextField jtUser, jtPass;
    private JButton jbLogin, jbRegister;
    private JPanel panelAtas, panelBawah, panelTengah;

    public LoginView() throws HeadlessException {
        this.setLayout(new BorderLayout());
        this.setSize(400, 270);
        this.init();
        this.loc();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationRelativeTo(null);
        
    }
    private void init(){
        panelAtas = new JPanel(new FlowLayout(1, 20, 20));
        panelTengah = new JPanel(new FlowLayout(1, 20, 20));
        panelBawah = new JPanel(new FlowLayout(1, 20, 20));
        jlJudul = new JLabel("LOGIN");
        jlPass = new JLabel("password");
        jlUser = new JLabel("username");
        jtUser = new JTextField();
        jtPass = new JTextField();
        jbLogin = new JButton("Login");
        jbRegister = new JButton("Register");
        
    }
    
    private void loc(){
        add(panelAtas, BorderLayout.NORTH);
        add(panelBawah, BorderLayout.SOUTH);
        add(panelTengah, BorderLayout.CENTER);
        panelAtas.add(jlJudul);
        panelTengah.add(jlUser);
        panelTengah.add(jtUser);
        jtUser.setColumns(20);
        jtPass.setColumns(20);
        panelTengah.add(jlPass);
        panelTengah.add(jtPass);
        panelBawah.add(jbLogin);
        panelBawah.add(jbRegister);
        
    }
    
    
   
}
