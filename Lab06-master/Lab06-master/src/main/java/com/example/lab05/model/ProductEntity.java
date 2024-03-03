package com.example.lab05.model;

import javax.persistence.*;

@Entity
@Table(name = "Product", schema = "dbo", catalog = "Lab05_Hibernate")
public class ProductEntity implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic(optional = false)
    @Column(name = "MaSP")
    private String maSp;
    @Basic
    @Column(name = "TenSP")
    private String tenSp;
    @Basic
    @Column(name = "AnhSP")
    private String anhSp;
    @Basic
    @Column(name = "SoLuong")
    private Integer soLuong;
    @Basic
    @Column(name = "DonGia")
    private Double donGia;
    @Basic
    @Column(name = "TrangThai")
    private Boolean trangThai;

    public ProductEntity(){}
    public ProductEntity(String maSp){
        this.maSp = maSp;
    }
    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getAnhSp() {
        return anhSp;
    }

    public void setAnhSp(String anhSp) {
        this.anhSp = anhSp;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (maSp != null ? !maSp.equals(that.maSp) : that.maSp != null) return false;
        if (tenSp != null ? !tenSp.equals(that.tenSp) : that.tenSp != null) return false;
        if (anhSp != null ? !anhSp.equals(that.anhSp) : that.anhSp != null) return false;
        if (soLuong != null ? !soLuong.equals(that.soLuong) : that.soLuong != null) return false;
        if (donGia != null ? !donGia.equals(that.donGia) : that.donGia != null) return false;
        if (trangThai != null ? !trangThai.equals(that.trangThai) : that.trangThai != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maSp != null ? maSp.hashCode() : 0;
        result = 31 * result + (tenSp != null ? tenSp.hashCode() : 0);
        result = 31 * result + (anhSp != null ? anhSp.hashCode() : 0);
        result = 31 * result + (soLuong != null ? soLuong.hashCode() : 0);
        result = 31 * result + (donGia != null ? donGia.hashCode() : 0);
        result = 31 * result + (trangThai != null ? trangThai.hashCode() : 0);
        return result;
    }
}
