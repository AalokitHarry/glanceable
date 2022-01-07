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

public class XiaomiPocoF1 extends AppCompatActivity {
    MaterialCardView pocof1listRoms, pocof1telegramGroup, pocof1xdaThread, pocof1googleCamera;
    ImageView pocof1arrowButton;
    TextView pocof1listCustomRom;
    ConstraintLayout pocof1expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_poco_f1);

        //Material Cards
        pocof1listRoms = findViewById(R.id.pocof1listRoms);
        pocof1telegramGroup = findViewById(R.id.pocof1telegramGroup);
        pocof1xdaThread = findViewById(R.id.pocof1xdaThread);
        pocof1googleCamera = findViewById(R.id.pocof1googleCamera);

        //Image/Text Button
        pocof1arrowButton = findViewById(R.id.pocof1arrowButton);
        pocof1listCustomRom = findViewById(R.id.pocof1listCustomRom);

        //Constraint Layout
        pocof1expandedList = findViewById(R.id.pocof1expandedList);

        setPocof1listCustomRom();
        setPocof1telegramGroup();
        setPocof1xdaThread();
        setPocof1googleCamera();
    }

    public void setPocof1listCustomRom(){
        pocof1listCustomRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pocof1expandedList.getVisibility()==View.GONE){
                    pocof1expandedList.setVisibility(View.VISIBLE);
                    pocof1arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_up_white_24dp);
                }else {
                    pocof1expandedList.setVisibility(View.GONE);
                    pocof1arrowButton.setImageResource(R.drawable.ic_keyboard_arrow_down_white_24dp);
                }
            }
        });
    }

    public void setPocof1telegramGroup(){
        pocof1telegramGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/PocophoneGlobalOfficial"));
                startActivity(intent);
            }
        });
    }

    public void setPocof1xdaThread(){
        pocof1xdaThread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forum.xda-developers.com/poco-f1"));
                startActivity(intent);
            }
        });
    }

    public void setPocof1googleCamera(){
        pocof1googleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/PocoPhonePhotography"));
                startActivity(intent);
            }
        });
    }
}
