package com.example.camera_vid_rec;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import java.net.URI;


public class MainActivity extends AppCompatActivity {

    private static int VIDEO_REQUIEST =   1;
    private Uri videoURI = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void record_Vid(View v)
    {
        Intent videoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);

        if(videoIntent.resolveActivity(getPackageManager()) != null)
        {
            startActivityForResult(videoIntent, VIDEO_REQUIEST);
        }
    }

    public  void play_vid(View v)
    {
        Intent playIntent = new Intent(this, VideoPlayActivity.class);
        playIntent.putExtra("videoURI", videoURI.toString());
        startActivity(playIntent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == VIDEO_REQUIEST && resultCode ==  RESULT_OK)
        {
            videoURI = data.getData();
        }
    }
}