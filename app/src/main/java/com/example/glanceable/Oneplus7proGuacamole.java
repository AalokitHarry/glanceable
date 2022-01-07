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

public class Oneplus7proGuacamole extends AppCompatActivity {
    MaterialCardView oneplus7prolistRoms, oneplus7proxdaThread, oneplus7progoogleCamera;
    ImageView oneplus7proarrowButton;
    TextView oneplus7prolistCustomRom;
    ConstraintLayout oneplus7proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus7pro_guacamole);

        //Material Cards
        oneplus7prolistRoms = findViewById(R.id.oneplus7prolistRoms);
        oneplus7proxdaThread = findViewById(R.id.oneplus7proxdaThread);
        oneplus7progoogleCamera = findViewById(R.id.oneplus7progoogleCamera);

        //Image/Text Button
        oneplus7proarrowButton = findViewById(R.id.oneplus7proarrowButton);
        oneplus7prolistCustomRom = findViewById(R.id.oneplus7prolistCustomRom);

        //Constraint Layout
        oneplus7proexpandedList = findViewById(R.id.oneplus7proexpandedList);

        setOnclickListenerTextButton();
        setOneplus7proxdaThread();
        setOneplus7progoogleCamera();
    }

    private void setOnclickListenerTextButton() {
        oneplus7proexpandedList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus7proexpandedList.getVisibility() == View.GONE) {
                    oneplus7proexpandedList.setVisibility(View.VISIBLE);
                    oneplus7proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                } else {
                    oneplus7proexpandedList.setVisibility(View.GONE);
                    oneplus7proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    private void setOneplus7proxdaThread() {
        oneplus7proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-7-pro"));
                startActivity(intent);
            }
        });
    }

    private void setOneplus7progoogleCamera() {
        oneplus7progoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/gcamOP7"));
                startActivity(intent);
            }
        });
    }
}
