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

public class XiaomiRedmiNote7Lavender extends AppCompatActivity {
    MaterialCardView redminote7listRoms, redminote7telegramGroup, redminote7xdaThread, redminote7googleCamera;
    ImageView redminote7arrowButton;
    TextView redminote7listCustomRom;
    ConstraintLayout redminote7expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note7_lavender);

        //Material Cards
        redminote7listRoms = findViewById(R.id.redminote7listRoms);
        redminote7telegramGroup = findViewById(R.id.redminote7telegramGroup);
        redminote7xdaThread = findViewById(R.id.redminote7xdaThread);
        redminote7googleCamera = findViewById(R.id.redminote7googleCamera);

        //Image/Text Button
        redminote7arrowButton = findViewById(R.id.redminote7arrowButton);
        redminote7listCustomRom = findViewById(R.id.redminote7listCustomRom);

        //Contraint Layout
        redminote7expandedList = findViewById(R.id.redminote7expandedList);

        setRedminote7listCustomRom();
        setRedminote7telegramGroup();
        setRedminote7xdaThread();
        setRedminote7googleCamera();
    }

    public void setRedminote7listCustomRom(){
        redminote7expandedList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redminote7expandedList.getVisibility()==View.GONE){
                    redminote7expandedList.setVisibility(View.VISIBLE);
                    redminote7arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redminote7expandedList.setVisibility(View.GONE);
                    redminote7arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedminote7telegramGroup(){
        redminote7telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiNote7Official"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote7xdaThread(){
        redminote7xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-note-7"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote7googleCamera(){
        redminote7googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiNote7Photography"));
                startActivity(intent);
            }
        });
    }
}
