package com.example.longnguyen.doiduonglichsangamlich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txtKQ;
    EditText edtYear;
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
                    int a = Integer.parseInt(edtYear.getText().toString());
                    txtKQ.setText(doinam(a));


                }
                catch (NumberFormatException e)
                {

                }
            }
        });




    }
    private void as()
    {
        edtYear = (EditText)findViewById(R.id.editYear);
        txtKQ = (TextView)findViewById(R.id.textViewKQ);
        btnCal = (Button)findViewById(R.id.buttonCal);
    }

    private String doinam(int a)
    {
        String tmpString = null;
        int can = a%10;
        int chi = a%12;
        switch (can)
        {
            case 0: tmpString = "Canh";
                break;
            case 1: tmpString = "Tân";
                break;
            case 2: tmpString = "Nhâm";
                break;
            case 3: tmpString = "Quý";
                break;
            case 4: tmpString = "Giáp";
                break;
            case 5: tmpString = "Ất";
                break;
            case 6: tmpString = "Bính";
                break;
            case 7: tmpString = "Đinh";
                break;
            case 8: tmpString = "Mậu";
                break;
            case 9: tmpString = "Kỷ";
                break;

        }

        switch (chi)
        {
            case 0: tmpString = tmpString+"Thân";
                break;
            case 1: tmpString = tmpString+"Dậu";
                break;
            case 2: tmpString = tmpString+"Tuất";
                break;
            case 3: tmpString = tmpString+"Hợi";
                break;
            case 4: tmpString = tmpString+"Tý";
                break;
            case 5: tmpString = tmpString+"Sửu";
                break;
            case 6: tmpString = tmpString+"Dần";
                break;
            case 7: tmpString = tmpString+"Mẹo";
                break;
            case 8: tmpString = tmpString+"Thìn";
                break;
            case 9: tmpString = tmpString+"Tị";
                break;
            case 10: tmpString = tmpString+"Ngọ";
                break;
            case 11: tmpString = tmpString+"Mùi";
                break;
        }
        return tmpString;


    }
}
