package com.example.longnguyen.bai3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        as();
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> mangso = new ArrayList<Integer>();
                for (int i = 1; i <= 52; i++) {
                    mangso.add(i + 1);
                }
                Collections.shuffle(mangso);
                String chuoi = "Dãy máy: ";
                for (int i = 0; i < 13; i++) {
                    chuoi += mangso.get(i) + " ";
                }
                txtKQ.setText(chuoi);
            }
        });

    }

    private void as() {
        btnCal = (Button) findViewById(R.id.button_Cal);
        txtKQ = (TextView) findViewById(R.id.textView_KQ);
    }
}
