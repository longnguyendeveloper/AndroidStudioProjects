package com.example.longnguyen.array;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    EditText edtDNN;
    Button btnCreate, btnXX, btnXN, btnTMinMax, btnTang, btnRand, btnTTong;
    int mang[] = new int[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        as();
        //Xử lý Button
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rd = new Random();
                String chuoi = " ";
                for (int i = 0; i < 10; i++) {
                    mang[i] = rd.nextInt(50 - 10 + 1) + 10;
                }
                DocManhRaEditText();

            }
        });
        btnXX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DocManhRaEditText();
                String tmp ="";
                for(int i =0;i<10;i++){
                    tmp+=mang[i]+"";
                }
                txtKQ.setText(tmp);
            }
        });

        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi="";
                for(int i=9;i>=0;i--){
                    chuoi=chuoi+mang[i]+"";
                }
                txtKQ.setText(chuoi);
            }
        });

        btnTMinMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int min = mang[0];
                int max = mang[0];
                for (int i = 0; i < 10; i++) {
                    if (mang[i] < min)
                        min = mang[i];
                    if (mang[i] > max)
                        max = mang[i];
                }
                txtKQ.setText("Min: " + min + " Max: " + max);
            }
        });
        btnTang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bubbleSort(mang);
            }
        });

        btnRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shufferArray(mang);
            }
        });

        btnTTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kq = String.valueOf(mang[0] + mang[1] + mang[2]);
                txtKQ.setText(kq);
            }
        });
    }

    private void as() {
        txtKQ = (TextView) findViewById(R.id.textViewKQ);
        edtDNN = (EditText) findViewById(R.id.editTextDNN);
        btnCreate = (Button) findViewById(R.id.buttonCreate);
        btnXX = (Button) findViewById(R.id.buttonXX);
        btnXN = (Button) findViewById(R.id.buttonXN);
        btnTMinMax = (Button) findViewById(R.id.buttonTMinMax);
        btnTang = (Button) findViewById(R.id.buttonTang);
        btnRand = (Button) findViewById(R.id.buttonRand);
        btnTTong = (Button) findViewById(R.id.buttonTTong);
    }

    private void DocManhRaEditText() {
        String chuoi = "";
        for (int i = 0; i < 10; i++) {
            chuoi += mang[i] + " ";
        }
        edtDNN.setText(chuoi);
    }

    private void bubbleSort(int[] tmpArray) {
        int n = tmpArray.length;
        int tmp = 0;
        for (int i = 0; i < tmpArray.length; i++) {
            for (int j = 1; j < (tmpArray.length - i); j++) {
                if (mang[j - 1] > tmpArray[j]) {
                    tmp = tmpArray[j - 1];
                    tmpArray[j - 1] = tmpArray[j];
                    tmpArray[j] = tmp;
                }
            }
        }

        String chuoi = "";
        for (int i = 0; i < 10; i++) {
            chuoi += tmpArray[i] + " ";
        }

        txtKQ.setText(chuoi);
    }

    private void DaoMang() {
    }

    private void shufferArray(int[] tmArray) {
        Random rd = new Random();

        for (int i = tmArray.length - 1; i > 0; i--) {
            int index = rd.nextInt(i + 1);
            int a = tmArray[index];
            tmArray[index] = tmArray[i];
            tmArray[i] = a;
        }

        String chuoi="";
        for(int i=0;i<10;i++){
            chuoi+=tmArray[i]+"";
        }
        txtKQ.setText(chuoi);
    }
}
