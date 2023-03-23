package com.example.phone_store_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    EditText username, password, email, phone, DOB, fullname;
    Button addBtn;
    TextView existedAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        username = findViewById(R.id.username);
        addBtn = findViewById(R.id.registerBtn);
        existedAcc = findViewById(R.id.ExistedAccount);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().trim().isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Username is empty!", Toast.LENGTH_SHORT).show();
                }else if(password.getText().toString().trim().isEmpty()){
                    Toast.makeText(RegisterActivity.this,"Password is empty", Toast.LENGTH_SHORT).show();
                }else if(fullname.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Fullname is empty!", Toast.LENGTH_SHORT).show();
                } else if(email.getText().toString().isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Email is empty!", Toast.LENGTH_SHORT).show();
                }
                else{
                    finish();
                }
            }
        });

        existedAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
