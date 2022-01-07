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

public class XiaomiMiA1Tissot extends AppCompatActivity {
    MaterialCardView mia1listRoms,mia1telegramGroup, mia1xdaThread;
    ImageView mia1arrowButton;
    TextView mia1listCustomRom;
    ConstraintLayout mia1expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi_a1_tissot);

        //Material Cards
        mia1listRoms = findViewById(R.id.mia1listRoms);
        mia1telegramGroup = findViewById(R.id.mia1telegramGroup);
        mia1xdaThread = findViewById(R.id.mia1xdaThread);

        //Text/Image Button
        mia1arrowButton = findViewById(R.id.mia1arrowButton);
        mia1listCustomRom = findViewById(R.id.mia1listCustomRom);

        //Constraint Layout
        mia1expandedList = findViewById(R.id.mia1expandedList);
    }

    public void setonClickListenerTextButton(){
        mia1listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mia1expandedList.getVisibility()==View.GONE){
                    mia1expandedList.setVisibility(View.VISIBLE);
                    mia1arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mia1expandedList.setVisibility(View.GONE);
                    mia1arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMia1telegramGroup(){
        mia1telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/MiA1_Global"));
                startActivity(intent);
            }
        });
    }

    public void setMia1xdaThread(){
        mia1xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-a1"));
                startActivity(intent);
            }
        });
    }
}
