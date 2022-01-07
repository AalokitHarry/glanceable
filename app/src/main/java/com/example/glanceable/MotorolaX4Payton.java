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

public class MotorolaX4Payton extends AppCompatActivity {
    MaterialCardView x4paytonlistRoms, x4paytontelegramGroup, x4paytonxdaThread, googleCamera;
    ImageView x4paytonarrowButton;
    TextView x4paytonlistCustomRom;
    ConstraintLayout x4paytonexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorola_x4_payton);

        //Material Cards
        x4paytonlistRoms = findViewById(R.id.x4paytonlistRoms);
        x4paytontelegramGroup = findViewById(R.id.x4paytontelegramGroup);
        x4paytonxdaThread = findViewById(R.id.x4paytonxdaThread);
        googleCamera = findViewById(R.id.googleCamera);

        //Image\Text Button
        x4paytonarrowButton = findViewById(R.id.x4paytonarrowButton);
        x4paytonlistCustomRom = findViewById(R.id.x4paytonlistCustomRom);

        // Constraint Layout
        x4paytonexpandedList = findViewById(R.id.x4paytonexpandedList);

        setOnclickListenerTextButton();
        setX4paytontelegramGroupLink();
        setX4paytonxdaThreadLink();
        setGoogleCameraLink();
    }

    public void  setOnclickListenerTextButton(){
        x4paytonlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (x4paytonexpandedList.getVisibility()==View.GONE){
                    x4paytonexpandedList.setVisibility(View.VISIBLE);
                    x4paytonarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    x4paytonexpandedList.setVisibility(View.GONE);
                    x4paytonarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setX4paytontelegramGroupLink(){
        x4paytontelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/motox4official"));
                startActivity(intent);
            }
        });
    }

    public void setX4paytonxdaThreadLink(){
        x4paytonxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/moto-x4"));
                startActivity(intent);
            }
        });
    }

    public void setGoogleCameraLink(){
        googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.celsoazevedo.com/files/android/google-camera/"));
            }
        });
    }
}
