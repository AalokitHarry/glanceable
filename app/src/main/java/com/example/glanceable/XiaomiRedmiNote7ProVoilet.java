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

public class XiaomiRedmiNote7ProVoilet extends AppCompatActivity {
    MaterialCardView redminote7prolistRoms, redminote7protelegramGroup, redminote7proxdaThread, redminote7progoogleCamera;
    ImageView redminote7proarrowButton;
    TextView redminote7prolistCustomRom;
    ConstraintLayout redminote7proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note7_pro_voilet);

        //Material Cards
        redminote7prolistRoms = findViewById(R.id.redminote7prolistRoms);
        redminote7protelegramGroup = findViewById(R.id.redminote7protelegramGroup);
        redminote7proxdaThread = findViewById(R.id.redminote7proxdaThread);
        redminote7progoogleCamera = findViewById(R.id.redminote7progoogleCamera);

        //Image/Text Button
        redminote7proarrowButton = findViewById(R.id.redminote7proarrowButton);
        redminote7prolistCustomRom = findViewById(R.id.redminote7prolistCustomRom);

        //Constraint Layout
        redminote7proexpandedList = findViewById(R.id.redminote7proexpandedList);

        setRedminote7prolistCustomRom();
        setRedminote7protelegramGroup();
        setRedminote7proxdaThread();
        setRedminote7progoogleCamera();
    }

    public void setRedminote7prolistCustomRom(){
        redminote7prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redminote7proexpandedList.getVisibility() == View.GONE) {
                    redminote7proexpandedList.setVisibility(View.VISIBLE);
                    redminote7proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redminote7proexpandedList.setVisibility(View.GONE);
                    redminote7proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedminote7protelegramGroup(){
        redminote7protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Rn7proGlobal"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote7proxdaThread(){
        redminote7proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-note-7-pro"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote7progoogleCamera(){
        redminote7progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiNote7ProPhotography"));
                startActivity(intent);
            }
        });
    }
}
