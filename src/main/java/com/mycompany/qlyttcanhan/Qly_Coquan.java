package com.mycompany.qlyttcanhan;

import java.util.ArrayList;

public class Qly_Coquan {
    ArrayList<Coquan> DS_Coquan(int n){
        ArrayList<Coquan> arr = new ArrayList<>();
    for(int i=0; i<n; i++){
        Coquan c = new Coquan();
        c.Nhap();
        arr.add(c);
    }
    return arr;
    }
}
