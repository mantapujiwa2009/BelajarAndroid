package com.example.belajarandrobing;

import android.graphics.Paint;
import android.os.Bundle;
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
    }
}