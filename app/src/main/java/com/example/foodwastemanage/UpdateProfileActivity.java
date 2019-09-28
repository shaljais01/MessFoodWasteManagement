package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class UpdateProfileActivity extends AppCompatActivity {

    ImageView photo;
    Button changePhoto,saveChanges;
    EditText userName,password,locality,pin,city,state,phone;
    String userName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        userName=findViewById(R.id.et_UserName);
        password=findViewById(R.id.et_password);
        locality=findViewById(R.id.et_locality);
        pin=findViewById(R.id.et_pin);
        city=findViewById(R.id.et_city);
        state=findViewById(R.id.et_state);
        phone=findViewById(R.id.et_phone);
        changePhoto=findViewById(R.id.bt_selectPhoto);
        saveChanges=findViewById(R.id.bt_save);
        photo=findViewById(R.id.img_photo);
        Intent intent = getIntent();
        userName2 = intent.getStringExtra("userName");
    }
}
