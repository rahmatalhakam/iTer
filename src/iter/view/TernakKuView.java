package iter.view;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Rahmat Al Hakam
 */
public class TernakKuView extends JFrame{
   
    public TernakKuView() {
        this.setLayout(new FlowLayout());
        init();
        loc();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationRelativeTo(null);
        setSize(500, 300);
    }
    private void init(){
        
    }
    private void loc(){
        
    }
    
}
