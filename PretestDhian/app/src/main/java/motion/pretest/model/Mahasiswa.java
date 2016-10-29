package motion.pretest.model;

/**
 * Created by Dhian on 27/10/2016.
 */

public class Mahasiswa {
    private String nim,nama,alamat,foto, quotes;

    public Mahasiswa(String nim, String nama, String alamat, String foto, String quotes) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.foto = foto;
        this.quotes = quotes;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }
}
