package com.example.longnguyen.timsouocchungboichung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB;
    TextView txtKQ;
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
                    txtKQ.setText("UCLN: "+UCLN(a,b) + "\n" +"BCNN: "+ (a*b)/(UCLN(a,b)));
                }
                catch (NumberFormatException e)
                {
                    txtKQ.setText("Vui lòng nhập đúng định dạng! Xin thử lại");
                }




            }
        });
    }
    private void as()
    {
        edtA = (EditText)findViewById(R.id.editTextA);
        edtB = (EditText)findViewById(R.id.editTextB);
        txtKQ = (TextView)findViewById(R.id.textViewKQ);
        btnCal = (Button)findViewById(R.id.button);
    }

    private int UCLN(int a, int b)
    {
        while (a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b = b-a;
        }
        return (a);
    }


}
