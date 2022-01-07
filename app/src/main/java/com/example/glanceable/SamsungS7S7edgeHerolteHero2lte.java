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

public class SamsungS7S7edgeHerolteHero2lte extends AppCompatActivity {
    MaterialCardView samsungs7listRoms, samsungs7telegramGroup, samsungs7xdaThread;
    ImageView samsungs7arrowButton;
    TextView samsungs7listCustomRom;
    ConstraintLayout samsungs7expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_s7_s7edge_herolte_hero2lte);

        //Material Cards
        samsungs7listRoms = findViewById(R.id.samsungs7listRoms);
        samsungs7telegramGroup = findViewById(R.id.samsungs7telegramGroup);
        samsungs7xdaThread = findViewById(R.id.samsungs7xdaThread);

        //Image/Text Button
        samsungs7arrowButton = findViewById(R.id.samsungs7arrowButton);
        samsungs7listCustomRom = findViewById(R.id.samsungs7listCustomRom);

        //Constraint Layout
        samsungs7expandedList = findViewById(R.id.samsungs7expandedList);

        setonClickListenerTextButton();
        setSamsungs7telegramGroup();
        setSamsungs7xdaThread();
    }

    public void setonClickListenerTextButton(){
        samsungs7listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (samsungs7expandedList.getVisibility()==View.GONE){
                    samsungs7expandedList.setVisibility(View.VISIBLE);
                    samsungs7arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    samsungs7expandedList.setVisibility(View.GONE);
                    samsungs7arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setSamsungs7telegramGroup(){
        samsungs7telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/S7andS7edge"));
                startActivity(intent);
            }
        });
    }

    public void setSamsungs7xdaThread(){
        samsungs7xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/galaxy-s7"));
                startActivity(intent);
            }
        });
    }
}
