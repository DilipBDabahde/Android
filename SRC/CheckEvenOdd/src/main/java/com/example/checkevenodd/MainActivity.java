package com.example.checkevenodd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //user defined classes varibles are created
    EditText eText;
    TextView tView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myfunction();
    }

    public void myfunction() {

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eText = (EditText)findViewById(R.id.EditText1);
                int ival = Integer.parseInt(eText.getText().toString());

                tView = (TextView)findViewById(R.id.TextView2);

                if(ival  % 2 == 0)
                {
                    tView.setText(ival +" is Even Number");
                }
                else
                {
                    tView.setText(ival +" is Odd Number");
                }
            }
        });
    }
}