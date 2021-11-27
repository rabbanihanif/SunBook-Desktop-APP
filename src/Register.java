
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {

    private JTextField tUsername;
    private JPasswordField tPassword;
    private JButton btnRegist;
    private JButton exitButton;
    private JPanel panelRegist;

    public Register() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    public void createLayout(){
       JFrame Regist = new JFrame("Clean Clean");
       Regist.setContentPane(new Register().panelRegist);
       Regist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Regist.pack();
       Regist.setVisible(true);
    }
}
