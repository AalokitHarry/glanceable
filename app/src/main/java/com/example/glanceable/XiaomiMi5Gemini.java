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

public class XiaomiMi5Gemini extends AppCompatActivity {
    MaterialCardView mi5listRoms, mi5xdaThread;
    ImageView mi5arrowButton;
    TextView mi5listCustomRom;
    ConstraintLayout mi5expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi5_gemini);

        //Material Cards
        mi5listRoms = findViewById(R.id.mi5listRoms);
        mi5xdaThread = findViewById(R.id.mi5xdaThread);

        //Text/Image Button
        mi5arrowButton = findViewById(R.id.mi5arrowButton);
        mi5listCustomRom = findViewById(R.id.mi5listCustomRom);

        //Constraint Layout
        mi5expandedList = findViewById(R.id.mi5expandedList);

        setonClickTextButton();
        setMi5xdaThread();
    }

    public void setonClickTextButton(){
        mi5listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mi5expandedList.getVisibility()==View.GONE){
                    mi5expandedList.setVisibility(View.VISIBLE);
                    mi5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mi5expandedList.setVisibility(View.GONE);
                    mi5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMi5xdaThread(){
        mi5xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-5"));
                startActivity(intent);
            }
        });
    }
}
