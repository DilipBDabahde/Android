package com.myfirstapp.mymultiplicationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText eText1, eText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this below btn1 is used to perform div which is accepted value from user in input text
        Button btn1 = (Button)findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eText1 = (EditText)findViewById(R.id.editTextTextPersonName3);
                eText2 = (EditText)findViewById(R.id.editTextTextPersonName4);

                float f1 = Float.parseFloat(eText1.getText().toString());
                float f2 = Float.parseFloat(eText2.getText().toString());
                float result  = f1 / f2;

                TextView tview = (TextView)findViewById(R.id.textView5);
                tview.setText("Div is: "+result);
            }
        });

        //to clear entered values
        Button btn2 = (Button)findViewById(R.id.button5);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eText1.setText("");
                eText2.setText("");
            }
        });

    }
}