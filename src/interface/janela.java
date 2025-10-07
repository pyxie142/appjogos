
import java.awt.CardLayout;
import java.security.Principal;
import javax.swing.JPanel;

package interface;

import javax.swing.JFrame;

public class janela extends JFrame {
   public Janela() {
    this.setBounds(0,0,1920,1080);
    CardLayout controleTela = new CardLayout();
    JPanel telas = new JPanel(controleTela);
    LoginPanel LoginPanel = new LoginPanel(telas, this);
    PrincipalPainel PrincipalPainel = new PrincipalPanel(telas, this); 

    this.add(telas);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setUndecorated(true);
    this.setVisible(true);

   } 
}
