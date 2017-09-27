package com.example.us.bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    Button btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        as();
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = -10;
                int max = 10;
                int a = RanInt(min, max);
                int b = RanInt(min, max);
                int c = RanInt(min, max);
                String result = "";
                float delta = b * b - 4 * a * c;
                if (a != 0) {
                    if (delta < 0) {
                        result = "PT vô nghiệm!";
                    } else if (delta == 0) {
                        result = "PT có nghiệm kép: " + (-b / 2 * a);
                    } else {
                        result = "PT có nghiệm phân biệt: " + ((-b + Math.sqrt(delta)) / (2 * a) + "Và " + ((-b + Math.sqrt(delta)) / (2 * a)));
                    }
                } else {
                    if (b == 0) {
                        if (c == 0) {
                            result = "PT có vô số nghiệm!";
                        } else {
                            result = "PT vô nghiệm!";
                        }
                    } else {
                        result = "PT bậc 1: " + -c / b;
                    }
                }
                txtKQ.setText("a = " + a + "\n"
                        + "b = " + b + "\n"
                        + "c = " + c + "\n"
                        + "Kết quả: " + result);
            }
        });
    }

    private void as() {
        btnRandom = (Button) findViewById(R.id.button);
        txtKQ = (TextView) findViewById(R.id.textViewKQ);
    }

    private int RanInt(int min, int max) {
        return (min + (int) (Math.random() * (max - min) + 1));

    }
}
