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

public class XiaomiMiMix2sPolaris extends AppCompatActivity {
    MaterialCardView mimix2slistRoms, mimix2stelegramGroup, mimix2sxdaThread;
    ImageView mimix2sarrowButton;
    TextView mimix2slistCustomRom;
    ConstraintLayout mimix2sexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi_mix2s_polaris);

        //Material Cards
        mimix2slistRoms = findViewById(R.id.mimix2slistRoms);
        mimix2stelegramGroup = findViewById(R.id.mimix2telegramGroup);
        mimix2sxdaThread = findViewById(R.id.mimix2sxdaThread);

        //Image/ Text Button
        mimix2sarrowButton = findViewById(R.id.mimix2sarrowButton);
        mimix2slistCustomRom = findViewById(R.id.mimix2slistCustomRom);

        //Constraint Layout
        mimix2sexpandedList = findViewById(R.id.mimix2sexpandedList);

        setonClickListenerTextButton();
        setMimix2stelegramGroup();
        setMimix2sxdaThread();
    }

    public void setonClickListenerTextButton(){
        mimix2slistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mimix2sexpandedList.getVisibility()==View.GONE){
                    mimix2sexpandedList.setVisibility(View.VISIBLE);
                    mimix2sarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mimix2sexpandedList.setVisibility(View.GONE);
                    mimix2sarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMimix2stelegramGroup(){
        mimix2stelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/xda_mi_mix_2s"));
                startActivity(intent);
            }
        });
    }

    public void setMimix2sxdaThread(){
        mimix2sxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/xiaomi-mi-mix-2s"));
                startActivity(intent);
            }
        });
    }
}
