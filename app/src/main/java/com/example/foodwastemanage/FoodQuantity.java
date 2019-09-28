package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Timestamp;


public class FoodQuantity extends AppCompatActivity {
    DatabaseReference databaseinfo;
    TextView t1,t2;
    EditText ngofoodgravy,ngofoodbread,animalfood;
    Button submitFood;
    ImageView done;
    int gravy,bread,animalfoodItem;
    String userName;

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
        done=findViewById(R.id.done2);
        done.setVisibility(View.GONE);
        Intent intent=getIntent();
        userName=intent.getStringExtra("userName");
        databaseinfo= FirebaseDatabase.getInstance().getReference("mess");
        submitFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fill(userName);

            }
        });

    }
    private void fill(String userName) {


        gravy= Integer.parseInt(ngofoodgravy.getText().toString().trim());
        bread=Integer.parseInt(ngofoodbread.getText().toString().trim());
        animalfoodItem=Integer.parseInt(animalfood.getText().toString().trim());

        Long timelong=System.currentTimeMillis();

        String time=timelong.toString();
            String roll=databaseinfo.push().getKey();
            MessDb mess=new MessDb(userName,gravy,bread,animalfoodItem,time);
            databaseinfo.child(roll).setValue(mess);

            t1.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
            ngofoodbread.setVisibility(View.GONE);
            ngofoodgravy.setVisibility(View.GONE);
            animalfood.setVisibility(View.GONE);
            submitFood.setVisibility(View.GONE);
            done.setVisibility(View.VISIBLE);


    }
}

