package com.example.belajarandrobing;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSiswa extends AppCompatActivity {

    RecyclerView rvListsiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_siswa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rvListsiswa = (RecyclerView) findViewById(R.id.rvListsiswa);
        ArrayList<SiswaModel> listDataSiswa = new ArrayList<>();

        SiswaModel siswa1 = new SiswaModel("abel", "1", "mejobo");
        listDataSiswa.add(siswa1);

        SiswaModel siswa2 = new SiswaModel("Raka", "2", "garung lor");
        listDataSiswa.add(siswa2);

        SiswaModel siswa3 = new SiswaModel("Faraz", "19", "Jogja");
        listDataSiswa.add(siswa3);

        SiswaModel siswa4 = new SiswaModel("Kaisar", "17", "kudus");
        listDataSiswa.add(siswa4);

        SiswaModel siswa5 = new SiswaModel("Neal", "10", "taliwang");
        listDataSiswa.add(siswa5);

        SiswaModel siswa6 = new SiswaModel("Dafi", "23", "Kudus");
        listDataSiswa.add(siswa6);

        SiswaModel siswa7 = new SiswaModel("Bhumi", "8", "taliwang");
        listDataSiswa.add(siswa7);

        SiswaModel siswa8 = new SiswaModel("Samuel", "33", "Jepara");
        listDataSiswa.add(siswa8);

        SiswaModel siswa9 = new SiswaModel("Fatih", "4", "Kudus");
        listDataSiswa.add(siswa9);

        SiswaModel siswa10 = new SiswaModel("Bing", "35", "Jogja");
        listDataSiswa.add(siswa10);
    }
}