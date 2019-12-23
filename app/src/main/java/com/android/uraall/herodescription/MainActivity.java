package com.android.uraall.herodescription;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<HeroDescriptionItem> heroDescriptionItems = new ArrayList<>();

        heroDescriptionItems.add(new HeroDescriptionItem(R.drawable.hero_1,
                Utils.HERO_1_TITLE, Utils.HERO_1_POSITION,
                Utils.HERO_1_DESCRIPTION));
        heroDescriptionItems.add(new HeroDescriptionItem(R.drawable.hero_2,
                Utils.HERO_2_TITLE, Utils.HERO_2_POSITION,
                Utils.HERO_2_DESCRIPTION));
        heroDescriptionItems.add(new HeroDescriptionItem(R.drawable.hero_3,
                Utils.HERO_3_TITLE, Utils.HERO_3_POSITION,
                Utils.HERO_3_DESCRIPTION));
        heroDescriptionItems.add(new HeroDescriptionItem(R.drawable.hero_4,
                Utils.HERO_4_TITLE, Utils.HERO_4_POSITION,
                Utils.HERO_4_DESCRIPTION));
        heroDescriptionItems.add(new HeroDescriptionItem(R.drawable.hero_5,
                Utils.HERO_5_TITLE, Utils.HERO_5_POSITION,
                Utils.HERO_5_DESCRIPTION));
        heroDescriptionItems.add(new HeroDescriptionItem(R.drawable.hero_6,
                Utils.HERO_6_TITLE, Utils.HERO_6_POSITION,
                Utils.HERO_6_DESCRIPTION));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new HeroDescriptionAdapter(heroDescriptionItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        //добавляем эпичности и запускаем
        mediaPlayer = MediaPlayer.create(this, R.raw.epic);
        mediaPlayer.start();
    }
}
