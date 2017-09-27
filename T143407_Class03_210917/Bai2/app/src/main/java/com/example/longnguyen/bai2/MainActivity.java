package com.example.longnguyen.bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnUpdate, btnCheck;
    EditText edt1, edt2, edtTotal;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        as();

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = 0;
                int max = 100;
                int a = randInt(min, max);
                int b = randInt(min, max);
                edt1.setText(" " + a);
                edt2.setText(" " + b);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int a = Integer.parseInt(edt1.getText().toString());
                    int b = Integer.parseInt(edt2.getText().toString());
                    int s = Integer.parseInt(edtTotal.getText().toString());
                    int total = a + b;
                    if (s == total) {
                        txtResult.setText("Bé giỏi quá");
                    } else {
                        txtResult.setText("Bé sai rồi kết quả là " + total);
                    }
                } catch (NumberFormatException e) {
                    e.getStackTrace();
                    Toast.makeText(MainActivity.this, "Bé nhập lại số nào", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private int randInt(int min, int max) {
        return min + (int) (Math.random() * max);
    }

    private void as() {
        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        edtTotal = (EditText) findViewById(R.id.editText3);
        btnUpdate = (Button) findViewById(R.id.buttonNew);
        btnCheck = (Button) findViewById(R.id.buttonCheck);
        txtResult = (TextView) findViewById(R.id.textViewResult);
    }
}
