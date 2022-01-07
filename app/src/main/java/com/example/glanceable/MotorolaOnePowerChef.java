package com.example.glanceable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class MotorolaOnePowerChef extends AppCompatActivity {
    MaterialCardView onePowerlistRoms, onePowertelegramGroup, onePowerxdaThread, googleCamera;
    ImageView onePowerarrowButton;
    TextView onePowerlistCustomRom;
    ConstraintLayout onePowerexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorola_one_power_chef);

        //Material Cards
        onePowerlistRoms = findViewById(R.id.onePowerlistRoms);
        onePowertelegramGroup = findViewById(R.id.onePowertelegramGroup);
        onePowerxdaThread = findViewById(R.id.onePowerxdaThread);
        googleCamera = findViewById(R.id.googleCamera);

        //Text\Image Button
        onePowerarrowButton = findViewById(R.id.onePowerarrowButton);
        onePowerlistCustomRom = findViewById(R.id.onePowerlistCustomRom);

        //Constraint Layout
        onePowerexpandedList = findViewById(R.id.onePowerexpandedList);

        setOnclickListenerTextButton();
        setOnePowertelegramGroup();
        setOnePowerxdaThreadLink();
        setGoogleCameraLink();
    }

    public void setOnclickListenerTextButton(){
        onePowerlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onePowerexpandedList.getVisibility()==View.GONE){
                    onePowerexpandedList.setVisibility(View.VISIBLE);
                    onePowerarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    onePowerexpandedList.setVisibility(View.GONE);
                    onePowerarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOnePowertelegramGroup(){
        onePowertelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/MotoOnePower"));
                startActivity(intent);
            }
        });
    }

    public void setOnePowerxdaThreadLink(){
        onePowerxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/one-power"));
                startActivity(intent);
            }
        });
    }

    public void setGoogleCameraLink(){
        googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/MotoOnePower_gcam"));
                startActivity(intent);
            }
        });
    }
}
