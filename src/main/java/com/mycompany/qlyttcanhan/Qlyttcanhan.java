package com.mycompany.qlyttcanhan;

import java.util.ArrayList;
import java.util.Scanner;

public class Qlyttcanhan {

    public static void main(String[] args) {
        Qly_Coquan ql = new Qly_Coquan();
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so luong can bo: ");
        int n = s.nextInt();
        ArrayList<Coquan> arr = ql.DS_Coquan(n);
        for(int i=0; i<arr.size(); i++){
            arr.get(i).Hienthi();
        }
    }
}
