package com.example.longnguyen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText c_dai, c_rong;
    TextView ketqua;
    Button tinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_dai= (EditText)findViewById(R.id.txtdai);
        c_rong= (EditText)findViewById(R.id.txtrong);
        tinh= (Button)findViewById(R.id.button1);
        ketqua=(TextView) findViewById(R.id.txtketqua);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cd=Integer.parseInt(c_dai.getText().toString());
                int cr=Integer.parseInt(c_rong.getText().toString());
                int dt= cd*cr;
                int cv= (cd+cr)*2;
                ketqua.setText("Diện tính hình Chữ Nhật là: "+dt+" và chu vi hình Chữ Nhật là: "+cv);

            }
        });




    }
}
