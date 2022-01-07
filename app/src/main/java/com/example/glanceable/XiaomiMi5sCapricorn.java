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

public class XiaomiMi5sCapricorn extends AppCompatActivity {
    MaterialCardView mi5slistRoms, mi5sxdaThread;
    ImageView mi5sarrowButton;
    TextView mi5slistCustomRom;
    ConstraintLayout mi5sexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi5s_capricorn);

        //Material Cards
        mi5slistRoms = findViewById(R.id.mi5slistRoms);
        mi5sxdaThread = findViewById(R.id.mi5sxdaThread);

        //Image/Text Button
        mi5sarrowButton = findViewById(R.id.mi5sarrowButton);
        mi5slistCustomRom = findViewById(R.id.mi5slistCustomRom);

        //Constraint Layout
        mi5sexpandedList = findViewById(R.id.mi5sexpandedList);

        setonClickListenerTextButton();
        setMi5sxdaThread();
    }

    public void setonClickListenerTextButton(){
        mi5slistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mi5sexpandedList.getVisibility()==View.GONE){
                    mi5sexpandedList.setVisibility(View.VISIBLE);
                    mi5sarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mi5sexpandedList.setVisibility(View.GONE);
                    mi5sarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMi5sxdaThread(){
        mi5sxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-5s"));
                startActivity(intent);
            }
        });
    }
}
