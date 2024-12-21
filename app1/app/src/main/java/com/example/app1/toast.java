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

public class toast extends AppCompatActivity {

    Button btn;
    Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_toast);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn=findViewById(R.id.btn1);

        btn.setOnClickListener(view -> {

            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
        });
        btn1=findViewById(R.id.btn2);

        btn1.setOnClickListener(view -> {

            Toast.makeText(this, "vivek", Toast.LENGTH_SHORT).show();
        });

    }
}