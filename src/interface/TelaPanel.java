
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

package interface;

public class TelaPanel extends JPanel implements ActionListener {
    private JPanel telas;
    private CardLayout controleTela;
    private JFrame janelas;

        public TelaPanel(JPanel telas, JFrame janelas) {
            this.telas = telas;
            this.controleTela = (CardLayout) telas.getLayout();
            this.janelas = janelas;
            this.setBackground(Color.decode("#202028"));

            imagem botaoFechar = new Imagem("");
        }
}
