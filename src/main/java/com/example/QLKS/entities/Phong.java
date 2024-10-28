package com.example.QLKS.entities;

import com.example.QLKS.TrangThai.TrangThaiPhong;
import jakarta.persistence.*;

@Entity
@Table(name = "Phong")
public class Phong {
    @Id
    private int maPhong ;
    private String loaiPhong;
    private double giaPhong;

    @Enumerated(EnumType.STRING)
    private TrangThaiPhong trangThaiPhong;

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public TrangThaiPhong getTrangThaiPhong() {
        return trangThaiPhong;
    }

    public void setTrangThaiPhong(TrangThaiPhong tranThaiPhong) {
        this.trangThaiPhong = tranThaiPhong;
    }
}
