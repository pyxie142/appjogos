
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

package interface;

public class LoginPanel extends TelaPanel {
    private  JButton botaoLogin; 
    public LoginPanel(JPanel telas, JFrame janela) {
        super(telas, janela);
    JLabel mensagem = new JLabel("conteudo de Login Panel " );
    JButton botao = new JButton("fazer login ");
    botao.addActionListener(this);
    this.add(mensagem);
    this.add(botao);

    }

    public void executarBotao(ActionEvent e) {
        trocaTela("Tela principal "); 
    }
}
