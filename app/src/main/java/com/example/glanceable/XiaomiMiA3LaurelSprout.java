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

public class XiaomiMiA3LaurelSprout extends AppCompatActivity {
    MaterialCardView mia3listRoms, mia3telegramGroup, mia3xdaThread;
    ImageView mia3arrowButton;
    TextView mia3listCustomRom;
    ConstraintLayout mia3expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi_a3_laurel_sprout);

        // Material Cards
        mia3listRoms = findViewById(R.id.mia3listRoms);
        mia3telegramGroup = findViewById(R.id.mia3telegramGroup);
        mia3xdaThread = findViewById(R.id.mia3xdaThread);

        //Image/Text Button
        mia3arrowButton = findViewById(R.id.mia3arrowButton);
        mia3listCustomRom = findViewById(R.id.mia3listCustomRom);

        //Constraint Layout
        mia3expandedList = findViewById(R.id.mia3expandedList);

        setonCLickListenerTextButton();
        setMia3telegramGroup();
        setMia3xdaThread();
    }

    public void setonCLickListenerTextButton(){
        mia3listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mia3expandedList.getVisibility()==View.GONE){
                    mia3expandedList.setVisibility(View.VISIBLE);
                    mia3arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mia3expandedList.setVisibility(View.GONE);
                    mia3arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMia3telegramGroup(){
        mia3telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/A3Official"));
                startActivity(intent);
            }
        });
    }

    public void setMia3xdaThread(){
        mia3xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-a3"));
                startActivity(intent);
            }
        });
    }
}
