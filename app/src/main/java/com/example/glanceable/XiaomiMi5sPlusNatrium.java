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

public class XiaomiMi5sPlusNatrium extends AppCompatActivity {
    MaterialCardView mi5sPluslistRoms, mi5sPlusxdaThread;
    ImageView mi5sPlusarrowButton;
    TextView mi5sPluslistCustomRom;
    ConstraintLayout mi5sPlusexpandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_mi5s_plus_natrium);

        //Material Cards
        mi5sPluslistRoms = findViewById(R.id.mi5sPluslistRoms);
        mi5sPlusxdaThread = findViewById(R.id.mi5sPlusxdaThread);

        //Text/Image Button
        mi5sPlusarrowButton = findViewById(R.id.mi5sPlusarrowButton);
        mi5sPluslistCustomRom = findViewById(R.id.mi5sPluslistCustomRom);

        //Constraint Layout
        mi5sPlusexpandedList = findViewById(R.id.mi5sPlusexpandedList);

        setonClickListenerTextButton();
        setMi5sPlusxdaThread();
    }

    public void setonClickListenerTextButton(){
        mi5sPluslistCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mi5sPlusexpandedList.getVisibility()==View.GONE){
                    mi5sPlusexpandedList.setVisibility(View.VISIBLE);
                    mi5sPlusarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    mi5sPlusexpandedList.setVisibility(View.GONE);
                    mi5sPlusarrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setMi5sPlusxdaThread(){
        mi5sPlusxdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/mi-5s-plus"));
                startActivity(intent);
            }
        });
    }
}
