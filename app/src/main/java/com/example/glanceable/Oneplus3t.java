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

public class Oneplus3t extends AppCompatActivity {
    MaterialCardView oneplus3tlistRoms, oneplus3txdaThread, oneplus3tgoogleCamera;
    ImageView oneplus3tarrowButton;
    TextView oneplus3tlistCustomRom;
    ConstraintLayout oneplus2expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus3t);

        //Material Cards
        oneplus3tlistRoms = findViewById(R.id.oneplus3tlistRoms);
        oneplus3txdaThread = findViewById(R.id.oneplus3txdaThread);
        oneplus3tgoogleCamera = findViewById(R.id.oneplus3tgoogleCamera);

        //Text/Image Button
        oneplus3tarrowButton = findViewById(R.id.oneplus3tarrowButton);
        oneplus3tlistCustomRom = findViewById(R.id.oneplus3tlistCustomRom);

        //Constraint Layout
        oneplus2expandedList = findViewById(R.id.oneplus2expandedList);

        setOnclickListenerTextButton();
        setOneplus3tgoogleCameraLink();
        setOneplus3txdaThreadLink();
    }

    public void setOnclickListenerTextButton(){
        oneplus3tlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus2expandedList.getVisibility()==View.GONE){
                    oneplus2expandedList.setVisibility(View.VISIBLE);
                    oneplus3tarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    oneplus2expandedList.setVisibility(View.GONE);
                    oneplus3tarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOneplus3txdaThreadLink(){
        oneplus3txdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-3"));
                startActivity(intent);
            }
        });
    }

    public void setOneplus3tgoogleCameraLink(){
        oneplus3tgoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Google_Camera_OP3"));
                startActivity(intent);
            }
        });
    }
}
