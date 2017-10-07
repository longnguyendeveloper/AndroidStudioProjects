package com.example.longnguyen.bai2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    Button btnCal;
    EditText edt7so;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        as();
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    Set<Integer> day = new HashSet<Integer>();
                    String str = edt7so.getText().toString();
                    String[] mangchuoi = str.split(" ");
                    for (String ele : mangchuoi) {
                        if (ele.startsWith("-")) {
                            Toast.makeText(MainActivity.this, "Vui lòng nhập số lớn hơn 0", Toast.LENGTH_SHORT).show();
                            break;
                        } else {
                            day.clear();
                            if (mangchuoi.length <= 7) {
                                for (int i = 0; i < mangchuoi.length; i++) {
                                    day.add(Integer.parseInt(mangchuoi[i]));
                                }
                                String chuoi = "";
                                for (Integer i : day) {
                                    chuoi += i + " ";
                                }
                                txtKQ.setText(chuoi);
                            } else {
                                Toast.makeText(MainActivity.this, "Vui lòng nhập nhỏ hơn hoặc bằng 7 ký tự!", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }

                }
                catch (NumberFormatException e)
                {
                    //txtKQ.setText("Vui lòng nhập số tự nhiên!");
                    Toast.makeText(MainActivity.this,("Vui lòng nhập số tự nhiên!"),Toast.LENGTH_SHORT).show();
                }


            }

        });
    }

    private void as() {
        txtKQ = (TextView) findViewById(R.id.textView_KQ);
        btnCal = (Button)findViewById(R.id.button_Cal);
        edt7so = (EditText)findViewById(R.id.editText_7so);
    }
}
