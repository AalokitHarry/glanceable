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

public class Oneplus6Enchilada extends AppCompatActivity {
    MaterialCardView oneplus6listRoms, oneplus6telegramGroup, oneplus6xdaThread, oneplus6googleCamera;
    ImageView oneplus6arrowButton;
    TextView oneplus6listCustomRom;
    ConstraintLayout oneplus6expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus6_enchilada);

        //Material Cards
        oneplus6listRoms =findViewById(R.id.oneplus6listRoms);
        oneplus6telegramGroup = findViewById(R.id.oneplus6telegramGroup);
        oneplus6xdaThread = findViewById(R.id.oneplus6xdaThread);
        oneplus6googleCamera = findViewById(R.id.oneplus6googleCamera);

        //Text/Image Button
        oneplus6arrowButton = findViewById(R.id.oneplus6arrowButton);
        oneplus6listCustomRom = findViewById(R.id.oneplus6listCustomRom);

        //ConstraintLayout
        oneplus6expandedList = findViewById(R.id.oneplus6expandedList);

        setOnclickListenerTextButton();
        setOneplus6telegramGroup();
        setOneplus6xdaThread();
        setOneplus6googleCamera();
    }

    public void setOnclickListenerTextButton(){
        oneplus6listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus6expandedList.getVisibility()==View.GONE){
                    oneplus6expandedList.setVisibility(View.VISIBLE);
                    oneplus6arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    oneplus6expandedList.setVisibility(View.GONE);
                    oneplus6arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOneplus6telegramGroup(){
        oneplus6telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/op6news"));
            }
        });
    }
    public void setOneplus6xdaThread(){
        oneplus6xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-6"));
                startActivity(intent);
            }
        });

    }

    public void setOneplus6googleCamera(){
        oneplus6googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/gcamop6"));
                startActivity(intent);
            }
        });
    }
}
