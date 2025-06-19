package com.example.veapp.model;

public class Ve {
    private String maVe;
    private String tenKhachHang;
    private String tenChuyenBay;
    private double gia;

    public Ve(String maVe, String tenKhachHang, String tenChuyenBay, double gia) {
        this.maVe = maVe;
        this.tenKhachHang = tenKhachHang;
        this.tenChuyenBay = tenChuyenBay;
        this.gia = gia;
    }

    public String getMaVe() { return maVe; }
    public String getTenKhachHang() { return tenKhachHang; }
    public String getTenChuyenBay() { return tenChuyenBay; }
    public double getGia() { return gia; }

    public void setMaVe(String maVe) { this.maVe = maVe; }
    public void setTenKhachHang(String tenKhachHang) { this.tenKhachHang = tenKhachHang; }
    public void setTenChuyenBay(String tenChuyenBay) { this.tenChuyenBay = tenChuyenBay; }
    public void setGia(double gia) { this.gia = gia; }
}
