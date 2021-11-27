
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    JFrame Regist = new JFrame("SunBook Desktop APP");
    private JTextField tUsername;
    private JPasswordField tPassword;
    private JButton btnRegist;
    private JButton exitButton;
    private JPanel panelRegist;

    public Register() {
        Regist.setContentPane(panelRegist);
        Regist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Regist.pack();
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Regist.setVisible(false);
                new Login().setVisible(true);
            }
        });
        btnRegist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void setVisible(boolean b) {
        Regist.setVisible(b);
    }
}
