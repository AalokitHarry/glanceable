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

public class XiaomiRedmi5Rosy extends AppCompatActivity {
    MaterialCardView redmi5listRoms, redmi5telegramGroup, redmi5xdaThread;
    ImageView redmi5arrowButton;
    TextView redmi5listCustomRom;
    ConstraintLayout redmi5expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi5_rosy);

        //Material Cards
        redmi5listRoms = findViewById(R.id.redmi5listRoms);
        redmi5telegramGroup = findViewById(R.id.redmi5telegramGroup);
        redmi5xdaThread = findViewById(R.id.redmi5xdaThread);

        //Image/Text Button
        redmi5arrowButton = findViewById(R.id.redmi5arrowButton);
        redmi5listCustomRom = findViewById(R.id.redmi5listCustomRom);

        //Constraint Layout
        redmi5expandedList = findViewById(R.id.redmi5expandedList);

        setRedmi5listCustomRom();
        setRedmi5telegramGroup();
        setRedmi5xdaThread();
    }

    public void setRedmi5listCustomRom(){
        redmi5listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmi5expandedList.getVisibility()==View.GONE){
                    redmi5expandedList.setVisibility(View.VISIBLE);
                    redmi5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redmi5expandedList.setVisibility(View.GONE);
                    redmi5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmi5telegramGroup(){
        redmi5telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/rosy_global"));
                startActivity(intent);
            }
        });
    }

    public void setRedmi5xdaThread(){
        redmi5telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-5"));
                startActivity(intent);
            }
        });
    }
}
