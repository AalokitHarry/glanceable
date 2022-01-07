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

public class Oneplus5tDumpling extends AppCompatActivity {
    MaterialCardView oneplus5tlistRoms, oneplus5txdaThread, oneplus5tgoogleCamera;
    ImageView oneplus5tarrowButton;
    TextView oneplus5tlistCustomRom;
    ConstraintLayout oneplus5texpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus5t_dumpling);

        //Material Cards
        oneplus5tlistRoms = findViewById(R.id.oneplus5tlistRoms);
        oneplus5txdaThread = findViewById(R.id.oneplus5txdaThread);
        oneplus5tgoogleCamera = findViewById(R.id.oneplus5tgoogleCamera);

        //Text/Image Button
        oneplus5tarrowButton = findViewById(R.id.oneplus5tarrowButton);
        oneplus5tlistCustomRom = findViewById(R.id.oneplus5tlistCustomRom);

        //Constraint Layout
        oneplus5texpandedList = findViewById(R.id.oneplus5texpandedList);

        setOnclickListenerTextButton();
        setOneplus5txdaThreadLink();
        setOneplus5tgoogleCameraLink();
    }

    public  void setOnclickListenerTextButton(){
        oneplus5tlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oneplus5texpandedList.getVisibility()==View.GONE){
                    oneplus5texpandedList.setVisibility(View.VISIBLE);
                    oneplus5tarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    oneplus5texpandedList.setVisibility(View.GONE);
                    oneplus5tarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setOneplus5txdaThreadLink(){
        oneplus5txdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/oneplus-5t"));
                startActivity(intent);
            }
        });
    }

    public void setOneplus5tgoogleCameraLink(){
        oneplus5tgoogleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/gcamOneplus"));
                startActivity(intent);
            }
        });
    }
}
