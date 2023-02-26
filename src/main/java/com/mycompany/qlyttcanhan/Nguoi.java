package com.mycompany.qlyttcanhan;

import java.util.Scanner;

public class Nguoi {
    String Hoten, Gioitinh;
    int Tuoi;
    public Nguoi() {
    }

    public Nguoi(String Hoten, String Gioitinh, int Tuoi) {
        this.Hoten = Hoten;
        this.Gioitinh = Gioitinh;
        this.Tuoi = Tuoi;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    
    void NhapTT(){
        System.out.println("Nhap ho va ten: ");
        Scanner s = new Scanner(System.in);
        Hoten = s.nextLine();
        System.out.println("Nhap gioi tinh: ");
        Gioitinh = s.nextLine();
        System.out.println("Nhap tuoi: ");
        Tuoi = s.nextInt();
    }
    
    void HienthiTT(){ 
    System.out.println("Nguoi{" + "Ho ten: " + Hoten + ", Gioi tinh: " + Gioitinh + ", Tuoi: " + Tuoi + '}');
    }

}
