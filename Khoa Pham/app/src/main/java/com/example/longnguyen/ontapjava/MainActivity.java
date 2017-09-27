package com.example.longnguyen.ontapjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tạo mảng
        ArrayList<String> arrayName = new ArrayList<>();

        //thêm phần tử
        arrayName.add("Hà nội");
        arrayName.add("Nha trang");
        arrayName.add("Cần thơ");

        //lấy kích thước mảng - số lượng phàn tử
        Log.d("Long", "SIZE " + arrayName.size());
    }
}
