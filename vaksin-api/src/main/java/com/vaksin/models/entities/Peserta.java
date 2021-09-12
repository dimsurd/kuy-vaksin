package com.vaksin.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "tbl_peserta")
public class Peserta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    long nik;

    @Column(length = 100)
    String namapeserta;

    @Column(length = 500)
    String alamat;

    
    String email;

    @Column(length = 20)
    String nomortelepon;

    public Peserta() {
    }

    public Peserta(long id, long nik, String namapeserta, String alamat, String email, String nomortelepon) {
        this.id = id;
        this.nik = nik;
        this.namapeserta = namapeserta;
        this.alamat = alamat;
        this.email = email;
        this.nomortelepon = nomortelepon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNik() {
        return nik;
    }

    public void setNik(long nik) {
        this.nik = nik;
    }

    public String getNamapeserta() {
        return namapeserta;
    }

    public void setNamapeserta(String namapeserta) {
        this.namapeserta = namapeserta;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomortelepon() {
        return nomortelepon;
    }

    public void setNomortelepon(String nomortelepon) {
        this.nomortelepon = nomortelepon;
    }
    



}
