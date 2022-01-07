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

public class Oneplus2 extends AppCompatActivity {
    MaterialCardView oneplus2listRoms, oneplus2xdaThread, oneplus2googleCamera;
    ImageView oneplus2arrowButton;
    TextView oneplus2listCustomRom;
    ConstraintLayout oneplus2expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus2);

        //Material Cards
        oneplus2listRoms = findViewById(R.id.oneplus2listRoms);
        oneplus2xdaThread = findViewById(R.id.oneplus2xdaThread);
        oneplus2googleCamera = findViewById(R.id.oneplus2googleCamera);

        //Image/Text Button
        oneplus2arrowButton = findViewById(R.id.oneplus2arrowButton);
        oneplus2listCustomRom = findViewById(R.id.oneplus2listCustomRom);

        //Constraint Layout
        oneplus2expandedList = findViewById(R.id.oneplus2expandedList);

        setOnclickListenerTextButton();
        setOneplus2xdaThreadLink();
        setOneplus2googleCamera();
    }

    public void setOnclickListenerTextButton(){
        oneplus2listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus2expandedList.getVisibility()==View.GONE){
                    oneplus2expandedList.setVisibility(View.VISIBLE);
                    oneplus2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    oneplus2expandedList.setVisibility(View.GONE);
                    oneplus2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOneplus2xdaThreadLink(){
        oneplus2xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-2"));
                startActivity(intent);
            }
        });
    }

    public void setOneplus2googleCamera(){
        oneplus2googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.celsoazevedo.com/files/android/google-camera/"));
                startActivity(intent);
            }
        });
    }
}