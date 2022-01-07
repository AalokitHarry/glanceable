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

public class Oneplus7Guacamoleb extends AppCompatActivity {
    MaterialCardView oneplus7listRoms, oneplus7xdaThread, oneplus7googleCamera;
    ImageView oneplus7arrowButton;
    TextView oneplus7listCustomRom;
    ConstraintLayout oneplus7expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus7_guacamoleb);

        //Material Cards
        oneplus7listRoms = findViewById(R.id.oneplus7listRoms);
        oneplus7xdaThread = findViewById(R.id.oneplus7xdaThread);
        oneplus7googleCamera = findViewById(R.id.oneplus7googleCamera);

        //Image/Text Button
        oneplus7arrowButton = findViewById(R.id.oneplus7arrowButton);
        oneplus7listCustomRom = findViewById(R.id.oneplus7listCustomRom);

        //Constraint Layout
        oneplus7expandedList = findViewById(R.id.oneplus7expandedList);

        setOnclickListenerTextButton();
        setOneplus7xdaThread();
        setOneplus7googleCamera();
    }

    public void setOnclickListenerTextButton(){
        oneplus7listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus7expandedList.getVisibility() == View.GONE) {
                    oneplus7expandedList.setVisibility(View.VISIBLE);
                    oneplus7arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                } else {
                    oneplus7expandedList.setVisibility(View.GONE);
                    oneplus7arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOneplus7xdaThread(){
        oneplus7xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-7"));
                startActivity(intent);
            }
        });
    }

    public void setOneplus7googleCamera(){
        oneplus7googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/gcamOP7"));
                startActivity(intent);
            }
        });
    }
}
