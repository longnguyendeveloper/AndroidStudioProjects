package com.example.us.bai2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    Button btnClear,btnWrite,btnLoad;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        as();
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText("");
            }
        });
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    FileOutputStream out = openFileOutput("dulieu.txt",MODE_PRIVATE);
                    String chuoi = edt.getText().toString();
                    out.write(chuoi.getBytes());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileInputStream in = openFileInput("dulieu.txt");
                    int size = in.available();
                    byte[] buffer = new byte[size];
                    in.read(buffer);
                    String chuoi = new String(buffer);
                    txtResult.setText(chuoi);
                    in.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void as()
    {
        btnClear = (Button)findViewById(R.id.button_Clear);
        btnWrite = (Button)findViewById(R.id.button_Write);
        btnLoad = (Button)findViewById(R.id.button_Load);
        txtResult = (TextView)findViewById(R.id.textView);
        edt = (EditText)findViewById(R.id.editText);
    }
}
