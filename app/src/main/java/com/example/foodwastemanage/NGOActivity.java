package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NGOActivity extends AppCompatActivity {

    Button feedback,chooseMess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo);
        feedback=findViewById(R.id.GiveFeedback);
        chooseMess=findViewById(R.id.ChooseMess);
        chooseMess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(NGOActivity.this,MessListChoose.class);
                NGOActivity.this.startActivity(intent);
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NGOActivity.this,MessListFeedback.class);
                NGOActivity.this.startActivity(intent);
            }
        });
    }
}
