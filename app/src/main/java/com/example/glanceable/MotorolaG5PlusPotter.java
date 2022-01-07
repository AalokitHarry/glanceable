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

public class MotorolaG5PlusPotter extends AppCompatActivity {
    MaterialCardView g5pluslistRoms, g5plustelegramGroup, g5plusxdaThread, g5plusgcamGroupLink;
    ImageView g5plusarrowButton;
    TextView g5pluslistCustomRom;
    ConstraintLayout g5plusexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorola_g5_plus_potter);

        //Material Cards
        g5pluslistRoms =findViewById(R.id.g5pluslistRoms);
        g5plustelegramGroup = findViewById(R.id.g5plustelegramGroup);
        g5plusxdaThread = findViewById(R.id.g5plusxdaThread);
        g5plusgcamGroupLink = findViewById(R.id.g5plusgcamGroupLink);

        //Image/Text Button
        g5plusarrowButton = findViewById(R.id.g5plusarrowButton);
        g5pluslistCustomRom= findViewById(R.id.g5pluslistCustomRom);

        //Expanded list
        g5plusexpandedList = findViewById(R.id.g5plusexpandedList);

        setOnClickListenerTextButton();
        setG5plustelegramGroupLink();
        setG5plusxdaThreadLink();
        setG5plusgcamGroupLink();
    }

    public void setOnClickListenerTextButton(){
        g5pluslistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g5plusexpandedList.getVisibility()== View.GONE){
                    g5plusexpandedList.setVisibility(View.VISIBLE);
                    g5plusarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    g5plusexpandedList.setVisibility(View.GONE);
                    g5plusarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setG5plustelegramGroupLink(){
        g5plustelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/potterofficial"));
                startActivity(intent);
            }
        });
    }

    public void setG5plusxdaThreadLink(){
        g5plusxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/g5-plus"));
                startActivity(intent);
            }
        });
    }

    public void setG5plusgcamGroupLink(){
        g5plusgcamGroupLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/G5PlusMods"));
                startActivity(intent);
            }
        });
    }
}
