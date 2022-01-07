package com.example.glanceable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class XiaomiRedmi5aRiva extends AppCompatActivity {
    MaterialCardView redmi5alistRoms, redmi5atelegramGroup, redmi5axdaThread, redmi5agoogleCamera;
    ImageView redmi5aarrowButton;
    TextView redmi5alistCustomRom;
    ConstraintLayout redmi5aexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi5a_riva);

        //Material Cards
        redmi5alistRoms = findViewById(R.id.redmi5alistRoms);
        redmi5atelegramGroup = findViewById(R.id.redmi5atelegramGroup);
        redmi5axdaThread = findViewById(R.id.redmi5axdaThread);
        redmi5agoogleCamera = findViewById(R.id.redmi5agoogleCamera);

        //Image/Text Button
        redmi5aarrowButton = findViewById(R.id.redmi5aarrowButton);
        redmi5alistCustomRom = findViewById(R.id.redmi5alistCustomRom);

        //Constraint Layout
        redmi5aexpandedList = findViewById(R.id.redmi5aexpandedList);

        setRedmi5alistCustomRom();
        setRedmi5atelegramGroup();
        setRedmi5axdaThread();
        setRedmi5agoogleCamera();
    }

    public void setRedmi5alistCustomRom(){
        redmi5aexpandedList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmi5aexpandedList.getVisibility()==View.GONE){
                    redmi5aexpandedList.setVisibility(View.VISIBLE);
                    redmi5aarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redmi5aexpandedList.setVisibility(View.GONE);
                    redmi5aarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmi5atelegramGroup(){
        redmi5atelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Redmi_5a"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi5axdaThread(){
        redmi5axdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/xiaomi-redmi-5a"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi5agoogleCamera(){
        redmi5agoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rovaphotography"));
                startActivity(intent);
            }
        });
    }
}
