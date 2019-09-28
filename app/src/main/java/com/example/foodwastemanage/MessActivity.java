package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MessActivity extends AppCompatActivity {

    Button bt_enterFood,bt_updateProfile,bt_viewReview;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess);
        bt_enterFood=findViewById(R.id.enter_food);
        bt_updateProfile=findViewById(R.id.update_profile);
        bt_viewReview=findViewById(R.id.view_review);

        Intent intent = getIntent();
        userName = intent.getStringExtra("userName");
        bt_enterFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MessActivity.this,FoodQuantity.class);
                intent.putExtra("userName",userName);
                MessActivity.this.startActivity(intent);
            }
        });
        bt_updateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessActivity.this,UpdateProfileActivity.class);
                intent.putExtra("userName",userName);
                MessActivity.this.startActivity(intent);

            }
        });
        bt_viewReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
