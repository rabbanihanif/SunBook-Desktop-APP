import connection.Koneksi;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login {
    private static JFrame Login = new JFrame("SunBook Desktop APP");
    private JTextField tUsername;
    private JPasswordField tPassword;
    private JButton btnLogin;
    private JButton btnRegist;
    private JPanel panel1;

    public Login() {
        btnRegist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login.setVisible(false);
                new Register().setVisible(true);
            }
        });
    }
    public void setVisible(boolean b){
        Login.setVisible(b);
    }

    public static void main(String[] args) {
        Login.setContentPane(new Login().panel1);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.setMinimumSize(new java.awt.Dimension(360, 180));
        Login.setSize(new java.awt.Dimension(360, 180));
        Login.pack();
        Login.setVisible(true);
    }
}
