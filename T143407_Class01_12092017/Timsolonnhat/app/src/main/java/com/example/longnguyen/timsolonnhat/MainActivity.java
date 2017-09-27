package com.example.longnguyen.timsolonnhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    EditText edtA, edtB;
    Button btnCal;

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
                    int a = Integer.parseInt(edtA.getText().toString());
                    int b = Integer.parseInt(edtB.getText().toString());
                    if(a>b)
                    {
                        txtKQ.setText(""+a);
                    }
                    else
                    {
                        txtKQ.setText(""+b);
                    }
                }
                catch (NumberFormatException e)
                {
                    txtKQ.setText("Vui lòng nhập đúng định dạng");
                }

            }
        });



    }
    private void as()
    {
        edtA = (EditText)findViewById(R.id.editTextA);
        edtB = (EditText)findViewById(R.id.editTextB);
        btnCal = (Button)findViewById(R.id.ButtonCal);
        txtKQ = (TextView)findViewById(R.id.textViewKQ);
    }
}
