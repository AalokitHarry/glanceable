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

public class XiaomiRedmi4_4xSantoni extends AppCompatActivity {
    MaterialCardView redmi44xlistRoms, redmi44xtelegramGroup, redmi44xxdaThread;
    ImageView redmi44xarrowButton;
    TextView redmi44xlistCustomRom;
    ConstraintLayout redmi44xexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi4_4x_santoni);

        //Material Cards
        redmi44xlistRoms = findViewById(R.id.redmi44xlistRoms);
        redmi44xtelegramGroup = findViewById(R.id.redmi44xtelegramGroup);
        redmi44xxdaThread = findViewById(R.id.redmi44xxdaThread);

        //Image/Text Button
        redmi44xarrowButton = findViewById(R.id.redmi44xarrowButton);
        redmi44xlistCustomRom = findViewById(R.id.redmi44xlistCustomRom);

        //Constraint Layout
        redmi44xexpandedList = findViewById(R.id.redmi44xexpandedList);

        setRedmi44xlistCustomRom();
        setRedmi44xtelegramGroup();
        setRedmi44xxdaThread();
    }

    public void setRedmi44xlistCustomRom(){
        redmi44xlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmi44xexpandedList.getVisibility()==View.GONE){
                    redmi44xexpandedList.setVisibility(View.VISIBLE);
                    redmi44xarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redmi44xexpandedList.setVisibility(View.GONE);
                    redmi44xarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmi44xtelegramGroup(){
        redmi44xtelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/r4xofficial"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi44xxdaThread(){
        redmi44xxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/xiaomi-redmi-4x"));
                startActivity(intent);
            }
        });
    }
}
