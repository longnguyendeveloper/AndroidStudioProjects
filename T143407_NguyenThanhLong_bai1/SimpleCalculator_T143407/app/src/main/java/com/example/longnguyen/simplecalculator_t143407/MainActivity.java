package com.example.longnguyen.simplecalculator_t143407;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB;
    TextView txtA, txtB, txtC, txtD;
    Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(edtA.getText().toString());
                    int b = Integer.parseInt(edtB.getText().toString());
                    int kqA = a + b;
                    int kqB = a - b;
                    int kqC = a * b;

                    if (b == 0) {
                        Toast.makeText(MainActivity.this, "B phải là một số khác 0", Toast.LENGTH_SHORT).show();
                    } else {
                        int kqD = a / b;
                        txtA.setText("A+B= " + kqA);
                        txtB.setText("A-B= " + kqB);
                        txtC.setText("A*B= " + kqC);
                        txtD.setText("A/B= " + kqD);
                    }
                } catch (NumberFormatException e) {
                        Toast.makeText(MainActivity.this,"Vui lòng nhập đúng định dạng!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void Anhxa() {
        edtA = (EditText)findViewById(R.id.txtA);
        edtB= (EditText)findViewById(R.id.txtB);
        txtA= (TextView)findViewById(R.id.ketquaA);
        txtB= (TextView)findViewById(R.id.ketquaB);
        txtC= (TextView)findViewById(R.id.ketquaC);
        txtD= (TextView)findViewById(R.id.ketquaD);
        btnCal= (Button)findViewById(R.id.btnCal);
    }
}
