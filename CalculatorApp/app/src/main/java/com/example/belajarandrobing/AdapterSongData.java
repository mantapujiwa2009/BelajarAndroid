package com.example.belajarandrobing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
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
    private OnItemClickListener listenersong;
    public interface OnItemClickListener {
        void onItemClick(SongModel song);
    }

    public AdapterSongData(List<SongModel> listSong, OnItemClickListener listenersong) {
        this.listSong = listSong;
        this.listenersong = listenersong;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView songNameTv;
        TextView singerTv;
        TextView streamsTv;
        ImageView songImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songNameTv = itemView.findViewById(R.id.songNameTv);
            singerTv = itemView.findViewById(R.id.singerTv);
            streamsTv = itemView.findViewById(R.id.streamsTv);
            songImg = itemView.findViewById(R.id.songImg);
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

        int songImg = listSong.get(position).getSongProfile();
        holder.songImg.setImageResource(songImg);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listenersong.onItemClick(listSong.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSong.size();
    }
}