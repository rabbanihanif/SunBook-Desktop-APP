package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import KONEKSI.koneksi;
import MODEL.BukuModel;

public class BukuController 
{
    koneksi conn = new koneksi();
    
    public void simpan(BukuModel bukumodel)
    {
        conn.koneksiDataBase();
        String sql ="insert into tabel_buku(KodeBuku,JenisBuku,JudulBuku,PenerbitBuku,HargaBuku,Stok)"
                   + "values ('"+bukumodel.getKodeBuku()+"',"
                   + "'"+bukumodel.getJenisBuku()+"',"
                   + "'"+bukumodel.getJudulBuku()+"',"
                   + "'"+bukumodel.getPenerbitBuku()+"',"
                   + "'"+bukumodel.getHargaBuku()+"',"
                   + "'"+bukumodel.getStok()+"')";
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
    
    public void update (BukuModel bukumodel)
    {
        conn.koneksiDataBase();
        
        try 
        {
            int id = bukumodel.getIdBuku();
            String kode = bukumodel.getKodeBuku();
            String jenis = bukumodel.getJenisBuku();
            String judul = bukumodel.getJudulBuku();
            String penerbit = bukumodel.getPenerbitBuku();
            int harga = bukumodel.getHargaBuku();
            int stok = bukumodel.getStok();
            
            String sql = "update tabel_buku "
                    + "set KodeBuku=('" + kode + "'),"
                    + "JenisBuku=('" + jenis + "'),"
                    + "JudulBuku=('" + judul + "'),"
                    + "PenerbitBuku=('"+ penerbit +"'),"
                    + "HargaBuku=('"+ harga +"'),"
                    + "Stok=('"+ stok +"')"
                    + "where idBuku=('" + id + "')";
            
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void hapus(BukuModel bukumodel)
    {
        conn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tabel_buku where idBuku=('"+bukumodel.getIdBuku()+"')"; 
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
