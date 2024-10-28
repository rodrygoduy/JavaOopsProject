package com.example.QLKS.entities;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maHoaDon")
    private int maHoaDon;
    @ManyToOne
    @JoinColumn(name = "maDatPhong")
    private Booking booking;
    @Column(name = "thoiGianLapHoaDon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGianLapHoaDon;
    @Enumerated(EnumType.STRING)
    @Column(name = "phuongThucThanhToan")
    private PhuongThucThanhToan phuongThucThanhToan;
    @Column(name = "tongTien")
    private double tongTien;
    @Enumerated(EnumType.STRING)
    @Column(name = "trangThaiThanhToan")
    private TrangThaiThanhToan trangThaiThanhToan;
    public enum PhuongThucThanhToan {
        TIEN_MAT, THE_NGAN_HANG
    }
    public enum TrangThaiThanhToan {
        CHUA_THANH_TOAN, DA_THANH_TOAN
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Date getThoiGianLapHoaDon() {
        return thoiGianLapHoaDon;
    }

    public void setThoiGianLapHoaDon(Date thoiGianLapHoaDon) {
        this.thoiGianLapHoaDon = thoiGianLapHoaDon;
    }

    public PhuongThucThanhToan getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public TrangThaiThanhToan getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(TrangThaiThanhToan trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }
}
