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

public class GoogleNexus5xBullhead extends AppCompatActivity {
    MaterialCardView nexus5xlistRoms, nexus5xxdaThread;
    ImageView nexus5xarrowButton;
    TextView nexus5xlistCustomRom;
    ConstraintLayout nexus5xexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_nexus5x_bullhead);

        //cards input
        nexus5xlistRoms = findViewById(R.id.nexus5xlistRoms);
        nexus5xxdaThread = findViewById(R.id.nexus5xxdaThread);

        //Text/Image Buttons
        nexus5xarrowButton = findViewById(R.id.nexus5xarrowButton);
        nexus5xlistCustomRom = findViewById(R.id.nexus5xlistCustomRom);

        //ROMs list
        nexus5xexpandedList = findViewById(R.id.nexus5xexpandedList);

        setonClickListenerTextButton();
        setNexus5xxdaThreadLink();
    }

    public void setonClickListenerTextButton(){
        nexus5xlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nexus5xexpandedList.getVisibility()==View.GONE){
                    nexus5xexpandedList.setVisibility(View.VISIBLE);
                    nexus5xarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    nexus5xexpandedList.setVisibility(View.GONE);
                    nexus5xarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setNexus5xxdaThreadLink(){
        nexus5xxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/nexus-5x"));
                startActivity(intent);
            }
        });
    }
}
