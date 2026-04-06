package com.example.belajarandrobing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterDataSiswa extends RecyclerView.Adapter<AdapterDataSiswa.ViewHolder> {

    private List<SiswaModel> listSiswa;

    // constructor
    public AdapterDataSiswa(List<SiswaModel> listSiswa) {
        this.listSiswa = listSiswa;
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.txtNama);
        }
    }

    @NonNull
    @Override
    public AdapterDataSiswa.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_datasiswa, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDataSiswa.ViewHolder holder, int position) {
        String nama = listSiswa.get(position).getNama();
        holder.tvNama.setText(nama);
    }

    @Override
    public int getItemCount() {
        return listSiswa.size();
    }
}