package com.example.hello_sushil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnClear;
    EditText eText1, eText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.button1);
        btnClear = (Button)findViewById(R.id.button2);
        TextView tView = (TextView)findViewById(R.id.resultView);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int iNo1 = 0, iNo2 = 0;

                eText1 = (EditText)findViewById(R.id.inputText1);  //text value
                eText2 = (EditText)findViewById(R.id.inputText2);  //text value

                iNo1 = Integer.parseInt(eText1.getText().toString());
                iNo2 = Integer.parseInt(eText2.getText().toString());

                tView.setText("Addition is :"+(iNo1+iNo2));

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText("");
                eText1.getText().clear();
                eText2.getText().clear();
            }
        });


    }
}