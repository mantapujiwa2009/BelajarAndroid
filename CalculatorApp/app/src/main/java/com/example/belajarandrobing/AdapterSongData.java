package com.example.belajarandrobing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterSongData extends RecyclerView.Adapter<AdapterSongData.ViewHolder> {

    private List<SongModel> listSong;

    public AdapterSongData(List<SongModel> listSong) {this.listSong = listSong;}

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView songNameTv;
        TextView singerTv;
        TextView streamsTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songNameTv = itemView.findViewById(R.id.songNameTv);
            singerTv = itemView.findViewById(R.id.singerTv);
            streamsTv = itemView.findViewById(R.id.streamsTv);
        }
    }

    @NonNull
    @Override
    public AdapterSongData.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_adapter_song_data, parent, false);
        return new AdapterSongData.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSongData.ViewHolder holder, int position) {
        String songName = listSong.get(position).getSongName();
        holder.songNameTv.setText(songName);

        String singer = listSong.get(position).getSinger();
        holder.singerTv.setText(singer);

        String streams = listSong.get(position).getTotalStreams();
        holder.streamsTv.setText(streams);
    }

    @Override
    public int getItemCount() {
        return listSong.size();
    }
}