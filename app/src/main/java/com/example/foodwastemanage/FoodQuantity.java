package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FoodQuantity extends AppCompatActivity {

    TextView t1,t2;
    EditText ngofoodgravy,ngofoodbread,animalfood;
    Button submitFood;
    int gravy,bread,animalfoodItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_quantity);
        t1=findViewById(R.id.ngofood);
        t2=findViewById(R.id.animalfood);
        ngofoodgravy=findViewById(R.id.ngofoodGravy);
        ngofoodbread=findViewById(R.id.ngofoodBread);
        animalfood=findViewById(R.id.animalfooditem);
        submitFood=findViewById(R.id.submitFood);

        submitFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravy= Integer.parseInt(ngofoodgravy.getText().toString().trim());
                bread=Integer.parseInt(ngofoodbread.getText().toString().trim());
                animalfoodItem=Integer.parseInt(animalfood.getText().toString().trim());

            }
        });

    }
}

