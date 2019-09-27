package com.example.foodwastemanage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FeedbackActivity extends AppCompatActivity {

    ImageView happy,good,bad,sad,avg,done;
    TextView rate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        happy= findViewById(R.id.happy);
        sad =findViewById(R.id.sad);
        good=findViewById(R.id.good);
        bad=findViewById(R.id.bad);
        avg=findViewById(R.id.avg);
        done=findViewById(R.id.done);
        rate=findViewById(R.id.rate);
        done.setVisibility(View.GONE);
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate.setText("Happy thank you for feedback");
                done.setVisibility(View.VISIBLE);
            }
        });
        good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate.setText("Good thank you for feedback We Will improve");
                done.setVisibility(View.VISIBLE);

            }
        });
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate.setText("Bad , we will surely Improve");
                done.setVisibility(View.VISIBLE);
            }
        });
        avg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate.setText("Average , we will surely Improve");
                done.setVisibility(View.VISIBLE);
            }
        });
        bad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rate.setText("Very Bad , we will surely Improve");
                done.setVisibility(View.VISIBLE);
            }
        });
    }
}
