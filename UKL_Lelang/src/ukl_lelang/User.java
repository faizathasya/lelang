package UKL_Lelang;

public interface User {

    public void setNama(String nama);

    /**
     *
     * @param alamat
     */
    public void setAlamat(String alamat);

    public void setTelepon(String telepon);

    public String getNama(int id);

    public String getAlamat(int id);

    public String getTelepon(int id);
}
