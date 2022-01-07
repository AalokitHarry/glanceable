package com.example.glanceable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import org.w3c.dom.Text;

public class XiaomiRedmiPocoX2Phoenix extends AppCompatActivity {
    MaterialCardView pocox2listRoms, pocox2telegramGroup, pocox2xdaThread, pocox2googleCamera;
    ImageView pocox2arrowButton;
    TextView pocox2listCustomRom;
    ConstraintLayout pocox2expandedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaomi_redmi_poco_x2_phoenix);
    }
}
