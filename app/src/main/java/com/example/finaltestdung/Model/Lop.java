package com.example.finaltestdung.Model;

import java.io.Serializable;

public class Lop implements Serializable {
    int id;
    String tenLop;
    String moTa;

    public Lop(int id, String tenLop, String moTa) {
        this.id = id;
        this.tenLop = tenLop;
        this.moTa = moTa;
    }

    public Lop(String tenLop, String moTa) {
        this.tenLop = tenLop;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
