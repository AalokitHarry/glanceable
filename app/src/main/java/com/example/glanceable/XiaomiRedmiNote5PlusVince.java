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

public class XiaomiRedmiNote5PlusVince extends AppCompatActivity {
    MaterialCardView redminote5listRoms, redminote5telegramGroup, redminote5xdaThread;
    ImageView redminote5arrowButton;
    TextView redminote5listCustomRom;
    ConstraintLayout redminote5expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_note5_plus_vince);

        //Material Cards
        redminote5listRoms = findViewById(R.id.redminote5listRoms);
        redminote5telegramGroup = findViewById(R.id.redminote5telegramGroup);
        redminote5xdaThread = findViewById(R.id.redminote5xdaThread);

        //Image/Text Button
        redminote5arrowButton = findViewById(R.id.redminote5arrowButton);
        redminote5listCustomRom = findViewById(R.id.redminote5listCustomRom);

        //Constraint Layout
        redminote5expandedList = findViewById(R.id.redminote5expandedList);

        setRedminote5listCustomRom();
        setRedminote5telegramGroup();
        setRedminote5xdaThread();
    }

    public void setRedminote5listCustomRom(){
        redminote5listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (redminote5expandedList.getVisibility()==View.GONE){
                    redminote5expandedList.setVisibility(View.VISIBLE);
                    redminote5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    redminote5expandedList.setVisibility(View.GONE);
                    redminote5arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setRedminote5telegramGroup(){
        redminote5telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/redmi5plusofficial"));
                startActivity(intent);
            }
        });
    }

    public void setRedminote5xdaThread(){
        redminote5xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/redmi-note-5"));
                startActivity(intent);
            }
        });
    }
}
