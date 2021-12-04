package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import MODEL.PembeliModel;
import KONEKSI.koneksi;

public class PembeliController 
{
    koneksi conn = new koneksi();
    
    public void Simpan(PembeliModel PM)
    {
        conn.koneksiDataBase();
        String sql ="insert into tabel_pembeli(KodePembeli,NamaPembeli,NomorTeleponPembeli,AlamatPembeli)"
                   + "values ('"+PM.getKodePembeli()+"',"
                   + "'"+PM.getNamaPembeli()+"',"
                   + "'"+PM.getNomorTeleponPembeli()+"',"
                   + "'"+PM.getAlamatPembeli()+"')";
        
        try 
        {
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }
    }
    
    public void Update(PembeliModel PM)
    {
        conn.koneksiDataBase();
        
        try 
        {
            int id = PM.getIdPembeli();
            String kode = PM.getKodePembeli();
            String nama = PM.getNamaPembeli();
            String nope = PM.getNomorTeleponPembeli();
            String alamat = PM.getAlamatPembeli();
            
            String sql = "update tabel_pembeli "
                    + "set KodePembeli=('" + kode + "'),"
                    + "NamaPembeli=('" + nama + "'),"
                    + "NomorTeleponPembeli=('" + nope + "'),"
                    + "AlamatPembeli=('"+ alamat +"')"
                    + "where idPembeli=('" + id + "')";
            
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void Hapus(PembeliModel PM)
    {
        conn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tabel_pembeli where idPembeli=('"+PM.getIdPembeli()+"')"; 
           conn.st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terhapus");
        }
        
    }
    
}
