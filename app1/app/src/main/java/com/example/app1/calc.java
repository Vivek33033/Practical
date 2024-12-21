package com.example.app1;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calc extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    EditText et1,et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);

        tv=findViewById(R.id.tv);

        btn1.setOnClickListener(view -> {
            String str1=et1.getText().toString();
            String str2=et1.getText().toString();

            if (TextUtils.isEmpty(str1)) {
                Toast.makeText(this, "Plese enter number1", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no1");
            }
            else if (TextUtils.isEmpty(str2)){
                Toast.makeText(this, "Plese enter number2", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no2");
            }else {
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);

                int result=n1+n2;
                tv.setText("answer is : "+result);
            }
        });
        btn1.setOnClickListener(view -> {
            String str1=et1.getText().toString();
            String str2=et1.getText().toString();

            if (TextUtils.isEmpty(str1)) {
                Toast.makeText(this, "Plese enter number1", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no1");
            }
            else if (TextUtils.isEmpty(str2)){
                Toast.makeText(this, "Plese enter number2", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no2");
            }else {
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);

                int result=n1-n2;
                tv.setText("answer is : "+result);
            }
        });
        btn1.setOnClickListener(view -> {
            String str1=et1.getText().toString();
            String str2=et1.getText().toString();

            if (TextUtils.isEmpty(str1)) {
                Toast.makeText(this, "Plese enter number1", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no1");
            }
            else if (TextUtils.isEmpty(str2)){
                Toast.makeText(this, "Plese enter number2", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no2");
            }else {
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int result=n1*n2;
                tv.setText("answer is : "+result);
            }
        });
        btn1.setOnClickListener(view -> {
            String str1=et1.getText().toString();
            String str2=et1.getText().toString();

            if (TextUtils.isEmpty(str1)) {
                Toast.makeText(this, "Plese enter number1", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no1");
            }
            else if (TextUtils.isEmpty(str2)){
                Toast.makeText(this, "Plese enter number2", Toast.LENGTH_SHORT).show();
                et1.setError("Plese Enter no2");
            }else {
                double n1=Double.parseDouble(str1);
                double n2=Double.parseDouble(str2);

                double result=n1/n2;
                tv.setText("answer is : "+result);
            }
        });
    }
}