package com.example.belajarandrobing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterPage extends AppCompatActivity {

    Button Registerbtn;

    Button btnSteam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_page);

        Registerbtn = (Button) findViewById(R.id.Registerbtn);
        btnSteam = (Button) findViewById(R.id.btnSteam);
        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterPage.this, MainActivity.class));
            }
        });
        btnSteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterPage.this, CloningSteam.class));
            }
        });
    }
}