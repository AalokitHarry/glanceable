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

public class XiaomiMi8Dipper extends AppCompatActivity {
    MaterialCardView mi8listRoms, mi8xdaThread;
    ImageView mi8arrowButton;
    TextView mi8listCustomRom;
    ConstraintLayout mi8expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi8_dipper);

        //Material Cards
        mi8listRoms = findViewById(R.id.mi8listRoms);
        mi8xdaThread = findViewById(R.id.mi8xdaThread);

        //Text/Image Button
        mi8arrowButton = findViewById(R.id.mi8arrowButton);
        mi8listCustomRom = findViewById(R.id.mi8listCustomRom);

        //Constraint Layout
        mi8expandedList = findViewById(R.id.mi8expandedList);

        setMi8xdaThread();
        setonClickListenerTextButton();
    }

    public void setonClickListenerTextButton(){
        mi8listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mi8expandedList.getVisibility()==View.GONE){
                    mi8expandedList.setVisibility(View.VISIBLE);
                    mi8arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mi8expandedList.setVisibility(View.GONE);
                    mi8arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMi8xdaThread(){
        mi8xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-8"));
                startActivity(intent);
            }
        });
    }
}
