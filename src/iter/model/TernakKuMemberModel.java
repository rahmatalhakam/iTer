/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iter.model;

/**
 *
 * @author Rahmat Al Hakam
 */
public class TernakKuMemberModel {
    private int id, stok;
    private String ternak, tgl, lokasi, kontrak;

    public TernakKuMemberModel(int id, int stok, String ternak, String tgl, String lokasi, String kontrak) {
        this.id = id;
        this.stok = stok;
        this.ternak = ternak;
        this.tgl = tgl;
        this.lokasi = lokasi;
        this.kontrak = kontrak;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getTernak() {
        return ternak;
    }

    public void setTernak(String ternak) {
        this.ternak = ternak;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getKontrak() {
        return kontrak;
    }

    public void setKontrak(String kontrak) {
        this.kontrak = kontrak;
    }
    
    
}
