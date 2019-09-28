package com.example.foodwastemanage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    Button bt_login;
    EditText user_name,password;
    String userName,pass,type4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt_login=findViewById(R.id.Bt_login);
        user_name=findViewById(R.id.User_name);
        password=findViewById(R.id.Password);

       String type3 = getIntent().getStringExtra("type");
       type4=type3;
//type="Mess";
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName=user_name.getText().toString().trim();
                FirebaseDatabase.getInstance().getReference().child("user")
                        .addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                                for(DataSnapshot snapshot:dataSnapshot.getChildren()){
                                    User user=snapshot.getValue(User.class);
                                    if(user_name.getText().toString().equals(user.getUsername()) && password.getText().toString().equals(user.getPassword()))
                                    {
                                      //Toast.makeText(LoginActivity.this,"Sucessful",Toast.LENGTH_SHORT).show();
                                        if (type4.equals("Mess")) {
                                            Intent intent=new Intent(LoginActivity.this,MessActivity.class);
                                            intent.putExtra("userName",userName);
                                            LoginActivity.this.startActivity(intent);

                                        } else if (type4 .equals("NGO")) {
                                            Intent intent=new Intent(LoginActivity.this,NGOActivity.class);
                                            intent.putExtra("userName",userName);
                                            LoginActivity.this.startActivity(intent);

                                        } else if (type4.equals("Animal")) {
                                            Intent intent=new Intent(LoginActivity.this,AnimalActivity.class);
                                            intent.putExtra("userName",userName);
                                            LoginActivity.this.startActivity(intent);

                                        }
                                    }
                                }

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError databaseError) {
                                Toast.makeText(LoginActivity.this,"UnSucessful",Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
    }
}
