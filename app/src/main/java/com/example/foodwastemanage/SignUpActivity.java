package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity extends AppCompatActivity {
    DatabaseReference databaseinfo;
    EditText username,password,location,city,state,locality,pinCode,phone;
    ImageView imageView;
    Button selectPhoto,signupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        imageView=findViewById(R.id.imageView_photo);
        username=findViewById(R.id.editText_UserName);
        password=findViewById(R.id.editText_password);
        location=findViewById(R.id.editText_location);
        city=findViewById(R.id.editText_city);
        state=findViewById(R.id.editText_state);
        locality=findViewById(R.id.editText_locality);
        pinCode=findViewById(R.id.editText_pin);
        phone=findViewById(R.id.editText_phone);
        signupButton=findViewById(R.id.button_signUp);
       databaseinfo= FirebaseDatabase.getInstance().getReference("user");

        selectPhoto=findViewById(R.id.button_selectPhoto);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fill();
            }
        });
    }

    private void fill() {

        String username1 = username.getText().toString().trim();
        String password1 = password.getText().toString().trim();
        String city1 = city.getText().toString().trim();
        String state1 = state.getText().toString().trim();
        String locality1= locality.getText().toString().trim();
        String pinCode1=pinCode.getText().toString().trim();
        String phone1=phone.getText().toString().trim();

        if(!TextUtils.isEmpty(username1)){
            String roll=databaseinfo.push().getKey();
            User user=new User(username1,password1,"Mess","xyz",pinCode1,locality1,state1,city1,"mansi","shalini",phone1);
            databaseinfo.child(roll).setValue(user);

            Toast.makeText(this,"Profile added",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Username required",Toast.LENGTH_SHORT).show();
        }

    }
}
