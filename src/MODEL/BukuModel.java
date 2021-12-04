package MODEL;


public class BukuModel 
{
    private String KodeBuku,JenisBuku,JudulBuku,PenerbitBuku;
    private int idBuku,HargaBuku,Stok;

    public String getKodeBuku() {
        return KodeBuku;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public String getJenisBuku() {
        return JenisBuku;
    }

    public void setJenisBuku(String JenisBuku) {
        this.JenisBuku = JenisBuku;
    }

    public String getJudulBuku() {
        return JudulBuku;
    }
    
    public void setJudulBuku(String JudulBuku) {
        this.JudulBuku = JudulBuku;
    }

    public String getPenerbitBuku() {
        return PenerbitBuku;
    }

    public void setPenerbitBuku(String PenerbitBuku) {
        this.PenerbitBuku = PenerbitBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public int getHargaBuku() {
        return HargaBuku;
    }

    public void setHargaBuku(int HargaBuku) {
        this.HargaBuku = HargaBuku;
    }

//    public void setKodeBuku(String kodebuku) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
    
}
