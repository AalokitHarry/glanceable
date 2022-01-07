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

public class XiaomiMiMixLithium extends AppCompatActivity {
    MaterialCardView mimixlistRoms, mimixtelegramGroup, mimixxdaThread;
    ImageView mimixarrowButton;
    TextView mimixlistCustomRom;
    ConstraintLayout mimixexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi_mix_lithium);

        //Material Cards
        mimixlistRoms = findViewById(R.id.mimixlistRoms);
        mimixtelegramGroup = findViewById(R.id.mimixtelegramGroup);
        mimixxdaThread = findViewById(R.id.mimixxdaThread);

        //Image/Text Button
        mimixarrowButton = findViewById(R.id.mimixarrowButton);
        mimixlistCustomRom = findViewById(R.id.mimixlistCustomRom);

        //Constraint Layout
        mimixexpandedList = findViewById(R.id.mimixexpandedList);

        setonClickListenerTextButton();
        setMimixtelegramGroup();
        setMimixxdaThread();
    }

    public void setonClickListenerTextButton(){
        mimixlistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mimixexpandedList.getVisibility()==View.GONE){
                    mimixexpandedList.setVisibility(View.VISIBLE);
                    mimixarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mimixexpandedList.setVisibility(View.GONE);
                    mimixarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMimixtelegramGroup(){
        mimixtelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/xdamimix"));
                startActivity(intent);
            }
        });
    }

    public void setMimixxdaThread(){
        mimixxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-mix"));
                startActivity(intent);
            }
        });
    }
}
