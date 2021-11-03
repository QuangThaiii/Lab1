package com.example.lab1;

public class SanPham {
    int imgSp;
    String tvSp1;
    String tvSp2;

    public SanPham(int imgSp, String tvSp1, String tvSp2) {
        this.imgSp = imgSp;
        this.tvSp1 = tvSp1;
        this.tvSp2 = tvSp2;
    }

    public int getImgSp() {
        return imgSp;
    }

    public void setImgSp(int imgSp) {
        this.imgSp = imgSp;
    }

    public String getTvSp1() {
        return tvSp1;
    }

    public void setTvSp1(String tvSp1) {
        this.tvSp1 = tvSp1;
    }

    public String getTvSp2() {
        return tvSp2;
    }

    public void setTvSp2(String tvSp2) {
        this.tvSp2 = tvSp2;
    }
}
