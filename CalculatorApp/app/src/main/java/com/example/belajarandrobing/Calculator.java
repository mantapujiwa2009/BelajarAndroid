package com.example.belajarandrobing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculator extends AppCompatActivity {

    Button btnTambah;
    Button btnKurang;
    Button btnKali;
    Button btnBagi;
    Button btnClear;
    EditText edAngka1;
    EditText edAngka2;

    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnClear = (Button) findViewById(R.id.btnClear);
        edAngka1 = (EditText) findViewById(R.id.edAngka1);
        edAngka2 = (EditText) findViewById(R.id.edAngka2);
        tvHasil = (TextView) findViewById(R.id.tvHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angka1 = Float.parseFloat(edAngka1.getText().toString());
                float angka2 = Float.parseFloat(edAngka2.getText().toString());

                double hasil = angka1 + angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angka1 = Float.parseFloat(edAngka1.getText().toString());
                float angka2 = Float.parseFloat(edAngka2.getText().toString());

                double hasil = angka1 - angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angka1 = Float.parseFloat(edAngka1.getText().toString());
                float angka2 = Float.parseFloat(edAngka2.getText().toString());

                double hasil = angka1 / angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angka1 = Float.parseFloat(edAngka1.getText().toString());
                float angka2 = Float.parseFloat(edAngka2.getText().toString());

                double hasil = angka1 * angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edAngka1.setText("");
                edAngka2.setText("");
                tvHasil.setText("Hasil");
            }
        });
    }
}