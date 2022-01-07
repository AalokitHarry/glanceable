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

public class GoogleNexus6pAngler extends AppCompatActivity {
    MaterialCardView nexus6plistRoms, nexus6pxdaThread;
    ImageView nexus6parrowButton;
    TextView nexus6plistCustomRom;
    ConstraintLayout nexus6pexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_nexus6p_angler);

        //Material Cards
        nexus6plistRoms = findViewById(R.id.nexus6plistRoms);
        nexus6pxdaThread = findViewById(R.id.nexus6pxdaThread);

        //Image/Text Button
        nexus6parrowButton = findViewById(R.id.nexus6parrowButton);
        nexus6plistCustomRom = findViewById(R.id.nexus6plistCustomRom);

        //constraintLayout
        nexus6pexpandedList = findViewById(R.id.nexus6pexpandedList);

        setNexus6plistCustomRom();
        setNexus6pxdaThreadLink();
    }

    public void setNexus6plistCustomRom(){
        nexus6plistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nexus6pexpandedList.getVisibility()==View.GONE){
                    nexus6pexpandedList.setVisibility(View.VISIBLE);
                    nexus6parrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    nexus6pexpandedList.setVisibility(View.GONE);
                    nexus6parrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setNexus6pxdaThreadLink(){
        nexus6pxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/nexus-6p"));
                startActivity(intent);
            }
        });
    }
}
