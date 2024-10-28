package com.example.QLKS.entities;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDatPhong ;

    private Date ngayNhanPhong;
    private Date ngayTraPhong;
    @ManyToOne
    @JoinColumn(name = "maKhachHang")
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "maPhong")
    private Phong phong;
    @ManyToOne
    @JoinColumn(name = "maNhanVien")
    private NhanVien nhanVien;
    private double giaPhongThucTe;
    @Enumerated(EnumType.STRING)
    @Column(name = "trangThaiDatPhong")
    private TrangThaiDatPhong trangThaiDatPhong;
    public enum TrangThaiDatPhong {
        da_dat,
        dang_su_dung,
        con_trong,
        dang_don_dep
    }

    public int getMaDatPhong() {
        return maDatPhong;
    }

    public Date getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(Date ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public Date getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(Date ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public double getGiaPhongThucTe() {
        return giaPhongThucTe;
    }

    public void setGiaPhongThucTe(double giaPhongThucTe) {
        this.giaPhongThucTe = giaPhongThucTe;
    }

    public TrangThaiDatPhong getTrangThaiDatPhong() {
        return trangThaiDatPhong;
    }

    public void setTrangThaiDatPhong(TrangThaiDatPhong trangThaiDatPhong) {
        this.trangThaiDatPhong = trangThaiDatPhong;
    }
}