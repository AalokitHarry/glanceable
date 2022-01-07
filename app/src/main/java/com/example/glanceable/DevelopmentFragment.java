package com.example.glanceable;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import java.util.ArrayList;

public class DevelopmentFragment extends Fragment implements DevelopmentRecyclerAdapter.OnDeviceClickListener {

    private RecyclerView developmentRecycler;
    private DevelopmentRecyclerAdapter developmentRecyclerAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<DevelopmentCustomData> developmentCustomData;

    public DevelopmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_development, container, false);

        developmentRecycler = v.findViewById(R.id.developmentRecycler);

        layoutManager = new LinearLayoutManager(getActivity());
        developmentRecycler.setLayoutManager(layoutManager);

        developmentRecyclerAdapter = new DevelopmentRecyclerAdapter(getContext(), developmentCustomData, this);
        developmentRecycler.setAdapter(developmentRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        developmentCustomData = new ArrayList<>();
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.asuszenfonemaxprom1, "Asus Zenfone Max Pro M1"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.asuszenfonemaxprom2, "Asus Zenfone Max Pro M2"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.google_nexus_5x, "Google Nexus 5X (Bullhead)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.google_nexus_6p, "Google Nexus 6P (Angler)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Motorola G5 Plus (Potter)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Motorola G5s Plus (Sanders)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Motorola One Power (Chef)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Motorola X4 (Payton)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 2"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 3T"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 5 (Cheeseburger)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 5T (Dumpling)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 6 (Enchilada)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 6T (Fajita)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 7 (Guacamoleb)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "OnePlus 7 Pro (Guacamole)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Realme 3 Pro"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Realme 5 Pro"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Samsung S7/S7 Edge"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi K20/Mi 9T (Davinci)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi K20 Pro/ Mi 9T Pro (Raphael)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi5 (Gemini)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi 5S (Capricorn)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi 5S Plus (Natrium)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi 8 (Dipper)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi 8 Lite (Platina)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi 9 (Cepheus)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi 9SE (Grus)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi A1 (Tissot)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi A2 (JasmineSprout)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi A3 (LaurelSprout)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi Mix (Lithium)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi Mix 2 (Chiron)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi Mix 2S (Polaris)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Mi Note 2 (Scorpio)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Poco F1 (Beryllium)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi 3S/3X (Land)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi 4/4X (Santoni)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi 4A (Rolex)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi 5 (Rosy)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi 5A (Riva)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi 6 Pro (Sakura)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 3 Pro (Kenzo)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 4/4X (Mido)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 5 Plus (Vince)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 5 Pro (Whyred)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 7 (Lavender)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 7 Pro (Voilet)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 8/8T (Ginkgo/Willow)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Note 8 Pro (Begonia)"));
        developmentCustomData.add(new DevelopmentCustomData(R.drawable.motorola_g5_plus, "Xiaomi Redmi Poco X2 (Phoenix)"));

    }

    @Override
    public void onDeviceClick(int position) {
        if (position == 0) {
            Intent intent = new Intent(getActivity(), AsusZenfoneMaxProM1.class);
            startActivity(intent);
        } else if (position == 1) {
            Intent intent = new Intent(getActivity(), AsusZenfoneMaxProM2.class);
            startActivity(intent);
        } else if (position == 2) {
            Intent intent = new Intent(getActivity(), GoogleNexus5xBullhead.class);
            startActivity(intent);
        } else if (position == 3) {
            Intent intent = new Intent(getActivity(), GoogleNexus6pAngler.class);
            startActivity(intent);
        }else if (position == 4) {
            Intent intent = new Intent(getActivity(), MotorolaG5PlusPotter.class);
            startActivity(intent);
        }else if (position == 5) {
            Intent intent = new Intent(getActivity(), MotorolaG5sPlusSanders.class);
            startActivity(intent);
        }else if (position == 6) {
            Intent intent = new Intent(getActivity(), MotorolaOnePowerChef.class);
            startActivity(intent);
        }else if (position == 7) {
            Intent intent = new Intent(getActivity(), MotorolaX4Payton.class);
            startActivity(intent);
        }else if (position == 8) {
            Intent intent = new Intent(getActivity(), Oneplus2.class);
            startActivity(intent);
        }else if (position == 9) {
            Intent intent = new Intent(getActivity(), Oneplus3t.class);
            startActivity(intent);
        }else if (position == 10) {
            Intent intent = new Intent(getActivity(), Oneplus5Cheeseburger.class);
            startActivity(intent);
        }else if (position == 11) {
            Intent intent = new Intent(getActivity(), Oneplus5tDumpling.class);
            startActivity(intent);
        }else if (position == 12) {
            Intent intent = new Intent(getActivity(), Oneplus6Enchilada.class);
            startActivity(intent);
        }else if (position == 13) {
            Intent intent = new Intent(getActivity(), Oneplus6tFajita.class);
            startActivity(intent);
        }else if (position == 14) {
            Intent intent = new Intent(getActivity(), Oneplus7Guacamoleb.class);
            startActivity(intent);
        }else if (position == 15) {
            Intent intent = new Intent(getActivity(), Oneplus7proGuacamole.class);
            startActivity(intent);
        }else if (position == 16) {
            Intent intent = new Intent(getActivity(), Realme3pro.class);
            startActivity(intent);
        }else if (position == 17) {
            Intent intent = new Intent(getActivity(), Realme5pro.class);
            startActivity(intent);
        }else if (position == 18) {
            Intent intent = new Intent(getActivity(), SamsungS7S7edgeHerolteHero2lte.class);
            startActivity(intent);
        }else if (position == 19) {
            Intent intent = new Intent(getActivity(), XiaomiK20Mi9tDavinci.class);
            startActivity(intent);
        }else if (position == 20) {
            Intent intent = new Intent(getActivity(), XiaomiK20ProMi9tProRaphael.class);
            startActivity(intent);
        }else if (position == 21) {
            Intent intent = new Intent(getActivity(), XiaomiMi5Gemini.class);
            startActivity(intent);
        }else if (position == 22) {
            Intent intent = new Intent(getActivity(), XiaomiMi5sCapricorn.class);
            startActivity(intent);
        }else if (position == 23) {
            Intent intent = new Intent(getActivity(), XiaomiMi5sPlusNatrium.class);
            startActivity(intent);
        }else if (position == 24) {
            Intent intent = new Intent(getActivity(), XiaomiMi8Dipper.class);
            startActivity(intent);
        }else if (position == 25) {
            Intent intent = new Intent(getActivity(), XiaomiMi8LitePlatina.class);
            startActivity(intent);
        }else if (position == 26) {
            Intent intent = new Intent(getActivity(), XiaomiMi9Cepheus.class);
            startActivity(intent);
        }else if (position == 27) {
            Intent intent = new Intent(getActivity(), XiaomiMi9seGrus.class);
            startActivity(intent);
        }else if (position == 28) {
            Intent intent = new Intent(getActivity(), XiaomiMiA1Tissot.class);
            startActivity(intent);
        }else if (position == 29) {
            Intent intent = new Intent(getActivity(), XiaomiMiA2JasmineSprout.class);
            startActivity(intent);
        }else if (position == 30) {
            Intent intent = new Intent(getActivity(), XiaomiMiA3LaurelSprout.class);
            startActivity(intent);
        }else if (position == 31) {
            Intent intent = new Intent(getActivity(), XiaomiMiMixLithium.class);
            startActivity(intent);
        }else if (position == 32) {
            Intent intent = new Intent(getActivity(), XiaomiMiMix2Chiron.class);
            startActivity(intent);
        }else if (position == 33) {
            Intent intent = new Intent(getActivity(), XiaomiMiMix2sPolaris.class);
            startActivity(intent);
        }else if (position == 34) {
            Intent intent = new Intent(getActivity(), XiaomiMiNote2Scorpio.class);
            startActivity(intent);
        }else if (position == 35) {
            Intent intent = new Intent(getActivity(), XiaomiPocoF1.class);
            startActivity(intent);
        }else if (position == 36) {
            Intent intent = new Intent(getActivity(), XiaomiRedmi3s3xLand.class);
            startActivity(intent);
        }else if (position == 37) {
            Intent intent = new Intent(getActivity(), XiaomiRedmi4_4xSantoni.class);
            startActivity(intent);
        }else if (position == 38) {
            Intent intent = new Intent(getActivity(), XiaomiRedmi4aRolex.class);
            startActivity(intent);
        }else if (position == 39) {
            Intent intent = new Intent(getActivity(), XiaomiRedmi5Rosy.class);
            startActivity(intent);
        }else if (position == 40) {
            Intent intent = new Intent(getActivity(), XiaomiRedmi5aRiva.class);
            startActivity(intent);
        }else if (position == 41) {
            Intent intent = new Intent(getActivity(), XiaomiRedmi6proSakura.class);
            startActivity(intent);
        }else if (position == 42) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote3proKenzo.class);
            startActivity(intent);
        }else if (position == 43) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote4_4xMido.class);
            startActivity(intent);
        }else if (position == 44) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote5PlusVince.class);
            startActivity(intent);
        }else if (position == 45) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote5proWhyred.class);
            startActivity(intent);
        }else if (position == 46) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote7Lavender.class);
            startActivity(intent);
        }else if (position == 47) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote7ProVoilet.class);
            startActivity(intent);
        }else if (position == 48) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote88tGinkgoWillow.class);
            startActivity(intent);
        }else if (position == 49) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiNote8proBegonia.class);
            startActivity(intent);
        }else if (position == 50) {
            Intent intent = new Intent(getActivity(), XiaomiRedmiPocoX2Phoenix.class);
            startActivity(intent);
        }
    }
}

