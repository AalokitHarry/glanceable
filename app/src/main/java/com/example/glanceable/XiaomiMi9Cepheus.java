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

public class XiaomiMi9Cepheus extends AppCompatActivity {
    MaterialCardView mi9listRoms, mi9telegramGroup, mi9xdaThread, mi9googleCamera;
    ImageView mi9arrowButton;
    TextView mi9listCustomRom;
    ConstraintLayout mi9expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi9_cepheus);

        //Material Cards
        mi9listRoms = findViewById(R.id.mi9listRoms);
        mi9telegramGroup = findViewById(R.id.mi9telegramGroup);
        mi9xdaThread = findViewById(R.id.mi9xdaThread);
        mi9googleCamera = findViewById(R.id.mi9googleCamera);

        //Text/Image Button
        mi9arrowButton = findViewById(R.id.mi9arrowButton);
        mi9listCustomRom =findViewById(R.id.mi9listCustomRom);

        //COnstraint Layout
        mi9expandedList = findViewById(R.id.mi9expandedList);

        setonClickListenerTextButton();
        setMi9telegramGroup();
        setMi9xdaThread();
        setMi9googleCamera();
    }

    public void setonClickListenerTextButton(){
        mi9listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mi9expandedList.getVisibility()==View.GONE){
                    mi9expandedList.setVisibility(View.VISIBLE);
                    mi9arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mi9expandedList.setVisibility(View.GONE);
                    mi9arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMi9telegramGroup(){
        mi9telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/discussionMI9"));
                startActivity(intent);
            }
        });
    }

    public void setMi9xdaThread(){
        mi9xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/Mi-9"));
                startActivity(intent);
            }
        });
    }

    public void setMi9googleCamera(){
        mi9googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/GCamMI9"));
                startActivity(intent);
            }
        });
    }
}
