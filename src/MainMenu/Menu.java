package MainMenu;

import VIEW.BukuView;
import VIEW.PembeliView;
import VIEW.TransaksiView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton ButtonDataBuku;
    private JButton ButtonDataPembeli;
    private JButton ButtonDataTransaksi;
    private JPanel Pmenu;
    JFrame frame = new JFrame("SunBook Desktop APP");



    public Menu() {
        frame.add(Pmenu);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(640 , 480);
        frame.setVisible(true);
        frame.setResizable(false);

        ButtonDataBuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BukuView().setVisible(true);


            }
        });
        ButtonDataPembeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PembeliView().setVisible(true);
            }
        });
        ButtonDataTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TransaksiView().setVisible(true);


            }
        });
    }



}
