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

public class XiaomiMiA2JasmineSprout extends AppCompatActivity {
    MaterialCardView mia2listRoms, mia2telegramGroup, mia2xdaThread;
    ImageView mia2arrowButton;
    TextView mia2listCustomRom;
    ConstraintLayout mia2expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi_a2_jasmine_sprout);

        //MAterial Cards
        mia2listRoms = findViewById(R.id.mia2listRoms);
        mia2telegramGroup = findViewById(R.id.mia2telegramGroup);
        mia2xdaThread = findViewById(R.id.mia2xdaThread);

        //Text/IMage Button
        mia2arrowButton = findViewById(R.id.mia2arrowButton);
        mia2listCustomRom = findViewById(R.id.mia2listCustomRom);

        //Constraint LAyout
        mia2expandedList = findViewById(R.id.mia2expandedList);

        setonCLickListenerTextButton();
        setMia2telegramGroup();
        setMia2xdaThread();
    }

    public void setonCLickListenerTextButton(){
        mia2listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mia2expandedList.getVisibility()==View.GONE){
                    mia2expandedList.setVisibility(View.VISIBLE);
                    mia2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mia2expandedList.setVisibility(View.GONE);
                    mia2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void  setMia2telegramGroup(){
        mia2telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/A26XOfficial"));
                startActivity(intent);
            }
        });
    }

    public void setMia2xdaThread(){
        mia2xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-a2"));
                startActivity(intent);
            }
        });
    }
}
