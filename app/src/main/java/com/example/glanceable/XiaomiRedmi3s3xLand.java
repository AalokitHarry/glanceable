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

public class XiaomiRedmi3s3xLand extends AppCompatActivity {
    MaterialCardView redmi3s3xlistRoms, redmi3s3xtelegramGroup, redmi3s3xxdaThread;
    ImageView redmi3s3xarrowButton;
    TextView redmi3s3xlistCustomRom;
    ConstraintLayout redmi3s3xexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi3s3x_land);

        redmi3s3xlistRoms  =findViewById(R.id.redmi3s3xlistRoms);
        redmi3s3xtelegramGroup = findViewById(R.id.redmi3s3xtelegramGroup);
        redmi3s3xxdaThread = findViewById(R.id.redmi3s3xxdaThread);

        //Image/Text Button
        redmi3s3xarrowButton = findViewById(R.id.redmi3s3xarrowButton);
        redmi3s3xlistCustomRom = findViewById(R.id.redmi3s3xlistCustomRom);

        //Constraint Layout
        redmi3s3xexpandedList = findViewById(R.id.redmi3s3xexpandedList);

        setRedmi3s3xlistCustomRom();
        setRedmi3s3xtelegramGroup();
        setRedmi3s3xxdaThread();
    }

    public void setRedmi3s3xlistCustomRom(){
        redmi3s3xlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmi3s3xexpandedList.getVisibility()==View.GONE){
                    redmi3s3xexpandedList.setVisibility(View.VISIBLE);
                    redmi3s3xarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redmi3s3xexpandedList.setVisibility(View.GONE);
                    redmi3s3xarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmi3s3xtelegramGroup(){
        redmi3s3xtelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/LandMi"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi3s3xxdaThread(){
        redmi3s3xxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/xiaomi-redmi-3s"));
                startActivity(intent);
            }
        });
    }
}
