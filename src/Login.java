
import KONEKSI.Koneksi_login;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


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
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = Koneksi_login.getConnection();
                    String username = tUsername.getText();
                    String password = tPassword.getText();

                    Statement stm = conn.createStatement();
                    String sql = "select * from user where username ='"+username+"'and password ='"+password+"'";
                    ResultSet res = stm.executeQuery(sql);
                    if (res.next()){
                        JOptionPane.showMessageDialog(null,"anda berhasil login");
                    } else {
                        JOptionPane.showMessageDialog(null, "username atau password salah");
                    }
                }catch(SQLException | ClassNotFoundException ex){
                    System.out.println(ex.getMessage());
                }
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
