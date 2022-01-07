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

public class AsusZenfoneMaxProM2 extends AppCompatActivity {
    MaterialCardView m2listRoms, m2telegramGroup, m2xdaThread, gcam7three, gcam7two, gcam7, gcam7astro, gcam6twodcip, gcam6twoarno;
    ImageView m2arrowButton;
    ConstraintLayout m2expandedList;
    TextView m2listCustomRom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus_zenfone_max_pro_m2);

        //cards
        m2listRoms = findViewById(R.id.m2listRoms);
        m2telegramGroup = findViewById(R.id.m2telegramGroup);
        m2xdaThread = findViewById(R.id.m2xdaThread);
        gcam7three = findViewById(R.id.gcam7_3);
        gcam7two = findViewById(R.id.gcam7_2);
        gcam7 = findViewById(R.id.gcam7_0);
        gcam7astro = findViewById(R.id.gcam7_0astro);
        gcam6twodcip = findViewById(R.id.gcam6_2dcip);
        gcam6twoarno = findViewById(R.id.gcam6_2arno);

        //Text/Image Button
        m2arrowButton = findViewById(R.id.m2arrowButton);
        m2listCustomRom = findViewById(R.id.m2listCustomRom);

        //Expanded List
        m2expandedList = findViewById(R.id.m2expandedList);

        setonClickListenerTextButton();
        setM2telegramGroupLink();
        setM2xdaThreadLink();
        setGcam7threeLink();
        setGcam7twoLink();
        setGcam7Link();
        setGcam7astroLink();
        setGcam6twodcipLink();
        setGcam6twoarnoLink();
    }

    public void setonClickListenerTextButton(){
        m2listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m2expandedList.getVisibility()==View.GONE){
                    m2expandedList.setVisibility(View.VISIBLE);
                    m2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    m2expandedList.setVisibility(View.GONE);
                    m2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setM2telegramGroupLink(){
        m2telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ZenfoneMaxProM2Official"));
                startActivity(intent);
            }
        });
    }

    public void setM2xdaThreadLink(){
        m2xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/max-pro-m2"));
                startActivity(intent);
            }
        });
    }

    public void setGcam7threeLink(){
        gcam7three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f.celsoazevedo.com/file/cfiles/gcm1/GCam_7.3.018_Urnyx05-v1.4.apk"));
                startActivity(intent);
            }
        });
    }

    public void setGcam7twoLink(){
        gcam7two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f.celsoazevedo.com/file/cfiles/gcm1/MGC_7.2.014_Parrot043-v3.apk"));
                startActivity(intent);
            }
        });
    }

    public void setGcam7Link(){
        gcam7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f.celsoazevedo.com/file/cfiles/gcm1/PMGC_7.0.009_HDR_Version_V13.apk"));
                startActivity(intent);
            }
        });
    }

    public void setGcam7astroLink(){
        gcam7astro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f.celsoazevedo.com/file/cfiles/gcm1/PMGC_7.0.009_Astrophoto_Version_V12.apk"));
                startActivity(intent);
            }
        });
    }

    public void setGcam6twodcipLink(){
        gcam6twodcip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f.celsoazevedo.com/file/cfiles/gcm1/MGC_6.2.030_DCIP3Version_Bulkin043_V8.2.apk"));
                startActivity(intent);
            }
        });
    }

    public void setGcam6twoarnoLink(){
        gcam6twoarno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://f.celsoazevedo.com/file/cfiles/gcm1/MGC_6.2.024_Arnova8G2Base_v12.3R.apk"));
                startActivity(intent);
            }
        });
    }
}
