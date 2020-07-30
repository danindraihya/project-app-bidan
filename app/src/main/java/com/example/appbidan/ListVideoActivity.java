package com.example.appbidan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ListVideoActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_video);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListVideoActivity.this, VideoActivity.class);
                intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.video1);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListVideoActivity.this, VideoActivity.class);
                intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.video2);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListVideoActivity.this, VideoActivity.class);
                intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.video3);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListVideoActivity.this, VideoActivity.class);
                intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.video4);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListVideoActivity.this, VideoActivity.class);
                intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.video5);
                startActivity(intent);
            }
        });

    }
}