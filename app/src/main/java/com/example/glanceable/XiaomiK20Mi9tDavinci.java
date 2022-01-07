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

public class XiaomiK20Mi9tDavinci extends AppCompatActivity {
    MaterialCardView redmik20listRoms, redmik20telegramGroup, redmik20xdaThread, redmik20googleCamera;
    ImageView redmik20arrowButton;
    TextView redmik20listCustomRom;
    ConstraintLayout redmik20expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_k20_mi9t_davinci);

        //Material Cards
        redmik20listRoms = findViewById(R.id.redmik20listRoms);
        redmik20telegramGroup = findViewById(R.id.redmik20telegramGroup);
        redmik20xdaThread = findViewById(R.id.redmik20xdaThread);
        redmik20googleCamera = findViewById(R.id.redmik20googleCamera);

        //Image/Text Button
        redmik20arrowButton = findViewById(R.id.redmik20arrowButton);
        redmik20listCustomRom = findViewById(R.id.redmik20listCustomRom);

        //Constraint Layout
        redmik20expandedList = findViewById(R.id.redmik20expandedList);

        setRedmik20listCustomRom();
        setRedmik20telegramGroup();
        setRedmik20xdaThread();
        setRedmik20googleCamera();
    }

    public void setRedmik20listCustomRom(){
        redmik20listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redmik20expandedList.getVisibility()==View.GONE){
                    redmik20expandedList.setVisibility(View.VISIBLE);
                    redmik20arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else{
                    redmik20expandedList.setVisibility(View.GONE);
                    redmik20arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedmik20telegramGroup(){
        redmik20telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/RedmiK20GlobalOfficial"));
                startActivity(intent);
            }
        });
    }

    public void setRedmik20xdaThread(){
        redmik20xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-9t"));
                startActivity(intent);
            }
        });
    }

    public void setRedmik20googleCamera(){
        redmik20googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/K20ProPhotography"));
                startActivity(intent);
            }
        });
    }
}
