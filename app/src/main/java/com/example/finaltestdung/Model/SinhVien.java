package com.example.finaltestdung.Model;

import java.io.Serializable;

public class SinhVien implements Serializable {
    int id;
    String tenSV;

    String namSinh;
    String queQuan;
    String namHoc;

    public SinhVien(int id, String tenSV, String namSinh, String queQuan, String namHoc) {
        this.id = id;
        this.tenSV = tenSV;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.namHoc = namHoc;
    }

    public SinhVien(String tenSV, String namSinh, String queQuan, String namHoc) {
        this.tenSV = tenSV;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
        this.namHoc = namHoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }
}
