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

public class XiaomiMiMix2Chiron extends AppCompatActivity {
    MaterialCardView mimix2listRoms, mimix2telegramGroup, mimix2xdaThread;
    ImageView mimix2arrowButton;
    TextView mimix2listCustomRom;
    ConstraintLayout mimix2expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi_mix2_chiron);

        //Material Cards
        mimix2listRoms = findViewById(R.id.mimix2listRoms);
        mimix2telegramGroup = findViewById(R.id.mimix2telegramGroup);
        mimix2xdaThread = findViewById(R.id.mimix2xdaThread);

        //Image/ Text Button
        mimix2arrowButton = findViewById(R.id.mimix2arrowButton);
        mimix2listCustomRom = findViewById(R.id.mimix2listCustomRom);

        //Constraint Layout
        mimix2expandedList = findViewById(R.id.mimix2expandedList);

        setonClickListenerTextButton();
        setMimix2telegramGroup();
        setMimix2xdaThread();
    }

    public void setonClickListenerTextButton(){
        mimix2listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mimix2expandedList.getVisibility()==View.GONE){
                    mimix2expandedList.setVisibility(View.VISIBLE);
                    mimix2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mimix2expandedList.setVisibility(View.GONE);
                    mimix2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMimix2telegramGroup(){
        mimix2telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/mimix2"));
                startActivity(intent);
            }
        });
    }

    public void setMimix2xdaThread(){
        mimix2xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-mix-2"));
                startActivity(intent);
            }
        });
    }
}
