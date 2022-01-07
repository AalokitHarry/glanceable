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

public class XiaomiRedmi6proSakura extends AppCompatActivity {
    MaterialCardView redmi6prolistRoms, redmi6protelegramGroup, redmi6proxdaThread, redmi6progoogleCamera;
    ImageView redmi6proarrowButton;
    TextView redmi6prolistCustomRom;
    ConstraintLayout redmi6proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi6pro_sakura);

        //Material Cards
        redmi6prolistRoms = findViewById(R.id.redmi6prolistRoms);
        redmi6protelegramGroup = findViewById(R.id.redmi6protelegramGroup);
        redmi6proxdaThread = findViewById(R.id.redmi6proxdaThread);
        redmi6progoogleCamera = findViewById(R.id.redmi6progoogleCamera);

        //Image/Text Button
        redmi6proarrowButton = findViewById(R.id.redmi6proarrowButton);
        redmi6prolistCustomRom = findViewById(R.id.redmi6prolistCustomRom);

        //Constraint Layout
        redmi6proexpandedList = findViewById(R.id.redmi6proexpandedList);

        setRedmi6prolistCustomRom();
        setRedmi6protelegramGroup();
        setRedmi6proxdaThread();
        setRedmi6progoogleCamera();
    }

    public void setRedmi6prolistCustomRom(){
        redmi6prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmi6proexpandedList.getVisibility()==View.GONE){
                    redmi6proexpandedList.setVisibility(View.VISIBLE);
                    redmi6proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redmi6proexpandedList.setVisibility(View.GONE);
                    redmi6proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmi6protelegramGroup(){
        redmi6protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/redmi6proofficial"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi6proxdaThread(){
        redmi6proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-6-pro"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi6progoogleCamera(){
        redmi6progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/YSL_Sakura_Photography"));
                startActivity(intent);
            }
        });
    }
}
