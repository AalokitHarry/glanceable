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

public class XiaomiRedmiNote5proWhyred extends AppCompatActivity {
    MaterialCardView redminote5prolistRoms, redminote5protelegramGroup, redminote5proxdaThread, redminote5progoogleCamera;
    ImageView redminote5proarrowButton;
    TextView redminote5prolistCustomRom;
    ConstraintLayout redminote5proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note5pro_whyred);

        //Material Cards
        redminote5prolistRoms = findViewById(R.id.redminote5prolistRoms);
        redminote5protelegramGroup = findViewById(R.id.redminote5protelegramGroup);
        redminote5proxdaThread = findViewById(R.id.redminote5proxdaThread);
        redminote5progoogleCamera = findViewById(R.id.redminote5progoogleCamera);

        //Image/Text Button
        redminote5proarrowButton = findViewById(R.id.redminote5proarrowButton);
        redminote5prolistCustomRom = findViewById(R.id.redminote5prolistCustomRom);

        //Constraint Layout
        redminote5proexpandedList = findViewById(R.id.redminote5proexpandedList);

        setRedminote5prolistCustomRom();
        setRedminote5protelegramGroup();
        setRedminote5proxdaThread();
        setRedminote5progoogleCamera();
    }

    public void setRedminote5prolistCustomRom(){
        redminote5prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redminote5proexpandedList.getVisibility()==View.GONE){
                    redminote5proexpandedList.setVisibility(View.VISIBLE);
                    redminote5proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redminote5proexpandedList.setVisibility(View.GONE);
                    redminote5proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedminote5protelegramGroup(){
        redminote5protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/whyredofficial"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote5proxdaThread(){
        redminote5proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-note-5-pro"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote5progoogleCamera(){
        redminote5progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/whyredphotos"));
                startActivity(intent);
            }
        });
    }
}
