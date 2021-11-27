import connection.Koneksi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
import java.sql.*;
import connection.Koneksi;

public class Form_DataBuku {
    private JTextField txtStok;
    private JPanel panel1;
    private JTextField txtPengarang;
    private JTextField txtPenerbit;
    private JTextField txtJudul;
    private JTextField txtTahun;
    private JTextField txtHarga;
    private JTable table1;
    private JButton btnTambah;
    private JButton btnUpdate;
    private JButton btnHapus;


    public Form_DataBuku() {

        // button tambah
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    Connection conn = Koneksi.configDB();
                    PreparedStatement stmt = conn.prepareStatement("INSERT INTO buku (id_buku,judul,pengarang,penerbit,tahun_terbit,stok,harga)VALUES(?,?,?,?,?,?,?)");

                    stmt.setString(1,txtJudul.getText());
                    stmt.setString(2,txtPenerbit.getText());
                    stmt.setString(3, txtPengarang.getText());
                    stmt.setString(4, txtTahun.getText());
                    stmt.setString(5,txtHarga.getText());
                    stmt.setString(6, txtStok.getText());
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data berhsil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
    }
}



