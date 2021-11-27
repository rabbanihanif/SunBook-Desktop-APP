import connection.Koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

            }
        });
        btnRegist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = Koneksi.getConnection();
                    PreparedStatement stmt = conn.prepareStatement("INSERT INTO user (username, password)VALUES(?,?)");

                    stmt.setString(1,tUsername.getText());
                    stmt.setString(2, String.valueOf(tPassword.getPassword()));
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data berhsil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException | ClassNotFoundException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }
    public void setVisible(boolean b) {
        Regist.setVisible(b);
    }
}
