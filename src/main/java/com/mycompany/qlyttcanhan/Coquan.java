package com.mycompany.qlyttcanhan;

import java.util.Scanner;

public class Coquan extends Nguoi{
    String Dvicongtac;
    double Hesoluong;
    public Coquan() {
    }

    public Coquan(String Dvicongtac, double Hesoluong) {
        this.Dvicongtac = Dvicongtac;
        this.Hesoluong = Hesoluong;
    }

    public String getDvicongtac() {
        return Dvicongtac;
    }

    public void setDvicongtac(String Dvicongtac) {
        this.Dvicongtac = Dvicongtac;
    }

    public double getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(double Hesoluong) {
        this.Hesoluong = Hesoluong;
    }
    
    void Nhap(){
        super.NhapTT();
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap don vi cong tac: ");
        Dvicongtac = s.nextLine();
        System.out.println("Nhap he so luong: ");
        Hesoluong = s.nextInt();
    }

    @Override
    public String toString() {
        return "Coquan{" + "Dvicongtac=" + Dvicongtac + ", Hesoluong=" + Hesoluong + '}';
    }
    
    void Hienthi(){
        super.HienthiTT();
        System.out.println(""+toString());
    }


 
}
