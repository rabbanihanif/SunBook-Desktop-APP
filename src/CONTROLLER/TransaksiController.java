package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import KONEKSI.koneksi;
import MODEL.TransaksiModel;

public class TransaksiController 
{
    koneksi conn = new koneksi();
    
    public void simpanNota(TransaksiModel transaksimodel)
    {
        conn.koneksiDataBase();
        String sql ="insert into tabel_nota(NoNota,KodePembeli,NamaPembeli,TanggalPembeli)"
                   + "values ('"+transaksimodel.getNoNota()+"',"
                   + "'"+transaksimodel.getKodePembeli()+"',"
                   + "'"+transaksimodel.getNamaPembeli()+"',"
                   + "'"+transaksimodel.getTanggalPembeli()+"')";
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
    
    public void updateNota (TransaksiModel transaksimodel)
    {
        conn.koneksiDataBase();
        
        try 
        {
            String NoNota = transaksimodel.getNoNota();
            String KodePembeli = transaksimodel.getKodePembeli();
            String NamaPembeli = transaksimodel.getNamaPembeli();
            String Tanggal = transaksimodel.getTanggalPembeli();
            
            String sql = "update tabel_nota "
                    + "set NoNota = ('" + NoNota + "'),"
                    + "KodePembeli = ('" + KodePembeli + "'),"
                    + "NamaPembeli = ('" + NamaPembeli + "'),"
                    + "TanggalPembeli = ('"+ Tanggal +"')"
                    + "where NoNota = ('" + NoNota + "')";
            
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void hapusNota (TransaksiModel transaksimodel)
    {
        conn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tabel_nota where NoNot a= ('"+transaksimodel.getNoNota()+"')"; 
           conn.st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terhapus");
        }
    }

    public void simpan(TransaksiModel transaksimodel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //////////////////////////////////////////////////////////////////////////////
    
    public void simpanPembelian(TransaksiModel transaksimodel)
    {
        conn.koneksiDataBase();
        String sql ="insert into tabel_pembelian(NoNota,KodeBuku,JenisBuku,JudulBuku,PenerbitBuku,HargaBuku)"
                   + "values ('"+transaksimodel.getNoNota()+"',"
                   + "'"+transaksimodel.getKodeBuku()+"',"
                   + "'"+transaksimodel.getJenisBuku()+"',"
                   + "'"+transaksimodel.getJudulBuku()+"',"
                   + "'"+transaksimodel.getPenerbitBuku()+"',"
                   + "'"+transaksimodel.getHargaBuku()+"')";
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
    
    public void updatePembelian (TransaksiModel transaksimodel)
    {
        conn.koneksiDataBase();
        
        try 
        {
            String NoNota = transaksimodel.getNoNota();
            String KodeBuku = transaksimodel.getKodeBuku();
            String JenisBuku = transaksimodel.getJenisBuku();
            String JudulBuku = transaksimodel.getJudulBuku();
            String PenerbitBuku = transaksimodel.getPenerbitBuku();
            int HargaBuku = transaksimodel.getHargaBuku();
            
            String sql = "update tabel_pembelian "
                    + "set NoNota = ('" + NoNota + "'),"
                    + "KodeBuku = ('" + KodeBuku + "'),"
                    + "JenisBuku = ('" + JenisBuku + "'),"
                    + "JudulBuku = ('" + JudulBuku + "'),"
                    + "PenerbitBuku = ('" + PenerbitBuku + "'),"
                    + "HargaBuku = ('"+ HargaBuku +"')"
                    + "where NoNota = ('" + NoNota + "')";
            
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void hapusPembelian (TransaksiModel transaksimodel)
    {
        conn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tabel_pembelian where NoNota = ('"+transaksimodel.getNoNota()+"')"; 
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
