package com.example.longnguyen.hinhthang_t143407;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtCC, edtDL, edtDN;
    TextView  txtDT;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int a = Integer.parseInt(edtDL.getText().toString());
                    int b = Integer.parseInt(edtDN.getText().toString());
                    int c = Integer.parseInt(edtCC.getText().toString());
                    int dt = c * ((a + b) / 2);
                    if(a==0||b==0||c==0){
                        Toast.makeText(MainActivity.this,"Vui lòng nhập số lớn hơn 0",Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this,"Diện tích: "+dt,Toast.LENGTH_SHORT).show();
                    }
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,"Vui lòng nhập đúng định dạng!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void Anhxa()
    {
        edtCC = (EditText)findViewById(R.id.editCC);
        edtDL= (EditText)findViewById(R.id.editDL);
        edtDN=(EditText)findViewById(R.id.editDN);
        txtDT= (TextView)findViewById(R.id.textDT);
        button= (Button)findViewById(R.id.button1);
    }
}
