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

public class Oneplus5Cheeseburger extends AppCompatActivity {
    MaterialCardView oneplus5listRoms, oneplus5xdaThread, oneplus5googleCamera;
    ImageView oneplus5arrowButton;
    TextView oneplus5listCustomRom;
    ConstraintLayout oneplus5expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus5_cheeseburger);

        //Material Cards
        oneplus5listRoms = findViewById(R.id.oneplus5listRoms);
        oneplus5xdaThread = findViewById(R.id.oneplus5xdaThread);
        oneplus5googleCamera = findViewById(R.id.oneplus5googleCamera);

        //Text/Image Button
        oneplus5arrowButton = findViewById(R.id.oneplus5arrowButton);
        oneplus5listCustomRom = findViewById(R.id.oneplus5listCustomRom);

        //Constraint Layout
        oneplus5expandedList = findViewById(R.id.oneplus5expandedList);

        setOnclickListenerTextButton();
        setOneplus5xdaThreadLink();
        setOneplus5googleCameraLink();
    }

    public void setOnclickListenerTextButton(){
        oneplus5listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus5expandedList.getVisibility()==View.GONE){
                    oneplus5expandedList.setVisibility(View.VISIBLE);
                    oneplus5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                } else {
                    oneplus5expandedList.setVisibility(View.GONE);
                    oneplus5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOneplus5xdaThreadLink(){
        oneplus5xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-5"));
                startActivity(intent);
            }
        });
    }

    public void setOneplus5googleCameraLink(){
        oneplus5googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/gcamOneplus"));
                startActivity(intent);
            }
        });
    }
}
