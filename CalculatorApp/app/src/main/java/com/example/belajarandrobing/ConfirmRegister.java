package com.example.belajarandrobing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfirmRegister extends AppCompatActivity {

    TextView tvUser;
    TextView tvEmail;
    TextView tvPass;
    TextView tvPhone;

    Button btnYes;
    Button btnNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirm_register);

        tvUser = (TextView) findViewById(R.id.tvUser);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvPass = (TextView) findViewById(R.id.tvPassword);
        tvPhone = (TextView) findViewById(R.id.tvPhone);
        btnYes = (Button)findViewById(R.id.btnYes);
        btnNo = (Button)findViewById(R.id.btnNo);

        String username = getIntent().getStringExtra("user");
        String email = getIntent().getStringExtra("email");
        String pass = getIntent().getStringExtra("pass");
        String phone = getIntent().getStringExtra("phone");

        tvUser.setText("Username : "+username);
        tvEmail.setText("Email : "+email);
        tvPass.setText("Password : "+pass);
        tvPhone.setText("Phone number : "+phone);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(ConfirmRegister.this, Calculator.class));
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConfirmRegister.this, RegisterPage.class));
            }
        });

    }
}