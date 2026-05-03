package com.example.belajarandrobing;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSong extends AppCompatActivity {

    RecyclerView songRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_song);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        songRv = (RecyclerView)findViewById(R.id.rvListSong);
        ArrayList<SongModel> listSongData = new ArrayList<>();

        SongModel song1 = new SongModel("Virtual Insanity", "Jamiroquai", "457m Streams",R.drawable.virtualinsanityy);
        listSongData.add(song1);

        SongModel song2 = new SongModel("Good Old Fashioned Lover-Boy", "Queen","429m Streams",R.drawable.goodoldfashioned);
        listSongData.add(song2);

        SongModel song3 = new SongModel("Drown", "Bring Me The Horizon","357m Streams",R.drawable.drown);
        listSongData.add(song3);

        SongModel song4 = new SongModel("Jim Labrador", "The Panturas", "15m Streams",R.drawable.jim);
        listSongData.add(song4);

        SongModel song5 = new SongModel("Hey Jude", "The Beatles", "747m Streams",R.drawable.jude);
        listSongData.add(song5);

        SongModel song6 = new SongModel("Black Sheep", "Metric", "218m Streams",R.drawable.blackseep);
        listSongData.add(song6);

        SongModel song7 = new SongModel("Basket Case", "Green Day", "1.5B Streams",R.drawable.basket);
        listSongData.add(song7);

        SongModel song8 = new SongModel("Jigsaw Falling Into Place", "RadioHead", "417m Streams",R.drawable.jigsaw);
        listSongData.add(song8);

        SongModel song9 = new SongModel("The Adults Are Talking", "The Strokes",  "772m Streams",R.drawable.thheadults);
        listSongData.add(song9);

        SongModel song10 = new SongModel("Setengah Lima", "Sore Ze Band", "9m Streams",R.drawable.set5);
        listSongData.add(song10);

        AdapterSongData adapter = new AdapterSongData(listSongData, new AdapterSongData.OnItemClickListener() {
            @Override
            public void onItemClick(SongModel song) {

            }
        });

        songRv.setLayoutManager(new LinearLayoutManager(this));
        songRv.setAdapter(adapter);
    }
}