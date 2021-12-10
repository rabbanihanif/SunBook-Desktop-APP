import KONEKSI.Koneksi_login;
import MainMenu.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.*;



public class Login {
    private static JFrame Login = new JFrame("SunBook Desktop APP");
    private JTextField tUsername;
    private JPasswordField tPassword;
    private JButton btnLogin;
    private JButton btnRegist;
    private JPanel panel1;

    public void close() {
        WindowEvent closeWindow = new WindowEvent(Login, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

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
                        close();
                        new Menu();
                    } else {
                        JOptionPane.showMessageDialog(null, "username atau password salah");
                    }
                }catch(SQLException | ClassNotFoundException ex){
                    System.out.println(ex.getMessage());
                }
            }
        });




        Login.add(panel1);
        Login.pack();
        Login.setVisible(true);

        Login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Login.setSize(new java.awt.Dimension(640,480));


    }
    public void setVisible(boolean b){
        Login.setVisible(b);
    }

}
