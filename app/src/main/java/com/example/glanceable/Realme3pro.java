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

public class Realme3pro extends AppCompatActivity {
    MaterialCardView realme3prolistRoms, realme3protelegramGroup, realme3proxdaThread, realme3progoogleCamera;
    ImageView realme3proarrowButton;
    TextView realme3prolistCustomRom;
    ConstraintLayout realme3proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realme3pro);

        //Material Cards
        realme3prolistRoms = findViewById(R.id.realme3prolistRoms);
        realme3protelegramGroup = findViewById(R.id.realme3protelegramGroup);
        realme3proxdaThread = findViewById(R.id.realme3proxdaThread);
        realme3progoogleCamera = findViewById(R.id.realme3progoogleCamera);

        //Text/Image Button
        realme3proarrowButton = findViewById(R.id.realme3proarrowButton);
        realme3prolistCustomRom =findViewById(R.id.realme3prolistCustomRom);

        //Constraint Layout
        realme3proexpandedList = findViewById(R.id.realme3proexpandedList);

        setonClickListenerTextButton();
        setRealme3protelegramGroup();
        setRealme3proxdaThread();
        setRealme3progoogleCamera();
    }

    public void setonClickListenerTextButton(){
        realme3prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (realme3proexpandedList.getVisibility()== View.GONE){
                    realme3proexpandedList.setVisibility(View.VISIBLE);
                    realme3proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    realme3proexpandedList.setVisibility(View.GONE);
                    realme3proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRealme3protelegramGroup(){
        realme3protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/realme3pros"));
                startActivity(intent);
            }
        });
    }

    public void setRealme3proxdaThread(){
        realme3proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/realme-3-pro"));
                startActivity(intent);
            }
        });
    }

    public void setRealme3progoogleCamera(){
        realme3progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rm3prophoto"));
                startActivity(intent);
            }
        });
    }
}
