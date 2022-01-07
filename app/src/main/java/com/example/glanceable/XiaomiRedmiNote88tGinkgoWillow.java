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

public class XiaomiRedmiNote88tGinkgoWillow extends AppCompatActivity {
    MaterialCardView redminote8listRoms, redminote8telegramGroup, redminote8xdaThread;
    ImageView redminote8arrowButton;
    TextView redminote8listCustomRom;
    ConstraintLayout redminote8expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note8_8t_ginkgo_willow);

        //Material Cards
        redminote8listRoms = findViewById(R.id.redminote8listRoms);
        redminote8telegramGroup = findViewById(R.id.redminote8telegramGroup);
        redminote8xdaThread = findViewById(R.id.redminote8xdaThread);

        //Image/Text Button
        redminote8arrowButton = findViewById(R.id.redminote8arrowButton);
        redminote8listCustomRom = findViewById(R.id.redminote8listCustomRom);

        //Constraint Layout
        redminote8expandedList = findViewById(R.id.redminote8expandedList);

        setRedminote8listCustomRom();
        setRedminote8telegramGroup();
        setRedminote8xdaThread();
    }

    public void setRedminote8listCustomRom(){
        redminote8listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redminote8expandedList.getVisibility()==View.GONE){
                    redminote8expandedList.setVisibility(View.VISIBLE);
                    redminote8arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redminote8expandedList.setVisibility(View.GONE);
                    redminote8arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedminote8telegramGroup(){
        redminote8telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiNote8Releases"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote8xdaThread(){
        redminote8xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiNote8Releases"));
                startActivity(intent);
            }
        });
    }
}
