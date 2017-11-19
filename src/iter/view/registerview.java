package iter.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class registerview {
    public static void main(String[] args) {
        new guiregister();
    }
}

class guiregister extends JFrame implements ActionListener{
    
    private JLabel registerlabel = new JLabel("REGISTER"),lnama = new JLabel("Nama"),luser = new JLabel("Username"),
                   lpass = new JLabel("Password"),lemail = new JLabel("Email"),lalamat = new JLabel("Alamat"), bantu=new JLabel("                    "), bantu2=new JLabel("                    ");
    private JTextField fnama = new JTextField(10),fuser = new JTextField(30),fpass = new JTextField(30),femail = new JTextField(30),falamat = new JTextField(30);
    private JButton bsimpan = new JButton("Simpan");
    private JPanel panelatas = new JPanel(new GridLayout(5,2)), panelbawah = new JPanel(new FlowLayout()), 
            panelkiri = new JPanel(), panelkanan = new JPanel(), paneltop = new JPanel(new FlowLayout());
    
    String url="jdbc:mysql://localhost:3306/mahasiswa";
    String username="root";
    String password="";
    Connection koneksi;
    Statement pernyataan;
    
    public guiregister(){
        setTitle("Form Registrasi");
        setSize(400,270);
        
        setLayout(new BorderLayout());
        add(panelatas,BorderLayout.CENTER); add(panelkiri,BorderLayout.WEST); 
        add(panelkanan,BorderLayout.EAST); add(panelbawah,BorderLayout.SOUTH); panelatas.setAlignmentY(10);
        add(paneltop,BorderLayout.NORTH);
        
        paneltop.add(registerlabel);
        panelatas.add(lnama); panelatas.add(fnama); panelatas.add(luser); panelatas.add(fuser); panelatas.add(lpass); panelatas.add(fpass); 
        panelatas.add(lemail); panelatas.add(femail);panelatas.add(lalamat); panelatas.add(falamat);
        panelkiri.add(bantu); panelkanan.add(bantu2); panelbawah.add(bsimpan);
                
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
    }

}