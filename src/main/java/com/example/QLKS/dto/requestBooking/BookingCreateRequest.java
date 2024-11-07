package com.example.QLKS.dto.requestBooking;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class BookingCreateRequest {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date ngayNhanPhong;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date ngayTraPhong;
    private int maKhachHang;
    private int maPhong;
    private double giaPhongThucTe;
    private String trangThaiDatPhong;


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

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }



    public double getGiaPhongThucTe() {
        return giaPhongThucTe;
    }

    public void setGiaPhongThucTe(double giaPhongThucTe) {
        this.giaPhongThucTe = giaPhongThucTe;
    }

    public String getTrangThaiDatPhong() {
        return trangThaiDatPhong;
    }

    public void setTrangThaiDatPhong(String trangThaiDatPhong) {
        this.trangThaiDatPhong = trangThaiDatPhong;
    }
}
