package UKL_Lelang;

import java.util.ArrayList;

public class Masyarakat implements User{

    private ArrayList<String> namaMasyarakat = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        this.namaMasyarakat.add("Sukarmi");
        this.alamat.add("Blitar");
        this.telepon.add("081223445678");

        this.namaMasyarakat.add("Sumini");
        this.alamat.add("Malang");
        this.telepon.add("085806752070");
        
        this.namaMasyarakat.add("Sukarji");
        this.alamat.add("Kediri");
        this.telepon.add("087654332112");
    }

    public int getJmlMasyarakat() {
        return this.namaMasyarakat.size();
    }
    @Override
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }
    
    @Override
    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }
    
    @Override
    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }

}
