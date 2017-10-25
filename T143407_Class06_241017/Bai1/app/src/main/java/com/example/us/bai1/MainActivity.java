package com.example.us.bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        as();
        InputStream in = null;
        try {
            in = getAssets().open("cadao.txt");
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            String chuoi = new String(buffer);
            txt.setText(chuoi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void as() {
        txt = (TextView) findViewById(R.id.textView);
    }
}
