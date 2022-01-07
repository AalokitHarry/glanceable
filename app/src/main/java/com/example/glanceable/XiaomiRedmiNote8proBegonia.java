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

public class XiaomiRedmiNote8proBegonia extends AppCompatActivity {
    MaterialCardView redminote8prolistRoms, redminote8protelegramGroup, redminote8proxdaThread, redminote8progoogleCamera;
    ImageView redminote8proarrowButton;
    TextView redminote8prolistCustomRom;
    ConstraintLayout redminote8proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note8pro_begonia);

        //Material Cards
        redminote8prolistRoms = findViewById(R.id.redminote8prolistRoms);
        redminote8protelegramGroup = findViewById(R.id.redminote8protelegramGroup);
        redminote8proxdaThread = findViewById(R.id.redminote8proxdaThread);
        redminote8progoogleCamera = findViewById(R.id.redminote8progoogleCamera);

        //IMage/Text Button
        redminote8proarrowButton = findViewById(R.id.redminote8proarrowButton);
        redminote8prolistCustomRom = findViewById(R.id.redminote8prolistCustomRom);

        //ConstraintLayout
        redminote8proexpandedList = findViewById(R.id.redminote8proexpandedList);

        setRedminote8prolistCustomRom();
        setRedminote8protelegramGroup();
        setRedminote8proxdaThread();
        setRedminote8progoogleCamera();
    }

    public void setRedminote8prolistCustomRom(){
        redminote8prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redminote8proexpandedList.getVisibility()==View.GONE){
                    redminote8proexpandedList.setVisibility(View.VISIBLE);
                    redminote8proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redminote8proexpandedList.setVisibility(View.GONE);
                    redminote8proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedminote8protelegramGroup(){
        redminote8protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiNote8ProOfficial"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote8proxdaThread(){
        redminote8proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-note-8-pro"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote8progoogleCamera(){
        redminote8progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiNote8ProPhotography"));
                startActivity(intent);
            }
        });
    }
}
