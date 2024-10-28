package com.example.QLKS.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "SuDungDichVu")
public class SuDungDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maSuDungDichVu")
    private int maSuDungDichVu;
    @ManyToOne
    @JoinColumn(name = "maDatPhong")
    private Booking booking;
    @ManyToOne
    @JoinColumn(name = "maDichVu")
    private DichVu dichVu;
    @ManyToOne
    @JoinColumn(name = "maPhong")
    private Phong phong;
    @Column(name = "soLuong")
    private int soLuong;

    public int getMaSuDungDichVu() {
        return maSuDungDichVu;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}

