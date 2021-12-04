import connection.Koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                String username = tUsername.getText();
                String password = tPassword.getText();

                if (username.equals("")){
                    JOptionPane.showMessageDialog(null, "add username please");
                }
                else if (password.equals("")){
                    JOptionPane.showMessageDialog(null, "add password please please");
                }
                else if (checkUsername(username)) {
                    JOptionPane.showMessageDialog(null, "Username Already exist");
                }
                else {
                    try {
                        Connection conn = Koneksi.getConnection();
                        PreparedStatement stmt = conn.prepareStatement("INSERT INTO user (username, password)VALUES(?,?)");

                        stmt.setString(1,tUsername.getText());
                        stmt.setString(2, String.valueOf(tPassword.getPassword()));
                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Anda berhasil mendaftar silahkan click exit untuk kembali ke halaman login", "Pesan", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException | ClassNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                }

            }
        });
    }
    public void setVisible(boolean b) {
        Regist.setVisible(b);
    }
    public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `user` WHERE `username` =?";

        try {
            ps = Koneksi.getConnection().prepareStatement(query);
            ps.setString(1, username);

            rs = ps.executeQuery();

            if(rs.next())
            {
                checkUser = true;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }
}
