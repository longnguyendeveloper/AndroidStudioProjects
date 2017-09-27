package com.example.longnguyen.tongsotunhien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText so_N;
    Button bt_th;
    TextView tv_day,tv_tong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        as();

        bt_th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {

                    int N = Integer.parseInt(so_N.getText().toString());
                    if(N>0)
                    {
                        int tong = 0;
                        String chuoi="";
                        for(int i=1;i<=N;i++)
                        {
                            chuoi+= String.valueOf(i);
                            chuoi+=(i!=N)?"+":"";
                        }
                        for(int i=1;i<=N;i++)
                        {
                            tong+=i;
                        }
                        tv_day.setText("S="+chuoi);
                        tv_tong.setText("S="+tong);
                    }
                    else
                    {
                        tv_tong.setText("Vui lòng nhập số lớn hơn 0");
                    }


                }
                catch (NumberFormatException e)
                {
                    tv_tong.setText("Vui lòng nhập đúng định dạng!");
                    tv_day.setText("");
                }



            }
        });
    }

    private void as()
    {
        so_N=(EditText)findViewById(R.id.editTextSo_N);
        bt_th=(Button)findViewById(R.id.buttonTh);
        tv_day=(TextView)findViewById(R.id.textViewDay);
        tv_tong=(TextView)findViewById(R.id.textViewTong);


    }
}
