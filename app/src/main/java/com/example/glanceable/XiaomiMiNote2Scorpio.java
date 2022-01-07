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

public class XiaomiMiNote2Scorpio extends AppCompatActivity {
    MaterialCardView minote2listRoms;
    MaterialCardView minote2xdaThread;
    ImageView minote2arrowButton;
    TextView minote2listCustomRom;
    ConstraintLayout minote2expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi_note2_scorpio);

        // Material Cards
        minote2listRoms = findViewById(R.id.minote2listRoms);
        minote2xdaThread = findViewById(R.id.minote2xdaThread);

        //Text/Image Button
        minote2arrowButton = findViewById(R.id.minote2arrowButton);
        minote2listCustomRom = findViewById(R.id.minote2listCustomRom);

        //Constraint Layout
        minote2expandedList = findViewById(R.id.minote2expandedList);

        setMinote2listCustomRom();
        setMinote2xdaThread();
    }

    public void setMinote2listCustomRom(){
        minote2listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minote2expandedList.getVisibility()==View.GONE){
                    minote2expandedList.setVisibility(View.VISIBLE);
                    minote2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    minote2expandedList.setVisibility(View.GONE);
                    minote2arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMinote2xdaThread(){
        minote2xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-note-2"));
                startActivity(intent);
            }
        });
    }
}
