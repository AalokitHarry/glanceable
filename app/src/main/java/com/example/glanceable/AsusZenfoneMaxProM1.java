package com.example.glanceable;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.card.MaterialCardView;

public class AsusZenfoneMaxProM1 extends AppCompatActivity {
    MaterialCardView m1listRoms, m1telegramGroup, m1xdaThread, pixel3mod, pixel2mod, pmgc7final;
    ImageView m1arrowButton;
    ConstraintLayout m1expandedList;
    TextView m1listCustomRom;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asus_zenfone_max_pro_m1);

        //CardViews
        m1listRoms = findViewById(R.id.m1listRoms);
        m1telegramGroup = findViewById(R.id.m1telegramGroup);
        m1xdaThread = findViewById(R.id.m1xdaThread);
        pixel3mod = findViewById(R.id.pixel3mod);
        pixel2mod = findViewById(R.id.pixel2mod);
        pmgc7final = findViewById(R.id.pmgc7final);

        //TextView/ImageView button
        m1arrowButton = findViewById(R.id.m1arrowButton);
        m1listCustomRom = findViewById(R.id.m1listCustomRom);

        //Expanded List of roms
        m1expandedList = findViewById(R.id.m1expandedList);

        setOnclickListenerTextButton();

        setTelegramGroupLink();
        setXdaThreadLink();
        setPixel3modLink();
        setPixel2modLink();
        setPmgc7finalLink();
    }
    public void setOnclickListenerTextButton(){
        m1listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m1expandedList.getVisibility()==View.GONE){
                    m1expandedList.setVisibility(View.VISIBLE);
                    m1arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    m1expandedList.setVisibility(View.GONE);
                    m1arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setTelegramGroupLink(){
        m1telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ASUSX00TD"));
                startActivity(intent);
            }
        });
    }

    public void setXdaThreadLink(){
        m1xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/asus-zenfone-max-pro-m1"));
                startActivity(intent);
            }
        });
    }

    public void setPixel3modLink(){
        pixel3mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ZenfoneMaxProCloud/33"));
                startActivity(intent);
            }
        });
    }

    public void setPixel2modLink(){
        pixel2mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ZenfoneMaxProCloud/29"));
                startActivity(intent);
            }
        });
    }

    public void setPmgc7finalLink(){
        pmgc7final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ZenfoneMaxProCloud/35"));
                startActivity(intent);
            }
        });
    }
}
