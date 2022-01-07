package com.example.glanceable;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    MaterialCardView pixelExperience, lineageOS, aospExtended, havocOS, evolutionX, arrowOS, crdroid, pixysOS, aosip, resurrectionRemix, cesiumOS, extendedUI;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        //Finding cardviews
        pixelExperience = v.findViewById(R.id.pixelExperience);
        lineageOS = v.findViewById(R.id.lineageOS);
        aospExtended = v.findViewById(R.id.aospExtended);
        havocOS = v.findViewById(R.id.havocOS);
        evolutionX = v.findViewById(R.id.evolutionX);
        arrowOS = v.findViewById(R.id.arrowOS);
        crdroid = v.findViewById(R.id.crdroid);
        pixysOS = v.findViewById(R.id.pixysOS);
        aosip = v.findViewById(R.id.aosip);
        resurrectionRemix = v.findViewById(R.id.resurrectionRemix);
        cesiumOS = v.findViewById(R.id.cesiumOS);
        extendedUI = v.findViewById(R.id.extendedUI);

        setPixelExperienceLink();
        setLineageOSLink();
        setAosipLink();
        setAospExtendedLink();
        setArrowOSLink();
        setCesiumOSLink();
        setCrdroidLink();
        setEvolutionXLink();
        setExtendedUILink();
        setHavocOSLink();
        setPixysOSLink();
        setResurrectionRemixLink();
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void setPixelExperienceLink(){
        pixelExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://download.pixelexperience.org/"));
                startActivity(intent);
            }
        });
    }

    public void setLineageOSLink(){
        lineageOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lineageos.org/"));
                startActivity(intent);
            }
        });
    }

    public void setAospExtendedLink(){
        aospExtended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aospextended.com/"));
                startActivity(intent);
            }
        });
    }

    public void setHavocOSLink(){
        havocOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sourceforge.net/projects/havoc-os/"));
                startActivity(intent);
            }
        });
    }

    public void setEvolutionXLink(){
        evolutionX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sourceforge.net/projects/havoc-os/"));
                startActivity(intent);
            }
        });
    }
    public void setArrowOSLink(){
        arrowOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://arrowos.net/"));
                startActivity(intent);
            }
        });
    }

    public void setCrdroidLink(){
        crdroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://crdroid.net/"));
                startActivity(intent);
            }
        });
    }

    public void setPixysOSLink(){
        pixysOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://downloads.pixysos.com/"));
                startActivity(intent);
            }
        });
    }

    public void setAosipLink(){
        aosip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aosip.dev/"));
                startActivity(intent);
            }
        });
    }

    public void setResurrectionRemixLink(){
        resurrectionRemix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.resurrectionremix.com/"));
                startActivity(intent);
            }
        });
    }
    public void setCesiumOSLink(){
        cesiumOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cesiumos.xyz/"));
                startActivity(intent);
            }
        });
    }

    public void setExtendedUILink(){
        extendedUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sourceforge.net/projects/extendedui/"));
                startActivity(intent);
            }
        });
    }
}
