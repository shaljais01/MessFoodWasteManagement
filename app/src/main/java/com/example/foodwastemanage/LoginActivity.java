package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button bt_login;
    EditText user_name,password;
    String userName,pass,type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt_login=findViewById(R.id.Bt_login);
        user_name=findViewById(R.id.User_name);
        password=findViewById(R.id.Password);
        Intent intent = getIntent();
        type = intent.getStringExtra("type");
    }
}
