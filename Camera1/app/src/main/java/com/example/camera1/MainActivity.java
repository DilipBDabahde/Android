              package com.example.camera1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // class type variables
    private Button btnCapture;
    private ImageView imgCapture;
    private static final int image_Capture_Code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCapture = (Button)findViewById(R.id.button);
        imgCapture = (ImageView) findViewById(R.id.imageView);

        //switch to our camera app to system provided camera
        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iObj = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(iObj, image_Capture_Code);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == image_Capture_Code)
        {
            if(resultCode == RESULT_OK)
            {
                Bitmap bmap = (Bitmap)data.getExtras().get("data");
                imgCapture.setImageBitmap(bmap);
            }else if(resultCode == RESULT_CANCELED)
            {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            }
        }
    }
}