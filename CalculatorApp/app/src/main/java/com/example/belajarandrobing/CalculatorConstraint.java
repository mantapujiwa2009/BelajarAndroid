package com.example.belajarandrobing;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculatorConstraint extends AppCompatActivity {

    EditText edAngkaC1;
    EditText edAngkaC2;
    Button btnPlus;
    Button btnMin;
    Button btnMult;
    Button btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator_constraint);

        edAngkaC1 = (EditText) findViewById(R.id.edAngkaC1);
        edAngkaC2 = (EditText) findViewById(R.id.edAngkaC2);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMin = (Button) findViewById(R.id.btnMin);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);


    }
}