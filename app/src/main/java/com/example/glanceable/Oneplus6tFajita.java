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

public class Oneplus6tFajita extends AppCompatActivity {
    MaterialCardView oneplus6tlistRoms, oneplus6ttelegramGroup, oneplus6txdaThread, oneplus6tgoogleCamera;
    ImageView oneplus6tarrowButton;
    TextView oneplus6tlistCustomRom;
    ConstraintLayout oneplus6texpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus6t_fajita);

        //Material Cards
        oneplus6tlistRoms = findViewById(R.id.oneplus6tlistRoms);
        oneplus6ttelegramGroup = findViewById(R.id.oneplus6ttelegramGroup);
        oneplus6txdaThread = findViewById(R.id.oneplus6txdaThread);
        oneplus6tgoogleCamera = findViewById(R.id.oneplus6tgoogleCamera);

        //Text/Image Button
        oneplus6tarrowButton = findViewById(R.id.oneplus6tarrowButton);
        oneplus6tlistCustomRom = findViewById(R.id.oneplus6tlistCustomRom);

        //Constraint Layout
        oneplus6texpandedList = findViewById(R.id.oneplus6texpandedList);

        setOnclickListenerTextButton();
        setOneplus6ttelegramGroup();
        setOneplus6txdaThread();
        setOneplus6tgoogleCamera();
    }

    public void setOnclickListenerTextButton(){
        oneplus6tlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus6texpandedList.getVisibility()==View.GONE){
                    oneplus6texpandedList.setVisibility(View.VISIBLE);
                    oneplus6tarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    oneplus6texpandedList.setVisibility(View.GONE);
                    oneplus6tarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOneplus6ttelegramGroup(){
        oneplus6ttelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/op6news"));
                startActivity(intent);
            }
        });
    }

    public void setOneplus6txdaThread(){
        oneplus6txdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-6t"));
                startActivity(intent);
            }
        });
    }

    public void setOneplus6tgoogleCamera(){
        oneplus6tgoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/gcamop6"));
                startActivity(intent);
            }
        });
    }
}
