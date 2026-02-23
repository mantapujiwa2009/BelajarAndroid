package com.example.belajarandrobing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterPage extends AppCompatActivity {

    Button Registerbtn;

    Button btnSteam;

    EditText edUser;
    EditText edEmail;
    EditText edPassword;
    EditText edConfirmPass;
    EditText edPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_page);

        Registerbtn = (Button) findViewById(R.id.Registerbtn);
        btnSteam = (Button) findViewById(R.id.btnSteam);
        edUser = (EditText)findViewById(R.id.edUser);
        edEmail = (EditText)findViewById(R.id.edEmail);
        edPassword = (EditText)findViewById(R.id.edPass);
        edConfirmPass = (EditText)findViewById(R.id.edConfirmPass);
        edPhone = (EditText)findViewById(R.id.edPhone);

        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUser.getText().toString();
                String email = edEmail.getText().toString();
                String pass = edPassword.getText().toString();
                String confirmPass = edConfirmPass.getText().toString();
                String phone = edPhone.getText().toString();

                if (pass.equals(confirmPass)){
                  Intent intent = new Intent(RegisterPage.this, ConfirmRegister.class);
                  intent.putExtra("user", username);
                  intent.putExtra("email", email);
                  intent.putExtra("pass", pass);
                  intent.putExtra("phone", phone);
                  startActivity(intent);
                }else {
                    Toast.makeText(RegisterPage.this, "Password Tidak Sama", Toast.LENGTH_SHORT).show();
                    edConfirmPass.setText("");
            }
        }});
        btnSteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterPage.this, CloningSteam.class));
            }
        });
    }
}