package com.toko.buku.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yoel
 */
@Entity
@Table(name = "toko_buku")
public class TokoBuku implements Serializable{
    @Id
    @Column(name = "kd_buku", length = 45)
    private String kd_buku;
    @Column(name = "nama", length = 45)
    private String nama;
    @Column(name = "harga", length = 45)
    private int harga;
    @Column(name = "genre", length = 45)
    private String genre;

    public String getKd_buku() {
        return kd_buku;
    }

    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
