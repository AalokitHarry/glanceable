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

public class XiaomiMi9seGrus extends AppCompatActivity {
    MaterialCardView mi9selistRoms, mi9setelegramGroup, mi9sexdaThread, mi9segoogleCamera;
    ImageView mi9searrowButton;
    TextView mi9selistCustomRom;
    ConstraintLayout mi9seexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi9se_grus);

        //Material Cards
        mi9selistRoms = findViewById(R.id.mi9selistRoms);
        mi9setelegramGroup = findViewById(R.id.mi9setelegramGroup);
        mi9sexdaThread = findViewById(R.id.mi9sexdaThread);
        mi9segoogleCamera = findViewById(R.id.mi9segoogleCamera);

        //Image/Text Button
        mi9searrowButton = findViewById(R.id.mi9searrowButton);
        mi9selistCustomRom = findViewById(R.id.mi9selistCustomRom);

        //Contraint Layout
        mi9seexpandedList = findViewById(R.id.mi9seexpandedList);

        setonClickTextButton();
        setMi9setelegramGroup();
        setMi9sexdaThread();
    }

    public void setonClickTextButton(){
        mi9selistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mi9seexpandedList.getVisibility()==View.GONE){
                    mi9seexpandedList.setVisibility(View.VISIBLE);
                    mi9searrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                } else {
                    mi9seexpandedList.setVisibility(View.GONE);
                    mi9searrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMi9setelegramGroup(){
        mi9setelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/GrusFamily"));
                startActivity(intent);
            }
        });
    }

    public void setMi9sexdaThread(){
        mi9sexdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-9-se"));
                startActivity(intent);
            }
        });
    }
}
