package com.example.longnguyen.bai3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    EditText edtDen, edtDi;
    Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        as();
    }
    private void as()
    {
        edtDen = (EditText)findViewById(R.id.editTextDen);
        edtDi = (EditText)findViewById(R.id.editTextDi);
        btnCal = (Button)findViewById(R.id.buttonCal);
        txtKQ = (TextView)findViewById(R.id.textViewKQ);
    }
}
