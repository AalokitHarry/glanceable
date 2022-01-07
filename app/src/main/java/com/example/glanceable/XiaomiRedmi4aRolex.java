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

public class XiaomiRedmi4aRolex extends AppCompatActivity {
    MaterialCardView redmi44xlistRoms, redmi4atelegramGroup, redmi4axdaThread, redmi4agoogleCamera;
    ImageView redmi4aarrowButton;
    TextView redmi4alistCustomRom;
    ConstraintLayout redmi4aexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi4a_rolex);

        //Material Cards
        redmi44xlistRoms = findViewById(R.id.redmi44xlistRoms);
        redmi4atelegramGroup = findViewById(R.id.redmi4atelegramGroup);
        redmi4axdaThread = findViewById(R.id.redmi4axdaThread);
        redmi4agoogleCamera = findViewById(R.id.redmi4agoogleCamera);

        //Image/Text Button
        redmi4aarrowButton = findViewById(R.id.redmi4aarrowButton);
        redmi4alistCustomRom = findViewById(R.id.redmi4alistCustomRom);

        //Constraint Layout
        redmi4aexpandedList = findViewById(R.id.redmi4aexpandedList);

        setRedmi4alistCustomRom();
        setRedmi4atelegramGroup();
        setRedmi4axdaThread();
        setRedmi4agoogleCamera();
    }

    public void setRedmi4alistCustomRom(){
        redmi4alistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmi4aexpandedList.getVisibility()==View.GONE){
                    redmi4aexpandedList.setVisibility(View.VISIBLE);
                    redmi4aarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redmi4aexpandedList.setVisibility(View.GONE);
                    redmi4aarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmi4atelegramGroup(){
        redmi4atelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/redmi4aINT"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi4axdaThread(){
        redmi4axdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-4a"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi4agoogleCamera(){
        redmi4agoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rovaphotography"));
                startActivity(intent);
            }
        });
    }
}
