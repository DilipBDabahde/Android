package com.example.sum2nums;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btnClr, btnStrlen;
    EditText eText;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateLength();
    }

    public void calculateLength()
    {
        btnStrlen = (Button)findViewById(R.id.BtnStr_Length);
        btnClr    = (Button)findViewById(R.id.BtnClrString);
        tView = (TextView)findViewById(R.id.TextView_Result);

        btnStrlen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eText = (EditText)findViewById(R.id.EditText_ForString);
                int iCnt = eText.getText().toString().length();
                tView.setText("Total Characters Count is  :"+iCnt);
            }
        });

        //clear text
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText("");
                eText.getText().clear();  // same as tView.setText("")
            }
        });
    }
}