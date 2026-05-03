package com.example.belajarandrobing;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CloningSteam extends AppCompatActivity {

    TextView txtNeedSign;

    TextView txtDontHave;

    TextView txtLearn;

    Button btnSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cloning_steam);

        txtNeedSign = (TextView) findViewById(R.id.txtneed);
        txtNeedSign.setPaintFlags(txtNeedSign.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txtDontHave = (TextView) findViewById(R.id.txtDontHave);
        txtDontHave.setPaintFlags(txtDontHave.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txtLearn = (TextView) findViewById(R.id.txtLearn);
        txtLearn.setPaintFlags(txtLearn.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        btnSiswa = (Button) findViewById(R.id.siswabtn);
        btnSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CloningSteam.this, ListSiswa.class));
            }
        });
    }
}