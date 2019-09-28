package com.example.foodwastemanage;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button bt_login,bt_signup;
    String type1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt_login=findViewById(R.id.Login);
        bt_signup=findViewById(R.id.SignUp);
      String type2=getIntent().getStringExtra("type");
       type1=type2;
        bt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,SignUpActivity.class);
                intent.putExtra("type",type1);

                Main2Activity.this.startActivity(intent);
            }
        });
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,LoginActivity.class);
               intent.putExtra("type",type1);

                Main2Activity.this.startActivity(intent);
            }
        });


    }
}