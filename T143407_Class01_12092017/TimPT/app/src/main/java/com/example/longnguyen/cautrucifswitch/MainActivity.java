package com.example.longnguyen.cautrucifswitch;

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

                try{
                    int a = Integer.parseInt(edtA.getText().toString());
                    int b = Integer.parseInt(edtB.getText().toString());

                    if(a!=0)
                    {
                        int x = -b/a;
                        txtKQ.setText("PT có nghiệm duy nhất: " +x);
                    }
                    else
                    {
                        if(b!=0)
                        {
                            txtKQ.setText("VÔ NGHIỆM");

                        }
                        else
                        {
                            txtKQ.setText("Nghiệm đúng với mọi X");
                        }
                    }



                }
                catch (NumberFormatException e){
                    txtKQ.setText("Vui lòng nhập đúng định dạng");

                }
            }
        });
    }

    private void as()
    {
        edtA = (EditText)findViewById(R.id.editA);
        edtB = (EditText)findViewById(R.id.editB);
        btnCal = (Button)findViewById(R.id.buttonCal);
        txtKQ = (TextView)findViewById(R.id.textViewKQ);
    }
}
