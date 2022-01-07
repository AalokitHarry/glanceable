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

public class XiaomiRedmiNote3proKenzo extends AppCompatActivity {
    MaterialCardView note3prolistRoms, note3protelegramGroup, note3proxdaThread;
    ImageView note3proarrowButton;
    TextView note3prolistCustomRom;
    ConstraintLayout note3proexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note3pro_kenzo);

        //Material Cards
        note3prolistRoms = findViewById(R.id.note3prolistRoms);
        note3protelegramGroup = findViewById(R.id.note3protelegramGroup);
        note3proxdaThread = findViewById(R.id.note3proxdaThread);

        //Image/Text Button
        note3proarrowButton = findViewById(R.id.note3proarrowButton);
        note3prolistCustomRom = findViewById(R.id.note3prolistCustomRom);

        //Constraint Layout
        note3proexpandedList = findViewById(R.id.note3proexpandedList);

        setNote3prolistCustomRom();
        setNote3protelegramGroup();
        setNote3proxdaThread();
    }

    public void setNote3prolistCustomRom(){
        note3prolistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (note3proexpandedList.getVisibility()==View.GONE){
                    note3proexpandedList.setVisibility(View.VISIBLE);
                    note3proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    note3proexpandedList.setVisibility(View.GONE);
                    note3proarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setNote3protelegramGroup(){
        note3protelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/CB_nTu21"));
                startActivity(intent);
            }
        });
    }

    public void setNote3proxdaThread(){
        note3proxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-note-3"));
                startActivity(intent);
            }
        });
    }
}
