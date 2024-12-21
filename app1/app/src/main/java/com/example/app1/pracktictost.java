package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pracktictost extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pracktictost);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);


        b1.setOnClickListener(view -> {

            Toast.makeText(this, "button 1 clicked", Toast.LENGTH_SHORT).show();
        });
        b2.setOnClickListener(view -> {

            Toast.makeText(this, "button 2 clicked", Toast.LENGTH_SHORT).show();
        });
        b3.setOnClickListener(view -> {

            Toast.makeText(this, "button 3 clicked", Toast.LENGTH_SHORT).show();
        });
        b4.setOnClickListener(view -> {

            Toast.makeText(this, "button 4 clicked", Toast.LENGTH_SHORT).show();
        });


    }
}