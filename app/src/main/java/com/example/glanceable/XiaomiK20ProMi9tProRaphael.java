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

public class XiaomiK20ProMi9tProRaphael extends AppCompatActivity {
    MaterialCardView redmik20prolistRoms, redmik20protelegramGroup, redmik20proxdaThread, redmik20progoogleCamera;
    ImageView redmik20proarrowButton;
    TextView redmik20prolistCustomRom;
    ConstraintLayout redmik20proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_k20_pro_mi9t_pro_raphael);

        //Material Cards
        redmik20prolistRoms = findViewById(R.id.redmik20prolistRoms);
        redmik20protelegramGroup = findViewById(R.id.redmik20protelegramGroup);
        redmik20proxdaThread = findViewById(R.id.redmik20proxdaThread);
        redmik20progoogleCamera = findViewById(R.id.redmik20progoogleCamera);

        //Image/Text Button
        redmik20proarrowButton = findViewById(R.id.redmik20proarrowButton);
        redmik20prolistCustomRom = findViewById(R.id.redmik20prolistCustomRom);

        //Constraint Layout
        redmik20proexpandedList = findViewById(R.id.redmik20proexpandedList);

        setRedmik20prolistCustomRom();
        setRedmik20protelegramGroup();
        setRedmik20proxdaThread();
        setRedmik20progoogleCamera();
    }

    public void setRedmik20prolistCustomRom(){
        redmik20prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmik20proexpandedList.getVisibility()==View.GONE){
                    redmik20proexpandedList.setVisibility(View.VISIBLE);
                    redmik20proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redmik20proexpandedList.setVisibility(View.GONE);
                    redmik20proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmik20protelegramGroup(){
        redmik20protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/redmik20proglobalofficial"));
                startActivity(intent);
            }
        });
    }

    public void setRedmik20proxdaThread(){
        redmik20proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/k20-pro"));
                startActivity(intent);
            }
        });
    }

    public void setRedmik20progoogleCamera(){
        redmik20progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/K20ProPhotography"));
                startActivity(intent);
            }
        });
    }
}
