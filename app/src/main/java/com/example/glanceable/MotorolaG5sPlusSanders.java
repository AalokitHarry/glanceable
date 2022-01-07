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

public class MotorolaG5sPlusSanders extends AppCompatActivity {
    MaterialCardView g5spluslistRoms, g5splustelegramGroup, g5splusxdaThread, PMGC70009FinalBuildV14, GCam62030N7Ptest13, gcamworking;
    ImageView g5splusarrowButton;
    TextView g5spluslistCustomRom;
    ConstraintLayout g5splusexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorola_g5s_plus_sanders);

        //Material Cards
        g5spluslistRoms = findViewById(R.id.g5pluslistRoms);
        g5splustelegramGroup = findViewById(R.id.g5splustelegramGroup);
        g5splusxdaThread = findViewById(R.id.g5splusxdaThread);
        PMGC70009FinalBuildV14 = findViewById(R.id.PMGC7_0_009FinalBuildV14);
        GCam62030N7Ptest13 = findViewById(R.id.GCam62030N7Ptest13);
        gcamworking = findViewById(R.id.gcamworking);

        //Image/Text Button
        g5splusarrowButton = findViewById(R.id.g5splusarrowButton);
        g5spluslistCustomRom = findViewById(R.id.g5spluslistCustomRom);

        //expanded list
        g5splusexpandedList = findViewById(R.id.g5splusexpandedList);

        setOnClickListenerTextButton();
        setG5splustelegramGroupLink();
        setG5splusxdaThreadLink();
        setPMGC70009FinalBuildV14Link();
        setGCam62030N7Ptest13Link();
        setGcamworkingLink();
    }

    public void setOnClickListenerTextButton(){
        g5spluslistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g5splusexpandedList.getVisibility()==View.GONE){
                    g5splusexpandedList.setVisibility(View.VISIBLE);
                    g5splusarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    g5splusexpandedList.setVisibility(View.GONE);
                    g5splusarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setG5splustelegramGroupLink(){
        g5splustelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/g5splus"));
                startActivity(intent);
            }
        });
    }

    public void setG5splusxdaThreadLink(){
        g5splusxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/moto-g5s-plus"));
                startActivity(intent);
            }
        });
    }

    public void setPMGC70009FinalBuildV14Link(){
        PMGC70009FinalBuildV14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.celsoazevedo.com/files/android/google-camera/f/changelog748/"));
                startActivity(intent);
            }
        });
    }

    public void setGCam62030N7Ptest13Link(){
        GCam62030N7Ptest13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f.celsoazevedo.com/file/cfiles/gcm1/GCam_6.2.030_N7P_test1.3.apk"));
                startActivity(intent);
            }
        });
    }

    public void setGcamworkingLink(){
        gcamworking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/g5splusupdates/219"));
                startActivity(intent);
            }
        });
    }
}
