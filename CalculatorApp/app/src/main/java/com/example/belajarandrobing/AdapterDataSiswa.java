package com.example.belajarandrobing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterDataSiswa extends RecyclerView.Adapter<AdapterDataSiswa.ViewHolder> {

    private List<SiswaModel> listSiswa;
    private OnItemClickListener listener;
    public interface OnItemClickListener {
        void onItemClick(SiswaModel siswa);
    }

    // constructor
    public AdapterDataSiswa(List<SiswaModel> listSiswa, OnItemClickListener listener) {

        this.listSiswa = listSiswa;
        this.listener = listener;
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        TextView tvAbsen;
        TextView tvAlamat;
        ImageView imgProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.txtNama);
            tvAbsen = itemView.findViewById(R.id.txtAbsen);
            tvAlamat = itemView.findViewById(R.id.txtAlamat);
            imgProfile = itemView.findViewById(R.id.imgProfile);
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
        String absen = listSiswa.get(position).getAbsen();
        String alamat = listSiswa.get(position).getAlamat();
        int profile = listSiswa.get(position).getProfile();

        holder.tvNama.setText(nama);
        holder.tvAbsen.setText(absen);
        holder.tvAlamat.setText(alamat);
        holder.imgProfile.setImageResource(profile);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(listSiswa.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSiswa.size();
    }
}