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

public class Realme5pro extends AppCompatActivity {
    MaterialCardView realme5prolistRoms, realme5protelegramGroup, realme5proxdaThread, realme5progoogleCamera;
    ImageView realme5proarrowButton;
    TextView realme5prolistCustomRom;
    ConstraintLayout realme5proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realme5pro);

        //Material Cards
        realme5prolistRoms = findViewById(R.id.realme5prolistRoms);
        realme5protelegramGroup = findViewById(R.id.realme5protelegramGroup);
        realme5proxdaThread = findViewById(R.id.realme5proxdaThread);
        realme5progoogleCamera = findViewById(R.id.realme5progoogleCamera);

        //Text/Image Button
        realme5proarrowButton = findViewById(R.id.realme5proarrowButton);
        realme5prolistCustomRom = findViewById(R.id.realme5prolistCustomRom);

        //ConstraintLayout
        realme5proexpandedList = findViewById(R.id.realme5proexpandedList);

        setonClickListenerTextButton();
        setRealme5protelegramGroup();
        setRealme5proxdaThread();
        setRealme5progoogleCamera();
    }

    public void setonClickListenerTextButton(){
        realme5prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (realme5proexpandedList.getVisibility()==View.GONE){
                    realme5proexpandedList.setVisibility(View.VISIBLE);
                    realme5proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    realme5proexpandedList.setVisibility(View.GONE);
                    realme5proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRealme5protelegramGroup(){
        realme5protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Realme5Pro_Global"));
                startActivity(intent);
            }
        });
    }

    public void setRealme5proxdaThread(){
        realme5proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/realme-5-pro"));
                startActivity(intent);
            }
        });
    }

    public void setRealme5progoogleCamera(){
        realme5progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/realme5pro_gcam"));
                startActivity(intent);
            }
        });
    }
}
