package com.example.glanceable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class Info extends AppCompatActivity {
    MaterialCardView instaProfile, fbProfile, googlePlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //Material Cards
        instaProfile = findViewById(R.id.instaProfile);
        fbProfile = findViewById(R.id.fbProfile);
        googlePlay = findViewById(R.id.googlePlay);

        setInstaProfile();
        setfbProfile();
        setGooglePlay();
    }

    public void setInstaProfile(){
        instaProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aalokit/"));
                startActivity(intent);
            }
        });
    }

    public void setfbProfile(){
        fbProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/aalokitharry"));
                startActivity(intent);
            }
        });
    }

    public void setGooglePlay(){
        googlePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
                startActivity(intent);
            }
        });
    }
}
