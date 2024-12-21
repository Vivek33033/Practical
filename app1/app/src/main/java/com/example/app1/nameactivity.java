package com.example.app1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class nameactivity extends AppCompatActivity {

    Button btnclick;
    EditText etname;
    TextView tvname;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nameactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvname=findViewById(R.id.tvname);
        etname=findViewById(R.id.etname);
        btnclick=findViewById(R.id.btnclick);

        btnclick.setOnClickListener(view -> {
            String name=etname.getText().toString();
            tvname.setText("This name is "+ name);
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        });

    }
}