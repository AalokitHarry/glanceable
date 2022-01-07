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

public class XiaomiMi8LitePlatina extends AppCompatActivity {
    MaterialCardView mi8litelistRoms, mi8litetelegramGroup, mi8litexdaThread;
    ImageView mi8litearrowButton;
    TextView mi8litelistCustomRom;
    ConstraintLayout mi8liteexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi8_lite_platina);

        //Material Cards
        mi8litelistRoms = findViewById(R.id.mi8litelistRoms);
        mi8litetelegramGroup = findViewById(R.id.mi8litetelegramGroup);
        mi8litexdaThread = findViewById(R.id.mi8litexdaThread);

        //Text/Image Button
        mi8litearrowButton = findViewById(R.id.mi8litearrowButton);
        mi8litelistCustomRom= findViewById(R.id.mi8litelistCustomRom);

        //Constraint Layout
        mi8liteexpandedList = findViewById(R.id.mi8liteexpandedList);

        setonClickTextButton();
        setMi8litetelegramGroup();
        setMi8litexdaThread();
    }

    public void setonClickTextButton(){
        mi8litelistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mi8liteexpandedList.getVisibility()==View.GONE){
                    mi8liteexpandedList.setVisibility(View.VISIBLE);
                    mi8litearrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mi8liteexpandedList.setVisibility(View.GONE);
                    mi8litearrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMi8litetelegramGroup(){
        mi8litetelegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/PlatinaGroup"));
                startActivity(intent);
            }
        });
    }

    public void setMi8litexdaThread(){
        mi8litexdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-8-Lite"));
                startActivity(intent);
            }
        });
    }
}
