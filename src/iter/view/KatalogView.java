/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iter.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Rahmat Al Hakam
 */
public class KatalogView extends JFrame{
    private JLabel jlGambar1, jlGambar2, jlGambar3, jlGambar4, jlGambar5;
    private JButton jbPilih1, jbPilih2, jbPilih3, jbPilih4, jbPilih5;
    private BufferedImage gambar1, gambar2, gambar3, gambar4, gambar5;
    private JScrollPane jsPane;
    private JPanel jpListTernak, panel1,panel2,panel3,panel4,panel5;
    private JTable jTable;
    private String pilihan = "Pilih";

    public KatalogView() throws HeadlessException {
        this.setLayout(new FlowLayout());
        init();
        loc();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationRelativeTo(null);
        setSize(500, 300);
    }
    public void init(){
        panel1 = new JPanel(new FlowLayout());
        panel2 = new JPanel(new FlowLayout());
        panel3 = new JPanel(new FlowLayout());
        panel4 = new JPanel(new FlowLayout());
        panel5 = new JPanel(new FlowLayout());
        jbPilih1 = new JButton(pilihan);
        jbPilih2 = new JButton(pilihan);
        jbPilih3 = new JButton(pilihan);
        jbPilih4 = new JButton(pilihan);
        jbPilih5 = new JButton(pilihan);
        
        jlGambar1 = new JLabel (new ImageIcon(getClass().getResource(("kamusku.png")), "Kamus1"));
        jlGambar2 = new JLabel (new ImageIcon(getClass().getResource(("kamusku.png"))));
        jlGambar3 = new JLabel (new ImageIcon(getClass().getResource(("kamusku.png"))));
        jlGambar4 = new JLabel (new ImageIcon(getClass().getResource(("kamusku.png"))));
        jlGambar5 = new JLabel (new ImageIcon(getClass().getResource(("kamusku.png"))));
        
        
        jpListTernak = new JPanel();
        jsPane = new JScrollPane(jpListTernak, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setLayout(new BorderLayout());
    }
    public void loc(){
        panel1.setPreferredSize(new Dimension(150, 250));
        panel2.setPreferredSize(new Dimension(150, 250));
        panel3.setPreferredSize(new Dimension(150, 250));
        panel4.setPreferredSize(new Dimension(150, 250));
        panel5.setPreferredSize(new Dimension(150, 250));
        
        panel1.add(jlGambar1);
        panel2.add(jlGambar2);
        panel3.add(jlGambar3);
        panel4.add(jlGambar4);
        panel5.add(jlGambar5);
        panel1.add(jbPilih1);
        panel2.add(jbPilih2);
        panel3.add(jbPilih3);
        panel4.add(jbPilih4);
        panel5.add(jbPilih5);
        
         jpListTernak.add(panel1);
        jpListTernak.add(panel2);
        jpListTernak.add(panel3);
        jpListTernak.add(panel4);
        jpListTernak.add(panel5);
        
        jpListTernak.setPreferredSize(new Dimension(900,230));
        setLayout(new BorderLayout());
        add(jsPane);
        setSize(800, 230);
    }
    
}
