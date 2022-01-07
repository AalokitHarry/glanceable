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

public class XiaomiRedmiNote4_4xMido extends AppCompatActivity {
    MaterialCardView redminote4listRoms, redminote4telegramGroup, redminote4xdaThread, redminote4googleCamera;
    ImageView redminote4arrowButton;
    TextView redminote4listCustomRom;
    ConstraintLayout redminote4expandedList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note4_4x_mido);

        //Material Cards
        redminote4listRoms = findViewById(R.id.redminote4listRoms);
        redminote4telegramGroup =findViewById(R.id.redminote4telegramGroup);
        redminote4xdaThread = findViewById(R.id.redminote4xdaThread);
        redminote4googleCamera = findViewById(R.id.redminote4googleCamera);

        //Image/Text Button
        redminote4arrowButton = findViewById(R.id.redminote4arrowButton);
        redminote4listCustomRom = findViewById(R.id.redminote4listCustomRom);

        //Constraint Layout
        redminote4expandedList = findViewById(R.id.redminote4expandedList);

        setRedminote4listCustomRom();
        setRedminote4telegramGroup();
        setRedminote4xdaThread();
        setRedminote4googleCamera();
    }

    public void setRedminote4listCustomRom(){
        redminote4listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redminote4expandedList.getVisibility()==View.GONE){
                    redminote4expandedList.setVisibility(View.VISIBLE);
                    redminote4arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redminote4expandedList.setVisibility(View.GONE);
                    redminote4arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedminote4telegramGroup(){
        redminote4telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rn4official"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote4xdaThread(){
        redminote4xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-note-4"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote4googleCamera(){
        redminote4googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rn4photography"));
                startActivity(intent);
            }
        });
    }
}
